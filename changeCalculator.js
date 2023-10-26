var quarters = 0;
var dimes = 0;
var nickels = 0;
var pennys = 0;

var _coins = readInt("How many cents do you have? ");

println("")

var _amountOfQuarters = Math.floor(_coins / 25);

quarters = _amountOfQuarters;

_coins = _coins - (_amountOfQuarters * 25.0);

var _amountOfDimes = Math.floor(_coins / 10);

dimes = _amountOfDimes;

_coins = _coins - (_amountOfDimes * 10.0);

var _amountOfNickels = Math.floor(_coins / 5)

nickels = _amountOfNickels;

_coins = _coins - (_amountOfNickels * 5.0);

var _amountOfPennys = Math.floor(_coins / 1)

pennys = _amountOfPennys;

_coins = _coins - (_amountOfPennys * 1.0);

println("Quarters: " + quarters);
println("Dimes: " + dimes);
println("Nickels: " + nickels);
println("Pennys: " + pennys);