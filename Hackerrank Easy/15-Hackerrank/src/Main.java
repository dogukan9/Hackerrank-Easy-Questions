
import java.util.Scanner;

public class Main {
   public static  String answer(int x1,int v1,int x2,int v2){
       if((x1>x2) && (v1>v2)){
      return "NO";
      }
       else if((x1<x2) && (v1<v2)){
      return "NO";
       }
      else if((x1<x2) && (v1==v2)){
      return "NO";
         }
      else if((x1>x2) && (v1==v2)){
      return "NO";
         }
       else{
           
           while (true) {               
             x1+=v1;
             x2+=v2;
              if(x2==x1){
                  return "YES";
              }
              
             else if(x2>x1 && v2>v1){
                  return "NO";
              }
             else if(x1>x2 && v1>v2){
                  return "NO";
              }
           }
        
          
       }
      
       
       
       
        
   }
        
        
  
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  int x1=scan.nextInt();
   int v1=scan.nextInt();
  int x2=scan.nextInt();
  int v2=scan.nextInt();

  
        System.out.println(answer(x1, v1, x2, v2));

}
    
}
    

