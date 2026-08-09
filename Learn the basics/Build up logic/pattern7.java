// ----*----
// ---***---
// --*****--
// -*******-
// *********

import java.util.Scanner;
public class pattern7 {
    public void solve(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("-");//space
            }
            for(int k=0; k<(2*i+1);k++){
                System.out.print("*");//star
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("-");//space
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        pattern7 obj=new pattern7();
        obj.solve(n);
        sc.close();
    }
}
