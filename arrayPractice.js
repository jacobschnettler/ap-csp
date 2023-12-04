function outputVert(anyArray) {
    for (var p = 0 ; p < anyArray.length; p ++)
        println(p + " " + anyArray[p]);
}

function outputHorizontal(anyArray) {
    for (var p = 0 ; p < anyArray.length; p ++)
        (p == 0 ? println : print)(p + " " + anyArray[p]);
        
    println("");
}

function addTen(anyArray) {
    var newArray = [];
    
    for (var i = 0; i < anyArray.length; i++)
        newArray[i] = anyArray[i] + 10;
        
    println(newArray);
        
    return newArray;
} 

function getSum(anyArray) {
    var sum = 0;
    
    for (var i = 0; i < anyArray.length; i++)
        sum = sum + anyArray[i];
    
    println(sum);
    
    return sum;
} 

function getAverage(anyArray) {
    var average = getSum(anyArray) / anyArray.length;
    
    println(average);
    
    return average;
}

function countNegitives(anyArray) {
    var ctr = 0;
    
    for (var i = 0; i < anyArray.length; i++)
        if (anyArray[i] < 0) 
        {
            ctr++;
        }
    
    println(ctr);
    
    return ctr;
} 

function getLowest(anyArray) {
    var sortedArray = anyArray.sort();
    
    var lowestNum = sortedArray[0];
    
    println(lowestNum);
    
    return lowestNum;
}

function outputLetterGrades(anyArray) {
    var Actr = 0, Bctr = 0, Cctr = 0, Dctr = 0, Fctr = 0;
    
    for (var i = 0; i < anyArray.length; i++)
        switch(anyArray[i]) {
            case "A":
                Actr++;
                
                break;
            case "B":
                Bctr++;
                
                break;
            case "C":
                Cctr++;
                
                break;
            case "D":
                Dctr++;
                
                break;
            case "F":
                Fctr++;
                
                break;
        }
        
    println(`A's: ${Actr}\nB's: ${Bctr}\nC's: ${Cctr}\nD's: ${Dctr}\nF's: ${Fctr}`)
}

outputVert([
    1,
    2,
    3
]);

outputHorizontal([
    1,
    2,
    3
]);

addTen([
    1,
    2,
    3
]);

getSum([
    1,
    2,
    3
]);

getAverage([
    1,
    2,
    3
]);

countNegitives([
    1,
    2,
    3,
    -2
]);

getLowest([1, 2, 4, 4, 4, 3, 4]);

outputLetterGrades([
    "A",
    "B",
    "C",
    "C",
    "A"
])
