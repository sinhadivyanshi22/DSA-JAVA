import java.util.Scanner;
public class PrintDivisors{
    void divisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i != i){
                    System.out.print(n/i+" ");
                    //make list if want to print in sorted order
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        PrintDivisors obj=new PrintDivisors();
        obj.divisors(n);
        sc.close();
    }
}