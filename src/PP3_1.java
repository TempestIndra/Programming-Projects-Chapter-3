import java.util.Scanner;

public class PP3_1 {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Firstname: ");
        String firstname = sc.next();
        System.out.print("Lastname: ");
        String lastname = sc.next();
        System.out.println(Character.toString(firstname.charAt(0))
                + Character.toString(lastname.charAt(0))
                + Character.toString(lastname.charAt(1))
                + Character.toString(lastname.charAt(2))
                + Character.toString(lastname.charAt(3))
                + (int )(Math.random() * 99 + 9));
        sc.close();
    }
}

/*
* Write an application that prompts for an reads the user's first
* name and last name (separately). Then print a string composed
* of the first letter of the user's first name, followed by first five
* characters of the user's lastname, followed by a random number
* in the range 10 to 99. Assume that the last name is at least five
* letters long. Similar algorithms are sometimes used to generate
 * username for new computer account*/
