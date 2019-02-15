import java.util.Scanner;

public class PP3_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(first + " to the third power is " + Math.pow(first,3) +"\n"+second+" to the third power is " + Math.pow(second,3));
        sc.close();
    }
}

/*
* Write an application that prints the sum of cubes. Prompt for and
* read two integer values and print the sum of each value raised to
* the third power
* */