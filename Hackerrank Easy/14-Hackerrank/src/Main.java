
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  long home1=scan.nextInt();
  long home2=scan.nextInt();
  long apple=scan.nextInt();
  long orange=scan.nextInt();
  long a=scan.nextInt();
  long o=scan.nextInt();
   
int count1=0;
     for (long i = 0; i <a;i++) {
        int app=scan.nextInt();
        if((app+apple)>=home1)
        {
            count1++;
        }
    }
       int count2=0;
     for (long j = 0; j <o;j++) {
        int or=scan.nextInt();
        if((or+orange)<=home2)
        {
            count2++;
        }
    }
        System.out.println(count1);
        System.out.println(count2);
}
    
}
    

