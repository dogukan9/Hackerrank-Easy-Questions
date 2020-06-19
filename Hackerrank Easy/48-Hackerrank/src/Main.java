
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
          int c=0;
        byte[] a =s.getBytes();
         for(int i=0;i<a.length;i++){
             if(a[i]<97){
                 c++;
             }
         }
         c=c+1;
        System.out.println(c);

    }
}
