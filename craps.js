var balance = 10000;

println("You start with 10,000$ and are now playing craps.");

var started = readLine('To begin type "start"').toLowerCase() == "start";

while (started) {
    var wager = readInt("What wager do you want too make? Type -1 to exit. ");

    if (wager == -1) { started = false; } else {
        var passBet = readBoolean("Type true for pass bet, and false for dont pass bet. ")

        println(passBet ? `Pass bet with ${wager} wager.` : `Don't Pass bet with ${wager} wager.`)

        var diceRolls = [Randomizer.nextInt(1, 6), Randomizer.nextInt(1, 6)];

        println(`You rolled a ${diceRolls[0]} and ${diceRolls[1]}`);

        var winner = false;

        if (passBet) {

        } else {

        }
    }
}