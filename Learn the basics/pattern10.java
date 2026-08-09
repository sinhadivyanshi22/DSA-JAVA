//SOLVE 1
// *---
// **--
// ***-
// ****
// ***-
// **--
// *---

//SOLVE 2
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
import java.util.Scanner;
public class pattern10 {

    public void solve1(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public void solve2(int n){
        for(int i=1; i<=2*n-1; i++){
            int star=i;
            if(i>n) star=2*n-i;
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern10 obj=new pattern10();
        obj.solve1(n);
        obj.solve2(n);
        sc.close();
    }
}
