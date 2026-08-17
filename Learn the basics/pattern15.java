// A B C D E 
// A B C D 
// A B C 
// A B 
// A 

import java.util.Scanner;
public class pattern15 {
    
    public void solve(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+(n-i); ch++){//A+ (BCDE)N-1
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern15 obj = new pattern15();
        obj.solve(n);
        sc.close();
    }
    
}
