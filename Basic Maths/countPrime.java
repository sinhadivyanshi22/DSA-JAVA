import java.util.*;
public class countPrime {
    public int count(int n){
        if(n<=1) return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        countPrime obj=new countPrime();
        int primeCount=obj.count(num);
        System.out.println("Number of prime numbers are: "+primeCount);
        sc.close();
    }
}
