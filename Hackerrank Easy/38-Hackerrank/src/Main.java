
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void calculate( long b,long w,long bc,long wc,long z){
     
       long cheaper,expensive;
        long add;
     
             if(bc<wc){
                cheaper=bc;
                expensive=wc;
                add=w;
            }
            else{
                cheaper=wc;
                 expensive=bc;
                add=b;
            }
            
          if((cheaper+z)<expensive){
     
             System.out.println((b*cheaper)+(w*cheaper)+(z*add));
           
            
        }
        else{
             System.out.println((b*bc)+(w*wc));
           
        }
        
      
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        
        long b,w,bc,wc,z;
        for (int i = 0; i <n; i++) {
            b=scan.nextLong();
            w=scan.nextLong();
            bc=scan.nextLong();
            wc=scan.nextLong();
            z=scan.nextLong();
            calculate(b, w, bc, wc, z);
            
        }
    }
}
