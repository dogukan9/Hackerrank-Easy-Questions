 
import java.util.Scanner;

public class Main {
    public static void print(int ld,int lm,int ly,int dd,int dm,int dy){
    
       if(ly>dy){
           System.out.println(10000);
       }
      else if((lm>dm) && (ly==dy)){
           System.out.println((lm-dm)*500);
       }
       else if(ld>dd && lm==dm && ly==dy ){
           System.out.println((ld-dd)*15);
       }
       else{
           System.out.println(0);
       }
    }
    
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String tarihlate =scan.nextLine();
    String tarih =scan.nextLine();
   
     
      String[] late=tarihlate.split(" ");
       String[] deadline=tarih.split(" ");
     print(Integer.valueOf(late[0]),Integer.valueOf(late[1]),Integer.valueOf(late[2]),Integer.valueOf(deadline[0]),Integer.valueOf(deadline[1]),Integer.valueOf(deadline[2]));
  
    
 }
 
}


