
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n=scan.next().toLowerCase();
    String m=scan.next().toLowerCase();
    int c=scan.nextInt();
       
     int count=0;
     int count2=0;
    
 
     for (int i = 0; i <Math.min(n.length(),m.length()); i++) {
         
         if(n.charAt(i)!=m.charAt(i)){
             break;
                     
         }
         else if(n.charAt(i)==m.charAt(i))
         {
             count2++;
         }
     }
     count=Math.max(n.length(),m.length())-count2;
     for (int i = count2; i <Math.min(n.length(),m.length()); i++) {
         
        
             count++;
         
     }
     if (count<=c) {
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }
    
     
    
    
    }
 
}

