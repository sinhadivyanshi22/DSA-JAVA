
import java.util.Scanner;
public class pattern22{
    public void solve(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top=i;
                int bottom=(2*n-2)-i;
                int left=j;
                int right=(2*n-2)-j;
                int mini=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-mini);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22 obj = new pattern22();
        obj.solve(n);
        sc.close();
    }
}