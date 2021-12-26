public class Canvas {

    public static int DEF_HEIGHT = 100;
    public static int DEF_WIDTH = 100;

    // private int[][][] canvas;
    private int height;
    private int width;
    /**
     * Constructor creates a blank white canvas of default dimensions
     */
    public Canvas() {
        this(DEF_HEIGHT, DEF_WIDTH);
    }

    /**
     * Constructor for canvas of given dimensions
     * @param height height of canvas
     * @param width width of canvas
     */
    public Canvas(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Getters and Setters
     */
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
