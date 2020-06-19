
import java.util.Scanner;

public class Main {
    public static int print(int[] a,int page){
       int count=0;
        if(Math.abs(page-(a.length-2))>Math.abs(1-page)){
            for(int i=0;i<a.length;i+=2){
             
             if((page==a[i]) || (page==a[i+1]) || page==1){
                  break;
             }
             else{
                 count++;
               
                
             }
            
              
         }     
           return count;  
        }
        else{
        if(a.length%2==0){
         for(int i=a.length-1;i>0;i-=2){
             
             if((page==a[i]) || (page==a[i-1]) || page==1){
                  break;
             }
             else{
                 count++;
               
                
             }
            
              
            
        }
         return count;
        }
         else{
         for(int i=a.length-2;i>0;i-=2){
             
             if((page==a[i]) || (page==a[i-1]) || page==1){
                  break;
             }
             else{
                 count++;
               
                
             }
            
              
            
        }
         return count;
        }
        
              
    }
    }

   public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
   int[] a=new int[n+2];
  
   int page=scan.nextInt();
   for(int i=0;i<=n+1;i++){
        a[i]=i;
   }
   int x=print(a,page);
       System.out.println(x);
   
}
 
}
