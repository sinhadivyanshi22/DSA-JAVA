///*****
// ****
// ***
// **
// *

import java.util.Scanner;
public class pattern5 {
    void solution(int n){
        for (int i=0;i<n;i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern5 obj = new pattern5();
        obj.solution(n);
        sc.close();
    }
}