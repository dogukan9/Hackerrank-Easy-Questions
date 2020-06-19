

import java.util.Scanner;


public class Main {
  
    
    public static void PM(String time){
       String h=time.substring(0, 2);
       if(h.equals("12")){
            System.out.println(time.substring(0,8));
       }
       else{
       int saat=Integer.valueOf(h)+12;
      
       System.out.println(saat+time.substring(2,8));
       }
    }
      public static void AM(String time){
       String h=time.substring(0, 2);
       if(h.equals("12")){
            System.out.println("00"+time.substring(2,8));
       }
       else{
      
      
       System.out.println(time.substring(0,8));
       }
    }
    
public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
   
     String time=scan.next();
     
     if(time.endsWith("PM")){
         PM(time);
     }
     else{
          AM(time);   
     }
    

  
        
    } 
}