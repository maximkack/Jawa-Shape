/* It is a class of the isosceles trapezoid.*/

package test.matic;

public class Trapezoid implements Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private String color;

    {
            sideA = 1;
            sideB = 3;
            sideC = 2;
            sideD = 2;
            color = Colors[0];
    }

/* A generator of the class */
    public Trapezoid(int sideA, int sideB, int sideC, int sideD, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.color = color;
    }


/* A unique method of the trapezoid */
    public double getHeight(){
        double height = Math.sqrt(this.sideC *this.sideD - Math.pow((this.sideA -this.sideB), 2)/4);
        return sideC;
}

@Override
    public void Draw() {
    System.out.println("Hi buddy, I'm a trapezoid picture");
    }

    @Override
    public double getSquare() {
        double square = (this.sideA +this.sideB)/2 * this.getHeight();
        return square;
    }

    @Override
    public String getColor() {
        String color = this.color;
        return color;
    }
}