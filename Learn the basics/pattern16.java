// A 
// B B 
// C C C 
// D D D D 
// E E E E E 

import java.util.Scanner;
public class pattern16 {
    
    public void solve(int n){
        for(int i=1; i<=n; i++){
            char ch= (char)('A' + i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern16 obj = new pattern16();
        obj.solve(n);
        sc.close();
    }
}
