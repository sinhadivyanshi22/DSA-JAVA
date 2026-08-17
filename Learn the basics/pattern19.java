// ******
// **  **
// *    *
// *    *
// **  **
// ******
import java.util.Scanner;
public class pattern19 {

    public void solve(int n){
        int ins=0;//taken for spaces

        //upperhalf
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-i-1; j++){//stars
                System.out.print("*");
            }
            for(int j=0; j<ins; j++){//space
                System.out.print(" ");
            }
            for(int j=0; j<=n-i-1; j++){//stars
                System.out.print("*");
            }
            ins+=2;
            System.out.println();
        }
        
        //lowerhalf
        ins=2*n-2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){//stars
                System.out.print("*");
            }
            for(int j=0; j<ins; j++){//space
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){//stars
                System.out.print("*");
            }
            ins-=2;
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern19 obj = new pattern19();
        obj.solve(n);
        sc.close();
    }
}