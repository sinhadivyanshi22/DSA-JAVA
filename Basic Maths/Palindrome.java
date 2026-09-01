import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            if (d > Integer.MAX_VALUE / 10 || d < Integer.MIN_VALUE / 10)
                return false;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev == original;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Palindrome obj = new Palindrome();
        boolean isPalindrome = obj.isPalindrome(num);
        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}