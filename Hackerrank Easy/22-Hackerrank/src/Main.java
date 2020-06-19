
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
     int[] arr = new int[n];
     
     for (int i =0;i<n;i++){
        arr[i] = scan.nextInt();
     }
     
     
     int score=100;
    int j=0;
    int c=0;
    while(true){
       
          if(c==k){
              if(arr[j]==1)
              score=score-3;
               else{
              score--;
          }
           c=0;
          }
         
          j+=1;
          c++;
          if(j==n){
              if(arr[0]==0){
                  score--;
              }
              else{
                  score=score-3;
              }
              break;
          }
        }
     System.out.println(score);
    
    
    
    }
 
}

