import java.util.Scanner;

public class PP3_6 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        int s = (a + b + c)/2;
        System.out.printf("%.4f",Math.sqrt((s*(s-a)*(s-b)*(s-c))));
    }

}

/*
* Write an application that reads the lengths of the sides of a trian-
* gle from the user. Compute the area of the triangle using Heron's
* formula(below), in which s represents half of the perimeter of the
* triangle, and a , b , and c represent the lengths of the three sides
* Print the area to three decimal places
*/
