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
public class pattern102 {
    public void solve(int n){
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
        pattern102 obj=new pattern102();
        obj.solve(n);
        sc.close();
    }
}