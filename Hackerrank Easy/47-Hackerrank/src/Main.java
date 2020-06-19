
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       String s=scan.next();
       int c=0;
       int j=0;
      char[] sp={'S','O','S'};
        for (int i = 0; i <s.length(); i++) {
          if(j==3){
              j=0;
                     
          }
            if(sp[j]!=s.charAt(i)){
                c++;
           }
            j++;
                  
          
            
        }
        System.out.println(c);
    }
}
