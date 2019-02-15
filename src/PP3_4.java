import java.util.Scanner;

public class PP3_4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 input: ");
        int x1 = sc.nextInt();
        System.out.print("y1 input: ");
        int y1 = sc.nextInt();
        System.out.print("x2 input: ");
        int x2 = sc.nextInt();
        System.out.print("y2 input: ");
        int y2 = sc.nextInt();
        System.out.println("Distance is " + Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
    }

}

/*
* Write an application that reads the (x,y) for two
* points. Compute the distance between the two points using
* the following formula:
* sqrt((x2-x1)^2+(y2-y1)^2)
* */