// Jacob Schnettler
// 11/22/23 
// Police Sketch Program - 100pts
function drawFaceShape(faceType, faceColor) 
{
    // Extra Credit
    var color = faceColor == 'Y' ? Color.yellow : faceColor == 'W' ? Color.white : new Color(66,66,66);
    
    switch (faceType.toUpperCase()) {
        case 'R':
        	var circle = new Circle(120);
        	
        	circle.setPosition(170, 150);
        	
        	circle.setColor(color);
        	
        	add(circle);
            break;
            
        case 'O':
        	var oval = new Oval(265, 180);
        	
        	oval.setPosition(170, 150);
        	
        	oval.setColor(color);
        	
        	add(oval);
            
            break;
        case 'S':
        	var rect = new Rectangle(220, 220);
        	
        	rect.setPosition(170 - 110, 150 - 90);
        	
        	rect.setColor(color);
        	
        	add(rect);
            
            break;
    }
}
function drawEyes(eyes) 
{
    switch(eyes.toUpperCase()) {
        case "G":
            var circle1 = new Circle(40);
        	
        	circle1.setPosition(110, 120);
        	
        	circle1.setColor(Color.black);
        	
        	add(circle1);
        	
            var circle2 = new Circle(40);
        	
        	circle2.setPosition(230, 120);
        	
        	circle2.setColor(Color.black);
        	
        	add(circle2);
        	
        	var rect = new Rectangle(240, 25);
        	
        	rect.setPosition(170 - 120, 105);
        	
        	rect.setColor(Color.black);
        	
        	add(rect);
            
            break;
            
        case "O":    
            var circle1 = new Oval(80, 40);
        	
        	circle1.setPosition(110, 120);
        	
        	circle1.setColor(Color.black);
        	
        	add(circle1);
        	
            var circle2 = new Oval(80, 40);
        	
        	circle2.setPosition(230, 120);
        	
        	circle2.setColor(Color.black);
        	
        	add(circle2);
                
            break;
            
        case "R":    
            var circle1 = new Circle(35);
        	
        	circle1.setPosition(110, 120);
        	
        	circle1.setColor(Color.black);
        	
        	add(circle1);
        	
            var circle2 = new Circle(35);
        	
        	circle2.setPosition(230, 120);
        	
        	circle2.setColor(Color.black);
        	
        	add(circle2);
                
            break;
            
        case "B":    
            var circle1 = new Circle(15);
        	
        	circle1.setPosition(110, 120);
        	
        	circle1.setColor(Color.black);
        	
        	add(circle1);
        	
            var circle2 = new Circle(15);
        	
        	circle2.setPosition(230, 120);
        	
        	circle2.setColor(Color.black);
        	
        	add(circle2);
                
            break;
    }
}
function drawNose(nose) 
{
    switch (nose.toUpperCase()) {
        case 'L':
            var rect = new Rectangle(25, 60);
        	
        	rect.setPosition(170 - 15, 135);
        	
        	rect.setColor(Color.black);
        	
        	add(rect);
            
            break;
            
        case 'B':
            var rect = new Rectangle(25, 60);
        	
        	rect.setPosition(170 - 15, 135);
        	
        	rect.setColor(Color.black);
        	
        	add(rect);
        	
            var circle1 = new Circle(22);
        	
        	circle1.setPosition(168, 165);
        	
        	circle1.setColor(Color.black);
        	
        	add(circle1);
            
            break;
            
        case 'P':
            var polygon = new Polygon();
        
            var multiplier = 120;
        
            polygon.addPoint(20 + multiplier - 10, 20 + multiplier + 20);
            polygon.addPoint(100 + multiplier - 10, 20 + multiplier + 20);
            polygon.addPoint(60 + multiplier - 10, 80 + multiplier + 20);
            
            polygon.setColor(Color.black);
            
            add(polygon);
            
            break;
    }
}
function drawMouth(mouth) 
{
    switch (mouth.toUpperCase()) {
        case "T":
            var rect = new Rectangle(120, 6);
        	
        	rect.setPosition(170 - 60, 230);
        	
        	rect.setColor(Color.black);
        	
        	add(rect);
            
            break;
            
        case "F":
            var rect = new Rectangle(120, 20);
        	
        	rect.setPosition(170 - 60, 230);
        	
        	rect.setColor(Color.black);
        	
        	add(rect);
            
            break;
            
        case "P":
            var myArc = new Arc(30, 0, 180, 0);
            
            myArc.setPosition(175, 260);
            
            myArc.setColor(Color.black);
        	
        	add(myArc);
            
            break;
    }
}
function drawHair(hairStyle, color) 
{
    var color = color == "B" ? Color.black : color == "R" ? Color.red : color == "BR" ? new Color(165,42,42) : color == "BL" ? Color.orange : Color.black;
    
    switch (hairStyle) {
        case "B":
            break;
            
        case "L":
            var myArc = new Arc(110, 0, 180, 0);
            
            myArc.setPosition(160, 80);
            
            myArc.setColor(color);
        	
        	add(myArc);
            
            break;
            
        case "C":
        	var rect = new Rectangle(150, 25);
        	
        	rect.setPosition(90, 20);
        	
        	rect.setColor(color);
        	
        	add(rect)
            
            break;
            
        case "S":
            var myArc = new Arc(110, 0, 180, 0);
            
            myArc.setPosition(160, 80);
            
            myArc.setColor(color);
        	
        	add(myArc);
        	
        	var rect = new Rectangle(15, 250);
        	
        	rect.setPosition(40, 70);
        	
        	rect.setColor(color);
        	
        	add(rect)
        	
        	var rect = new Rectangle(15, 250);
        	
        	rect.setPosition(265, 70);
        	
        	rect.setColor(color);
        	
        	add(rect)
            
            break;
            
            // Extra Credit curly hair
        case "CH":
            for(var i = 0; i < 10; i++)
                {
                    var circle1 = new Circle(Randomizer.nextInt(10, 30));
                	
                	circle1.setPosition(90 + (i * 25), 70);
                	
                	circle1.setColor(color);
                	
                	add(circle1)
                }
            
            break;
    }
}
function initGraphics() 
{
    var background = new Rectangle(800, 300);
	
	background.setPosition(0, 0);
	
	background.setColor(Color.gray);
    
    add(background);
}
function start() 
{
    initGraphics();
    
    println("Police Sketch Program. Enter the correct letter when prompted.");
    
    // extra credit
    var faceColor = readLine("Enter face color (W - White, Y - Yellow, B - BLack) ");
    var faceType = readLine("Enter face type (R - Round, O - Oval, S - Square Jaw) ");
    var eyes = readLine("Enter eyes (G - Glasses, B - Beaty, R - Round, O - Oval) ");
    var nose = readLine("Enter nose (L - Long, B - Bulbous, P - Pointy) ");
    var mouth = readLine("Enter Mouth (T - Thin, F - Full Lips, P - Pouty) ");
    var hairColor = readLine("Enter hair color (B - Black, R - Red, BR - Brown, BL - Blonde) ");
    var hairStyle = readLine("Enter hair style (L - Long, B - Bald, C - Crew cut, S - Shoulder length, CH - Curly Hair) ");
      
    drawFaceShape(faceType, faceColor /*extra credit*/);
    drawEyes(eyes);
    drawNose(nose);
    drawMouth(mouth);
    drawHair(hairStyle, hairColor);
    
}
