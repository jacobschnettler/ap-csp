println("Welcome to Hi-Lo!");
println("There is a 12-sided die numbered 1 through 12.");
println("The computer will roll the die. Your job is to");
println("guess if the next roll will be higher or lower.");
println("-----------------------------------------------");

var currentRoll = Randomizer.nextInt(1, 13);

var exited = false;

var count = 0;

while (!exited) {
    var nextRoll = Randomizer.nextInt(1, 13);
    
    println("The current roll is a " + (nextRoll));
    
    var guess = readLine("Will the next roll be higher or lower? ");

    if (guess) {
        if (nextRoll < currentRoll && guess.toLowerCase().startsWith("lower") 
            || nextRoll > currentRoll && guess.toLowerCase().startsWith("higher")) {
                println("Win streak!!!!")
            } else {
                exited = true;
                
                println("sorry bud.")
            }
        } else {
            exited = true;
        }
    
    count++;
}