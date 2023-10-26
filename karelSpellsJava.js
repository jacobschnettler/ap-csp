// Jacob Schnettler 
// 9-13-23

function drawJ()
{
    for (let i = 0; i < 5; i++)
    {
        putBall();
        move();
    }
    
    turnLeft();
    turnLeft();
    
    for (let i = 0; i < 3; i++)
    {
        move();
    }
    
    turnLeft();
    
    for (let i = 0; i < 5; i++)
    {
        move();
        putBall();
    }
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    for (let i = 0; i < 2; i++)
    {
        move();
        putBall();
    }
    
    turnLeft();
    turnLeft();
    
    for (let i = 0; i < 5; i++)
    {
        move();
    }
}

function drawA()
{
    turnLeft();
    
    for (let i = 0; i < 5; i++)
    {
        putBall();
        move();
    }
    
    turnLeft();
    turnLeft();
    
    move();
    
    turnLeft();
    
    for (let i = 0; i < 3; i++)
    {
        move();
        putBall();
    }
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    for (let i = 0; i < 4; i++)
    {
        move();
        putBall();
    }
    
    turnLeft();
    turnLeft();
    
    for (let i = 0; i < 2; i++)
    {
        move();
    }
    
    turnLeft();
    
    for (let i = 0; i < 2; i++)
    {
        move();
        putBall();
    }
    
    turnLeft();
    turnLeft();
}

function drawV()
{
    putBall();
    
    turnLeft();
    turnLeft();
    
    move();
    
    putBall();
    
    move();
    
    putBall();
    
    turnLeft();
    
    move();
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    move();
    
    putBall();
    
    turnLeft();
    
    move();
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    move();
    
    putBall();
    
    turnLeft();
    turnLeft();
    
    move();
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    move();
    
    putBall();
    
    move();
    
    turnLeft();
    
    move();
    
    putBall();
    move();
    putBall();
    move();
    putBall();
    
    turnLeft();
    turnLeft();

    for (let i = 0; i < 4; i++)
        move();
        
    turnLeft();
    
    move();
    move();
}

function start()
{
    //move();
    
    turnLeft();

    for (let i = 0; i < 7; i++)
        move();
        
    turnLeft();
    turnLeft();
    turnLeft();
        
    drawJ();
    drawA();
    
    for (let i = 0; i < 4; i++)
    {
        move();
    }
    
    turnLeft();
    
    for (let i = 0; i < 2; i++)
    {
        move();
    }
    
    drawV();
    drawA();
    
    move();
    move();
    
    turnLeft();
    turnLeft();
    turnLeft();
    
    move();
    move();
    
    move();
    move();
}