var operator = readLine("What operator? (+, -, *, /, p (power)) ");

var num1 = readInt("What is the first number? ");
var num2 = readInt("What is the second number? ");
 
function add(n1, n2) {
    return n1 + n2;
}
 
function subtract(n1, n2) {
    return n1 - n2;
}
 
function multiply(n1, n2) {
    return n1 * n2;
}
 
function divide(n1, n2) {
    return n1 / n2;
}

function numDigits(n) {
    return `${n}`.length;
}

function output(solution) {
    println("Solution: " + solution)
}

function power(base, exp) {
    var answer = 1;
    
    for (var p = 1; p <= exp; p++)
        answer = answer * base;
        
    return answer;
}
 
switch (operator) {
    case "+":
        output(add(num1, num2));
        
        break;
        
    case "-":
        output(subtract(num1, num2));
        
        break;
        
    case "*":
        output(multiply(num1, num2));
        
        break;
        
    case "/":
        output(divide(num1, num2));
        
        break;
        
    case "p":
        output(`${num1}^${num2} = ` + power(num1, num2));
        
        break;
        
    case "d":
        output(numDigits(num1, num2));
        
        break;
        
    default: 
        println("Invalid operation!");
        
        break;
}
