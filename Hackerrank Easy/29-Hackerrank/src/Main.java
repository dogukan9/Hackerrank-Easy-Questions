
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
      String s=scan.next();
        
        int n=scan.nextInt();
        int max=1;
        int count=1;
        char x = 0;
        for(int i=0;i<s.length()-1;i++){
            count=1;
            
            for (int j = i+1; j <s.length(); j++) {
                if(s.charAt(j)==s.charAt(i)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                x=s.charAt(i);
                        
            }
        }
        
       int count2=n/s.length();
       int count3=n%s.length();
      count2=count2*max;
        for(int k=0;k<count3;k++){
           if(s.charAt(k)==x){
               count2++;
                       
           }
            
        }
       
    
        System.out.println(count2);
      
   
    } 
       
    
    
}
