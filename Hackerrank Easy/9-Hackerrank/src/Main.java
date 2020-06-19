
import java.util.Scanner;


public class Main {
    
    public static int print(int [] a){
     
        int ort=0;
        int count=1;
        for (int i = 0; i <a.length-1; i++) {
           for (int j =i+1; j <a.length; j++) {
             if(a[i]==a[j]){
                 count++;
             }            
            }
             if(count%2==0){
                 ort++;
             }
             count=1;
        
            }  
        return ort ;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
        }
       
        
        int m=print(arr);
        System.out.println(m);
        
    }
    
}
