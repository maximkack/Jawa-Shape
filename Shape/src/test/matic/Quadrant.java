/* It is a class of the quadrant.*/

package test.matic;

public  class Quadrant implements Shape {

    private int side;
    private String color;

    {
        int side = 1;
        color = Colors[0];
    }

/* A generator of the class */
    public Quadrant(int side, String color) {
        this.side = side;
        this.color = color;
    }

/*  unique method of the quadrant */
    public int getSide(){
        return this.side;
    }


    @Override
    public void Draw() {
        System.out.println("Hi buddy, I'm a quadrant picture");

    }

    @Override
    public double getSquare() {
        double square = this.side *this.side;
        return square;
    }

    @Override
    public String getColor() {
        String color = this.color;
        return color;
    }
}