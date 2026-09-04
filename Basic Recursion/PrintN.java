import java.util.*;
class PrintN{
    int cnt=0;
    public void print(){
        if(cnt==10){
            return;
        }
        System.out.println(cnt);
        cnt++;
        print();
    }
    public static void main(String args[]){
        PrintN obj=new PrintN();
        obj.print();
    }
}