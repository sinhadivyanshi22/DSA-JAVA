import java.util.*;
public class countodds {
    public int count(int n){
        int count = 0;
        while(n>0){
            int d=n%10;
            if(d%2 != 0) count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        countodds obj = new countodds();
        int count = obj.count(num);
        System.out.println("Number of odd numbers: " + count);
        sc.close();
    }
}