// Jacob Schnettler 10/4/23
// Karel finds his ball 100pt

function returnToOwner() {
    if (notFacingSouth()) {
        turnLeft();
        returnToOwner();
    }
    
    while (frontIsClear()) 
        move();
    
    while (notFacingWest())
        turnLeft();
        
    if (frontIsBlocked()) {
        putBall();
    }
}

function start() {
    let searching = true;

    while (notFacingEast())
        turnLeft();
        
    while (searching) {
        while (searching && frontIsClear()) {
            if (ballsPresent()) { 
                takeBall();
            
                searching = false;
                
                return returnToOwner();
            }
        
            move();
        }
        
            
        if (facingEast()) {
            turnLeft();
            if (frontIsClear()) move();
            turnLeft();   
        } else {
            turnRight();
            if (frontIsClear()) move();
            turnRight();  
        }
    }
}

start();