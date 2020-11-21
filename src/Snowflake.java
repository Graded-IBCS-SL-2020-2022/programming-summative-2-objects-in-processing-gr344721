/* YOU SHOULD COMPLETE AND UNDERSTAND THE Ball.java and Bubble.java parts first! */
/* DON'T FORGET TO RENAME THE FILE TO Snowflake.java WHEN READY TO TEST! */

class Snowflake {
    private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col; 
    private float speedY;
    private float speedX;

    public Snowflake(Sketch s){
      this.s = s;
      diameter = s.random(5,25);
      x = s.random(diameter / 2, s.width - diameter / 2);
      y = s.random(diameter / 2, s.height - diameter / 2);
      col = s.color(137,209,254);
      speedX = 5;
      speedY = 10;
    }

    public Snowflake(Sketch s, float diam, float X, float Y, float sx, float sy) {
      this.s = s;
      diameter = diam;
      x = X;
      y = Y;
      col = s.color(137,209,254);
      speedX = sx;
      speedY = sy;
    }

    public float getRadius() {
      return (diameter / 2);
    }
    /* SUMMATIVE REQUIRED Implement this entire class. ONLY drawSnowflake() and
     * moveSnowflake() have been implemented for you! I recommend using your
     * Bubble.java as a template. Start by creating your instance variables and
     * constructors.
     */

    /** Draws the flake. */
    public void drawSnowflake() {
        s.stroke(col);
        s.line(x - getRadius() / 2, y - getRadius() / 2, x + getRadius() / 2, y + getRadius() / 2);
        s.line(x - getRadius() / 2, y + getRadius() / 2, x + getRadius() / 2, y - getRadius() / 2);
        s.line(x - getRadius(), y, x + getRadius(), y);
        s.line(x, y - getRadius(), x, y + getRadius());
    }

    /** Moves the flake */
    public void moveSnowflake() {
       
        if (x > (s.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y < (-getRadius())) {
            y = s.height + getRadius();
        }
        if (y > (s.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
