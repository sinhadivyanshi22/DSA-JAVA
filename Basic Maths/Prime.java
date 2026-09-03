import java.util.Scanner;
public class Prime{
    public void isprime(int n){
        //for negative no
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        
        int c=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime obj=new Prime();
        obj.isprime(n);
        sc.close();
    }
}