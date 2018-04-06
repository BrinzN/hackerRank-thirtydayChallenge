import java.util.*;
import java.math.*;

/*
Input Format
There are 3 lines of numeric input: 
The first line has a double, mealCost (the cost of the meal before tax and tip). 
The second line has an integer, tipPercent (the percentage of mealCost being added as tip). 
The third line has an integer, taxPercent (the percentage of mealcost being added as tax).

Output Format
Print The total meal cost is totalCost dollars., where totalCost is the rounded integer result of the entire bill 
(mealCost with added tax and tip).

Sample Input

12.00
20
8
Sample Output

The total meal cost is 15 dollars.
*/

public class DayTwoOperators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tipAmount = mealCost*tipPercent/100;
        double taxAmount = mealCost*taxPercent/100;


        // cast the result of the rounding operation to an int and save it as totalCost
        double totalCost = mealCost+tipAmount+taxAmount;

        // Print your result
        System.out.println("The total meal cost is "+ (int) Math.round(totalCost)+" dollars.");
    }
}
