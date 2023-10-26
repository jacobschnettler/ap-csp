var exited = false;

while (!exited) {
    var numOfBoxes = readInt("Enter the number of boxes to be shipped ")
    
    if (numOfBoxes == 0) exited = true;
    else {
        for(var i = 0; i < numOfBoxes; i++) {
            println("Joe's Shoe Store")
            println("15 Main St.")
            println("East, PA. 18045")
            println("Box # " + (i + 1) + " of " + numOfBoxes)
            println()
        }
    }
}