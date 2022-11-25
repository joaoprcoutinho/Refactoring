package pt.up.fe.ldts.example2;

import java.net.spi.URLStreamHandlerProvider;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double x, double y, double width, double height){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawLine(getX(), getY(), getX() + width, getY());
        graphics.drawLine(getX() + width, getY(), getX() + width, getY() + height);
        graphics.drawLine(getX() + width, getY() + height, getX(), getY() + height);
        graphics.drawLine(getX(), getY() + height, getX(), getY());
    }
}

