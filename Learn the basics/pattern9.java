// ----*----
// ---***---
// --*****--
// -*******-
// *********
// *********
// -*******-
// --*****--
// ---***---
// ----*----
import java.util.Scanner;
public class pattern9 {
    public void solve(int n){
        //upper half
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("-");//space
            }
            for(int j=0; j< 2*i+1; j++){
                System.out.print("*");//star
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("-");//space
            }
            System.out.println();
        }
        //lower half
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("-");//space
            }
            for(int j=0; j< 2*n-(2*i+1); j++){
                System.out.print("*");//star
            }
            for(int j=0; j<i; j++){
                System.out.print("-");//space
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        pattern9 obj=new pattern9();
        obj.solve(n);
        sc.close();
    }
}