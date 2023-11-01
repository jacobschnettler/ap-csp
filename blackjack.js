// Made by Jacob Schnettler
// 10/29/23
// AP CSP 2023

var balance = 1000; // starting balance defined in the project outline

var exited = false; // exit variable, user can exit game to escape while loop & avoid infinite loop

const hr = () => println("--------------------------"); // Horizontal Rule function, similar to HTML <hr> tag, to create new lines

function outputRules() {
    // Credits
    println("Blackjack");
    println("Made by Jacob Schnettler");
    println("\n");

    // Rules array defined in project outline
    const rules = [
        "Allow them to bet before each round.",
        "Cards will be numbers 1 through 10. (They are lots of 1's, 2's, 3's etc...",
        "The user inputs how many cards they want.",
        "The computer always gets 3 cards.",
        "If user's total goes over 21 and the player has not gone over 21, the player wins.",
        "If both the user and computer are not over 21 then winner is the highest total.",
        "A win and they win their bet.",
        "A loss and they lose their bet.",
        "A tie means the user does not win or lose, their money is unchanged.",
    ];

    println("---------- Rules ---------");

    println("\n");

    // map rules array and log each string
    rules.map((rule) => println(`● ${rule}`));

    println("\n");

    hr();

    println("\n");
}

// function that can be called to output chips/balance
function outputBalance() {
    println(`Chip Balance: $${balance}`);
    println("\n");
}

// function that requires a "cardCount" which the user inputs in line 68.
function getDeckScore(cardCount) {
    var _cards = [];

    // add random int to array to be added to the sum of all cards
    for (var i = 0; i < cardCount; i++) _cards.push(Randomizer.nextInt(1, 10) /* random int, 1-10*/);

    // counts sum of array
    var userScore = _cards.reduce((accumulator, value) => {
        return accumulator + value;
    }, 0);

    return { 
        userScore: userScore,
        cards: _cards
    };
}

// function to get user input on start of each round of blackjack
function getBetAndCards() {
    var bet = readInt("What amount do you want to bet? ");

    println("\n");

    var cards = readInt("Choose how many cards? ");

    var { userScore, cards } = getDeckScore(cards);

    // returns object with function data
    return {
        userScore: userScore,
        userCards: cards,
        bet: bet,
    };
}

// function to be called on player win
function playerWin(bet) {
    balance = balance + bet;

    println(`You won, you now have ${balance} chips.\n`);
}

// function to be called when dealer wins
function dealerWin(bet) {
    balance = balance - bet;

    println(`The dealer won, you now have ${balance} chips.\n`);
}

// function to determine the outcome of the round, based on the playerScore & dealerScore. Bet is also required to pass to outcome functions (playerWin, dealerWin)
function decideOutcome(playerScore, dealerScore, bet) {
    // round results in tie
    if (playerScore == dealerScore)
        return println(
            "The outcome has resulted in a tie. Neither the dealer nor the player wins.\n",
        );

    // dealer wins, player score is above 21 (bust)
    if (playerScore > 21) return dealerWin(bet);

    // dealers score is over 21 (busted) & player score is > 21
    if (dealerScore > 21 && playerScore < 21) return playerWin(bet);

    // determine winner when no tie nor a player has busted
    return playerScore > dealerScore ? playerWin(bet) : dealerWin(bet);
}

// extra credit drawCard function
function drawCard(num)
{
    if (num >= 10) {
        // if num is greater than 10, fix double digit formatting
        println("-------");
        println("|     |");
        println(`| ${num}  |`);
        println("|     |");
        println("-------");
        println("\n");
    } else {
        println("-------");
        println("|     |");
        println(`|  ${num}  |`);
        println("|     |");
        println("-------");
        println("\n");
    }
}

function start() {
    outputRules(); // rules function, defined in the project outline.

    // while loop to run round after round, while balance != 0 & the player has not exited
    while (balance > 0 && !exited) {
        outputBalance();

        const { bet, userScore, userCards } = getBetAndCards();

        const { userScore: dealerScore, cards: dealerCards } = getDeckScore(3);

        println("\n");

        hr();

        println("\n");

        println("Your Cards")

        println("\n");
        
        for(var i = 0; i < userCards.length; i++)
            drawCard(userCards[i]);

        println("\n");

        println("Dealer Cards")

        println("\n");
        
        for(var i = 0; i < dealerCards.length; i++)
            drawCard(dealerCards[i]);

        println(`Your Score: ${userScore}`);

        println("\n");

        println(`Dealer Score: ${dealerScore}`);

        println("\n");

        println(`Chip Bet: ${bet}`);

        println("\n");

        decideOutcome(userScore, dealerScore, bet);

        hr();

        if (balance == 0) {
            println("\nThe game has ended because you ran out of chips.");
        } else {
            var response = readLine(
                '\nDo you want to continue playing? Type "exit" to exit, otherwise type any characters. \n',
            );

            if (response == "exit") exited = true;
        }
    }
}