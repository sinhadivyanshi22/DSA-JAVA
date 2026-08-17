// 12345
// 1234
// 123
// 12
// 1
import java.util.Scanner;
public class pattern6 {
    public void solve(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern6 obj=new pattern6();
        obj.solve(n);
        sc.close();
    }
}