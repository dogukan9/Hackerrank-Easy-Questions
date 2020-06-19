
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int real_price=scan.nextInt();
        int indirim=scan.nextInt();
        int min=scan.nextInt();
        int money=scan.nextInt();
        int count=0;
        int tot=0;
        while (tot<=money) {            
          
            if(real_price>min){
                  tot+=real_price;
                   real_price-=indirim;
            }
            else{
                tot+=min;
            }
         
            count++;
            if(tot>money){
                count--;
            }
            
        }
        
        System.out.println(count);
    }
    
}
