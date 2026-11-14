import java.util.*;
public class largestDigit {
    public int largest(int n){
        int max=0;
        while(n>0){
            int d=n%10;
            if(d>max) max=d;
            n/=10;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        largestDigit obj=new largestDigit();
        int max=obj.largest(num);
        System.out.println("Largest digit is: "+max);
        sc.close();
    }
}
