
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static int migratoryBirds(int[] types){
        int n=0;
        int count=1;
       int temp=1;
        Set<Integer> a=new HashSet<Integer>();
       for(int i=0;i<=types.length-1;i++){
           n=types[i];
           count=1;
          for(int j=i+1;j<types.length;j++){
              
              if(n==types[j]){
                  count++;
              }
              
              
          }
          
          if(count==1){
              continue;
          }
           if(count>temp){
              a.removeAll(a);
               a.add(types[i]);
               
           }
           if(count==temp){
              int k=Collections.min(a);
              if(k>types[i]){
                  a.add(types[i]);
              }
               
           }
            temp=count;
   
           
       }
       
        System.out.println(a);
      
     int m=Collections.min(a);
        
        
        
        return m;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] types=new int[n];
        for(int i=0;i<n;i++){
           types[i]=scan.nextInt();
        }
            int result=migratoryBirds(types);
            System.out.println(result);
      
    }
}
