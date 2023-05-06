import java.awt.*;

public class Lab4_2 {
    public static void main(String[] args) {
        // creates drawing panel with the instructed size
        DrawingPanel panel = new DrawingPanel(400, 300);
        // filling the background color
        panel.setBackground(Color.ORANGE);
        // calling the graphics object
        Graphics g = panel.getGraphics();
        // a method is created that uses g, x, y, and size as it's parameters
        drawBox(g, 50, 50, 100);
        drawBox(g, 250, 10, 50);
        drawBox(g, 180, 115, 180);
    }

    public static void drawBox(Graphics g, int x, int y, int size) {
        // a loop is created that prints 5 rectangles
        for (int i = 1; i <= 5; i++) {
            g.setColor(Color.RED);
            g.drawRect(x,
                    y,
                    size / 5 * i, // similar to Lab4_1 but now multiplies by the size / 5
                    size / 5 * i);
            g.setColor(Color.BLACK);
            g.drawLine(x,
                    y,
                    x + size / 5 * i, // similar to Lab4_1 but now adds the size / 5 * i
                    y + size / 5 * i);
        }
    }
}