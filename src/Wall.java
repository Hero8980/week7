public class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructors
    public Wall() {
        // No-arg constructor initializes fields to 0
        this.width = 0;
        this.height = 0;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    public Wall(double width, double height) {
        // Constructor with parameters initializes fields with validation
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for width with validation
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Setter method for height with validation
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate the area of the wall
    public double getArea() {
        return width * height;
    }
}