
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        int[]array=new int[n];
        for (int i = 0; i <n; i++) {
            array[i]=scan.nextInt();
            
        }
        int count=0;
        int c=0;
        
        for(int j=0;j<n-1;j++){
            int h=j;
            for (int k =j+1; k < array.length; k++) {
                if((array[k]-array[h])==d){
                    count++;
                   
                     h=k;
                    if(count==2){
                     c++;
                     count=0;
                     break;
                    }
                    
                }
                
            }
            count=0;
           
        }
        System.out.println(c);
    }
}
