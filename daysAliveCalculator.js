var dayBorn = readInt("Enter the day you were born (1 through 31) ")
var monthBorn = readInt("Enter the month you were born (1 through 12) ")
var yearBorn = readInt("Enter the year you were born ")

var daysInYear = 365.25
var daysInMonth = 30

var currentYear = 2023
var currentMonth = 10
var currentDay = 10

var yearsAlive = currentYear - yearBorn

println((yearsAlive) * daysInYear + (currentMonth - monthBorn) * daysInMonth + (currentDay - dayBorn))