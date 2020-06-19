
import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         
         int n=scan.nextInt();
         int count=0;
         int[] arr=new int[3];
         for(int i=0;i<n;i++){
           
          
          
            
             for (int j = 0; j <3; j++) {
                 arr[j]=scan.nextInt();
             }
             count=arr[1]%arr[0];
             if((arr[2]+count)%arr[0]==0){
                 System.out.println(arr[2]+count-1);
             }
             else{
                  System.out.println((arr[2]+count-1)%arr[0]);
             }
      
        }
    
          }
          }

