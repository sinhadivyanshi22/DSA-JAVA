import java.util.Scanner;
public class gcdNhcf{
    public void gcdhh(int a, int b){

        // brute force
        // for(int i=Math.min(a,b); i>=1; i--){
        //     if(a%i==0 && b%i==0){
        //         System.out.println(i);
        //         break;
        //     }
        // }

        // Euclidean algorithm
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) System.out.println(b);
        else System.out.println(a);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcdNhcf obj=new gcdNhcf();
        obj.gcdhh(a, b);
        sc.close();
    }
}