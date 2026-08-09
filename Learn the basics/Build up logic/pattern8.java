// *********
// -*******-
// --*****--
// ---***---
// ----*----

import java.util.Scanner;
public class pattern8 {
    public void solve(int n){
        for(int i=0; i<n ;i++){
            for(int j=0; j<i; j++){//space
                System.out.print("-");
            }
            for(int j=0; j< 2*n-(2*i+1); j++){//star
                System.out.print("*");
            }
            for(int j=0; j<i; j++){//space
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        pattern8 obj=new pattern8();
        obj.solve(n);
        sc.close();
    }
}
