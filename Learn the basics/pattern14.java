// A 
// A B 
// A B C 
// A B C D 
// A B C D E 

import java.util.Scanner;
public class pattern14 {

    public void solve(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+i-1; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern14 obj = new pattern14();
        obj.solve(n);
        sc.close();
    }
}
