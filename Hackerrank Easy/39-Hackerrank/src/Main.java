
import java.util.Scanner;


public class Main {
     public static void result( int money,int cost,int wrapper) {
         int many=money/cost;
         int sum=many;
         int rem=0,tot=0;
        if(many<wrapper){
            System.out.println(many);
        }
        else{
             while (many>=1) {  
              tot+=many;
              
              rem+=many%wrapper;
              many=many/wrapper;
         
         }
         System.out.println(tot+rem/wrapper);
        }
        
         
         
         
     }
     
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        
      int money,cost,wrapper;
        for (int i = 0; i <n; i++) {
          
            money=scan.nextInt();
            cost=scan.nextInt();
            wrapper=scan.nextInt(); 
            result(money,cost,wrapper);
        }
    }
    
        
    }
     

