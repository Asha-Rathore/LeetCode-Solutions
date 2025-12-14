import java.util.Scanner;

public class PalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int input = x;
        int reverse = 0;
        int digit;
        while(x > 0){
            digit = x % 10;  // Extracts the last digit (e.g., 5, then 4, etc.)
            reverse = (reverse * 10) + digit;
            x = x / 10; // Removes the last digit (integer division)
        }
        if(input == reverse){
            System.out.println("Integer is Palindrome number");
        }
        else{
            System.out.println("Integer is not Palindrome number");
        }
    }
}
