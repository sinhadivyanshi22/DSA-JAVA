import java.util.Scanner;
public class Armstrong{
    public boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while(n!=0){
            int d=n%10;
            sum=(int)(sum+(Math.pow(d,digits)));
            n/=10;
        }
        return sum==original;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        Armstrong obj=new Armstrong();
        boolean isArmstrong=obj.isArmstrong(num);
        if(isArmstrong){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }
        sc.close();
    }
}