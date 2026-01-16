package task_1;

import java.util.Scanner;

/**WAP that makes the purchase amount as input and calculates the finale payable amount    after applying the discount.
    a)If the purchase amount is less than 500, no discount is 	applied.
    b)If the purchase amount is between 500 and 1000, a 10% 	discount is applied.
    c)If the purchase amount is greater than 1000, a 20% 	discount is applied.
**/

public class Discount {
    public static void main(String[] args) {
        
        //Getting input by the user
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any amount :");
        int amount = obj.nextInt();
        
        if(amount < 500){
            amount = amount;
            System.out.println("No discount");
            System.out.println("Your final price is : " +amount);
        }
        else if(amount >= 500 && amount <= 1000){
            amount = amount - (amount/10);
            System.out.println("You have received a 10% discount");
            System.out.println("The final amount is : " +amount);
        }
        else {
            amount = amount - (amount/5);
            System.out.println("You have received a 20% discount");
            System.out.println("The final amount is : " +amount);
        }
    }
}

