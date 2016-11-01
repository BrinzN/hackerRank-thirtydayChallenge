import java.util.Scanner;

/*
Input Format
A single line of text denoting  (the variable whose contents must be printed).

Output Format
Print Hello, World. on the first line, and the contents of  on the second line.

Sample Input
Welcome to 30 Days of Code!

Sample Output
Hello, World. 
Welcome to 30 Days of Code!*/

public class DayZeroHelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
