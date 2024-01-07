import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A program that uses for loops, if statements and nested loops to form interesting patterns.
   * @author: L. Wong
   */

  public void settings() {

    // indicating the size
    size(1200, 600);
  }

  public void setup() {

    // initializing background
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * Draws the bottom left section.
   */
  public void draw_section1(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow += 2){
      for(int intColumn = 0; intColumn < 60; intColumn += 2){
        intX = 3 + intRow * 5;  
        intY = 300 + 3 + intColumn * 5; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Draws the bottom middle left section. 
   */
  public void draw_section2(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow += 2){
      for(int intColumn = 0; intColumn < 60; intColumn += 2){
        intX = 300 + 3 + intRow * 5;  
        intY = 300 + 3 + intColumn * 5; 

      if (intRow % 4 != 2){
        fill(255);
      }
      else {
        fill(0); 
      }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }

  }

  /**
   * Draws the bottom middle right section.
   */
  public void draw_section3(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow += 2){
      for(int intColumn = 0; intColumn < 60; intColumn += 2){
        intX = 600 + 3 + intRow * 5;  
        intY = 300 + 3 + intColumn * 5; 

      if (intColumn % 4 != 2){
        fill(0);
      }
      else {
        fill(255); 
      }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Draws the bottom right section. 
   */
  public void draw_section4(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 60; intRow += 2){
      for(int intColumn = 0; intColumn <= 60; intColumn += 2){
        intX = 900 + 3 + intRow * 5;  
        intY = 300 + 3 + intColumn * 5; 

      if (intColumn % 4 != 0 && intRow % 4 != 2){
        fill(255);
      }
      else {
        fill(0); 
      }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Draws the top left section.
   */
  public void draw_section5(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 60; intRow > 0; intRow -= 2){
      for(int intColumn = 60; intColumn > 58 - intRow; intColumn -= 2){
        intX = 3 + intRow * 5;  
        intY = 3 + intColumn * 5; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }   
  }

  /**
   * Draws the top middle left section.
   */
  public void draw_section6(){

    // intitializing variables  
    int intX = 0;
    int intY = 0;
  
    for(int intColumn = 0; intColumn < 60; intColumn += 2){
      for(int intRow = 0; intRow <= intColumn; intRow += 2){
        intX = 300 + 3 + intRow * 5;  
        intY = 3 + intColumn * 5; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }

    }   
  }

  /**
   * Draws the top middle right section.
   */
  public void draw_section7(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;
  
    for(int intRow = 0; intRow < 60; intRow += 2){
      for(int intColumn = 0; intColumn < 60 - intRow; intColumn += 2){
        intX = 3 + 600 + intRow * 5;  
        intY = 3 + intColumn * 5; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }   

  }
  
  /**
   * Draws the top right section.
   */
  public void draw_section8(){

    // intitializing variables 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow <= 60; intRow += 2){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 2){
        intX = 900 + 3 + intRow * 5;  
        intY = 3 + intColumn * 5; 


        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }

    }   
  }

}
