/* It is a class of the circle .*/

package test.matic;

public class Circle implements Shape {

    private int radius;
    private String color;

    {
        radius = 1;
        color = Colors[0];
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public void Draw() {
        System.out.println("Hi buddy, I'm a circle picture");
    }

    @Override
    public double getSquare() {
        double square = (double) Math.PI * Math.pow(this.radius, 2);
        return square;
    }

    @Override
    public String getColor() {
        String color = this.color;
        return color;
    }
}
