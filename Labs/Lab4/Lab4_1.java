import java.awt.*;

public class Lab4_1 {
    public static void main(String[] args) {
        // creates drawing panel with the instructed size
        DrawingPanel panel = new DrawingPanel(400, 300);
        // filling the background color
        panel.setBackground(Color.ORANGE);
        // calling the graphics object
        Graphics g = panel.getGraphics();
        // a method is created that uses g, x, and y as it's parameters
        drawBox(g, 50, 50);
        drawBox(g, 250, 10);
        drawBox(g, 180, 115);
    }

    public static void drawBox(Graphics g, int x, int y) {
        //a loop is created that prints 5 rectangles 
        for (int i = 1; i <= 5; i++) {
            g.setColor(Color.RED);
            g.drawRect(x,y,i*20,i*20); //the length and width get larger by 20px everytime
            
            g.setColor(Color.BLACK);
            g.drawLine(x,y,x+i*20,y+i*20); //the endpoints x and y gets larger by 20px everytime
        }
    }
}