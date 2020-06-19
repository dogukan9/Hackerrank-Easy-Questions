
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int count=0;
      static  int page=1;
    public static void result(int arr,int k){
     int q=k;
      
        for (int i =1; i <=arr; i++) { // 
           
            if(q==0){
               page+=1;
              q=k;
           }
           if(i==page){
               count+=1;
             
           }
           
           
           
         
           
           q-=1;
           
        }
        page+=1;
      
    }
    
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
         int k=scan.nextInt();

    int arr;
        for (int i = 0; i <n; i++) {
     
            arr=scan.nextInt();
        result(arr,k);
        }
          System.out.println(count);
     
    }
}