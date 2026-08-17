// 1
// 01
// 101
// 0101
// 10101
import java.util.Scanner;
public class pattern11{
    public void solve(int n){
        int start;
        for(int i=0; i<n; i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0; j<=i; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern11 obj = new pattern11();
        obj.solve(n);
        sc.close();
    }
}
