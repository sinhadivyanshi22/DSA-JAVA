// ****
// ****
// ****
// ****
// ****

import java.util.Scanner;
class pattern1{
    void solve(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern1 obj = new pattern1();
        obj.solve(n);
        sc.close();
    }
}