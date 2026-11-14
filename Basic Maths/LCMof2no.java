import java.util.*;
public class LCMof2no {
    public int lcm(int a, int b){
        int max = (a > b) ? a : b;
        while(true){
            if(max % a == 0 && max % b == 0){
                return max;
            }
            max++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        LCMof2no obj = new LCMof2no();
        int lcm = obj.lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
