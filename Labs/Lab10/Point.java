public class Point {
    //set the x and y coordinates to private so the class can only access them
    private int x;
    private int y;

    //create default point values
    public Point() {
        this(0, 0);
    }

    //if the user enters negative x or y then set to 0 otherwise replace
    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            this.x = 0;
            this.y = 0;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    //method for retrieving the x
    public int getX() {
        return x;
    } 

    //method for retrieving the y
    public int getY() {
        return y;
    }

    //similar to Point(), but when a user wants to replace them later
    public void set(int newX, int newY) {
        if (newX < 0 || newY < 0) {
            newX = 0;
            newY = 0;
        }

        x = newX;
        y = newY;
    }

    //print method for the coordinates
    public void print() {
        System.out.print("(" + x + "," + y + ")");
    }

    //instead of using toString, we can just type the point name to return point string
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //returns boolean if the coordinates between 2 points are equal to each other
    public boolean equals(Point p) {
        return x == p.x && y == p.y;
    }

    //method which allows the copy from one coordinate to another
    public void copy(Point p) {
        x = p.x;
        y = p.y;
    }

    //method which creates a new point copying an existing Point
    public Point getCopy() {
        return new Point(x, y);
    }

    //method which returns a Points distance from origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    //method which calculates the distance between 2 points
    public double distance(Point p) {
        int newX = p.x - x;
        int newY = p.y - y;

        return Math.sqrt(newX * newX + newY * newY);
    }

    //method which increments by users choice of an existing Point
    public void translate(int dx, int dy) {
        set(x + dx, y + dy);
    }

    //method which returns boolean if 2 Points have equal y's
    public boolean isHorizontal(Point p) {
        return y == p.y;
    }

    //method which returns boolean if 2 Points have equal x's
    public boolean isVertical(Point p) {
        return x == p.x;
    }

    //method which calculates slope between 2 points
    public double slope(Point p) {
        //have to use double because we want exact value
        return (double) (p.y - y) / (p.x - x);
    }
}
