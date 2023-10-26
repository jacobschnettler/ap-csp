// Jacob Schnettler, Nicholas Ingram

function dropBalls() {
    for (var i = 0; i < 10; i++)
        putBall();
}

function createRow() {
    for (var i = 0; i < 4; i++) {
        dropBalls();
        move();
    }
    dropBalls();
}

function moveUpLeft() {
    turnLeft();
    move();
    turnLeft();
    createRow();
}

function moveUpRight() {
    turnRight();
    move();
    turnRight();
    createRow();
}

function start() {
    createRow();
    for (var i = 0; i < 2; i++) {
        moveUpLeft();
        moveUpRight();
    }
}