import java.util.*;
public class CountDigits {
    public int count(int n){
        int count = 0;

        // while(n != 0){
        //     n /= 10;
        //     count++;
        // }

        //with the help of log10
        count = (int) Math.log10(n) +1 ;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        CountDigits obj = new CountDigits();
        int count = obj.count(num);
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}