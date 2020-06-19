
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void print(int beg,int fis){
        int count=0;
        
        for (double i =beg; i <=fis; i++) {
         
           if((int) Math.sqrt(i)==Math.sqrt(i)){
               count++;
              
           }
             
            
        }
        System.out.println(count);
        
    }
    
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int begin;
     int finish;
     
     for (int i = 0; i <n; i++) {
         begin=scan.nextInt();
      finish=scan.nextInt();
         print(begin, finish);
         
     }
       
    }
 
}


