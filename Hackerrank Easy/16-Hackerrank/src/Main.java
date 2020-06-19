
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Main {
   public static int answer( ArrayList<Integer> a, ArrayList<Integer> b){
      int max=Collections.min(b);
     
       ArrayList<Integer> arr=new ArrayList<Integer>();
       for (int i = 1; i <=max; i++) {
           
           int count=0;
           for (int j =0; j <a.size(); j++) {
               if(i%a.get(j)==0){
                   count++;
               }
             
           }
           if(count==a.size()){
               arr.add(i);
           }
          
       }
       
       for (int k =0; k <b.size(); k++) {
              for (int z = 0; z <arr.size(); z++) {
                 
                if(b.get(k)%arr.get(z)!=0){
                  
                 arr.remove(z);
                 z--;
                    
                }
                
               
           }
                
                 
               }
            
       
       return arr.size();
       
        
   }
        
        
  
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  int n=scan.nextInt();
   int m=scan.nextInt();
    ArrayList<Integer> a=new ArrayList<Integer>();
     ArrayList<Integer> b =new ArrayList<Integer>();
       for (int i = 0; i < n; i++) {
           a.add(scan.nextInt());
       }
        for (int j = 0; j < m; j++) {
           b.add(scan.nextInt());
       }
  int sonuc=answer(a,b);
       System.out.println(sonuc);

  
      

}
    
}
    

