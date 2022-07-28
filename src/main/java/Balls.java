import processing.core.PApplet;

public class Balls extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;

    public  static final int DIAMETER = 10;
    public  int xpos ;
    public  int ypos ;
    public  int speed;

    public static Balls[] four_Balls = new Balls[4];

    public Balls( int speed){
        this.xpos = 0;
        this.speed = speed;

    }
    public Balls(){

    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for(Balls ball : four_Balls){
            ball.xpos = ball.xpos + ball.speed;
            drawCircle(ball);
        }

    }

    private void drawCircle(Balls ball) {
        ellipse(ball.xpos, ball.ypos, DIAMETER, DIAMETER);
    }


    public static void main(String[] args) {
        PApplet.main("Balls",args);
        for(int i=0;i<4;i++){
            Balls ball = new Balls(i+1);
            ball.ypos = HEIGHT * (i + 1) / 5;
            four_Balls[i] = ball;
        }

    }

}