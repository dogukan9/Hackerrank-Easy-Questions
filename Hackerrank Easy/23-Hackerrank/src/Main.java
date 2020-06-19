
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void handle(int num){
        int t=num;
        ArrayList<Integer> a=new ArrayList<Integer>();
        int rem=0;
        while(t!=0){
            rem=t%10;
            a.add(rem);
            t=t/10;
        }
        int count=0;
        for (int i = 0; i <a.size(); i++) {
            if(a.get(i)!=0){
            if(num%a.get(i)==0){
                count++;
            }
            }
        }
        System.out.println(count);
        
    }
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
     
     for (int i = 0; i <n; i++) {
         int num=scan.nextInt();
         handle(num);
     }
    
    
    }
 
}

