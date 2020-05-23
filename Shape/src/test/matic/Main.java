/* It is the main program file.*/

package test.matic;

import java.io.BufferedReader;
import java.io.IOException;
import  java.io.InputStreamReader;
import java.util.*;

class Main{

public static void main(String[] args) throws IOException {
        System.out.println("Do you want to generate a set of shapes? (Y/N)");
        String ch;
        Scanner scanner = new Scanner(System.in);
        ch = scanner.nextLine();
        System.out.printf("Your input: %s    Sorry, I tried, but something wrong happened... %n", ch);


        Triangle tr1 = new Triangle(9,16,25,  "black"  );
        tr1.Draw();
        System.out.print("my color is: " + tr1.getColor()+"; ");
        System.out.println("my hypotenuse is: " + tr1.getHypotenuse());



}

}
