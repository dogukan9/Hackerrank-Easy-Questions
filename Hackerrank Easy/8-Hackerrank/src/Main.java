
import java.util.Scanner;


public class Main {
    
    public static void print(int [] a,int dec,int sub){
        int sum=0;
        int ort=0;
        for (int i = 0; i <a.length; i++) {
            if(i==dec){
                continue;
                
            }
            sum+=a[i];
            }
        
        ort=sum/2;
        System.out.println(ort);
        if(sub>ort){
       
            System.out.println(sub-ort);
        }
        
        else{
            
                 System.out.println("Bon Appetit");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int dec=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
        }
        int sub=scan.nextInt();
        
        print(arr, dec, sub);
        
    }
    
}
