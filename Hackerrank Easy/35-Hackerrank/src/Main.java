
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int sonuc(ArrayList<Integer> a){
        
        int min=0;
          ArrayList<Integer> b=new ArrayList<Integer>();
       
        for (int i =0; i < a.size()-1; i++) {
            for (int j =i+1; j < a.size(); j++) {
            
                if((Math.abs(a.get(j)-a.get(i)))==min){
                 
                 b.add(Math.abs(j-i));
                  
                  
                }
                
            }
            
        }
   
        if(b.isEmpty()){
            return -1;
        }
        return Collections.min(b);
    }
   public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
       ArrayList<Integer> a=new ArrayList<Integer>();
       for (int i = 0; i <n; i++) {
           a.add(scan.nextInt());
           
       }
       int result=sonuc(a);
       System.out.println(result);
       
}
 
}
