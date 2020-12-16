
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
//hi
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
    
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;
    

    Bubble bb1;
    Bubble bb2;
    Bubble bb3;
    Bubble bb4;

    Snowflake sf1;
    Snowflake sf2;
    Snowflake sf3;
    Snowflake sf4;
   
    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        b1 = new Ball(this);
        b2 = new Ball (this, 50, 50, 100, 30, 30, 50);
        b3 = new Ball (this);
        b4 = new Ball (this, 30, 30, 30, 50, 50, 50);
        
        bb1 = new Bubble(this);
        bb2 = new Bubble(this, 50, 10, 10, 40, 20, 20);
        bb3 = new Bubble(this, 40, 20, 20, 60);
        bb4 = new Bubble( 30, 50, 10, 10, this);

        sf1 = new Snowflake(this);
        sf2 = new Snowflake(this, 10, 10, 10, 10, -10);
        sf3 = new Snowflake(this, 15, 10, 20, 5, 10);
        sf4 = new Snowflake(this);
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();

        bb1.drawBubble();
        bb1.moveBubble();
        bb2.drawBubble();
        bb2.moveBubble();
        bb3.drawBubble();
        bb3.moveBubble();
        bb4.drawBubble();
        bb4.moveBubble();

        sf1.drawSnowflake();
        sf1.moveSnowflake();
        sf2.drawSnowflake();
        sf2.moveSnowflake();
        sf3.drawSnowflake();
        sf3.moveSnowflake();
        sf4.drawSnowflake();
        sf4.moveSnowflake();

    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    public void mousePressed(){
      b1.stop();
      b2.stop();
      b3.stop();
      b4.stop();
    }
    

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
