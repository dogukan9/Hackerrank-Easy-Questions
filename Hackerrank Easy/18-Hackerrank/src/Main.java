
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         
         int n=5;
         int day=scan.nextInt();
         int tot=0;
         for(int i=0;i<day;i++){
             n=n/2;
             tot+=n;
                     
            n=n*3;
            
             
         }
         System.out.println(tot);
         
        }
    
}
