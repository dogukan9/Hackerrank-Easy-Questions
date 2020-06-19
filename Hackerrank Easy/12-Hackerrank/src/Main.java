
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void result(ArrayList<Integer> a,int k){
      
        int big=Collections.max(a);
         if((big-k)>0){
             System.out.println(big-k);
         }
         else{
             System.out.println(0);
         }

    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k=scan.nextInt();
    ArrayList<Integer> a=new ArrayList<Integer>();
     for (int i = 0; i <n; i++) {
        a.add(scan.nextInt());
    }
        result(a,k);
}
    
}