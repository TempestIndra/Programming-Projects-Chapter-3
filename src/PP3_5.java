import java.util.Scanner;

public class PP3_5 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("input R : ");
        int r = sc.nextInt();
        sc.close();
        System.out.printf("%.4f",4/3*Math.PI*Math.pow(r,3));
        System.out.println("");
        System.out.printf("%.4f", 4 * Math.PI*Math.pow(r,2));
    }

}

/*
* Write an application that reads the radius of a sphere and prints its
* volume and surface area. Use the following formulas, in which r rep-
* resents the sphere radius. Print the output to four decimal places.
* Volume = 4/3 pir^3
* Surface area = 4pir^2
*/