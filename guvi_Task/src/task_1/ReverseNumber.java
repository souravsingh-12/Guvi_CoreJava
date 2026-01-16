package task_1;

//Write down the program to reverse the given number using loops.
//	Input = 876		Output = 678

public class ReverseNumber {
    public static void main(String[] args) {
    	
        int number = 876;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;     // get last digit
            reverse = reverse * 10 + digit;
            number = number / 10;        // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
