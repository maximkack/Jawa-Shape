/* It is a class of the right triangle.*/

package test.matic;

public class Triangle implements Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    private String color;

    {
        sideA = 3;
        sideB = 4;
        sideC = 5;
        color = Colors[0];
    }

    public int getHypotenuse(){
        int sideC = this.sideC;
        return sideC;
    }

    @Override
    public void Draw() {
        System.out.println("Hi buddy, I'm a triangle picture");
    }

    @Override
    public double getSquare() {
        double square = (this.sideA * this.sideB)/2;
        return square;
    }

    @Override
    public String getColor() {
        String color = this.color;
        return color;
    }
}
