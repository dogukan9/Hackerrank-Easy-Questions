
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
     public static void result(ArrayList<Integer> width,int s,int f) {
         int min=width.get(s);
         for (int i =s; i <=f; i++) {
             if(width.get(i)<min){
                 min=width.get(i);
             }
         }
         System.out.println(min);
         
         
         
     }
     
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
         int m=scan.nextInt();
         int s,f;
        ArrayList<Integer> width=new ArrayList<Integer>();
    
        for (int i = 0; i <n; i++) {
          width.add(scan.nextInt());
            
        }
        for (int i = 0; i <m; i++) {
         s=scan.nextInt();
         f=scan.nextInt();
            result(width,s,f);
        }
    }
    
        
    }
     

