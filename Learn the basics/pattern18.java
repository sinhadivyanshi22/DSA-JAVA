

import java.util.Scanner;
public class pattern18 {

    public void solve(int n){
        for(int i=1; i<=n; i++){
            for(char ch=(char)('E'-i+1); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern18 obj = new pattern18();
        obj.solve(n);
        sc.close();
    }
}
