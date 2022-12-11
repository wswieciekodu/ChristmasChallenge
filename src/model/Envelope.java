package model;

public class Envelope {
    private int width;
    private int height;

    public Envelope(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
