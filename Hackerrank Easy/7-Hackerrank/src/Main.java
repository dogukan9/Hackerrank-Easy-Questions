
import java.util.Scanner;

public class Main {
    public static String fnc(int [] a){
        
       int mouse=a[2];
       int CatA=a[0];
       int CatB=a[1];
        
        if(Math.abs(CatA-mouse)==Math.abs(CatB-mouse)){
            
            return "Mouse C";
        }
        else{
            
            if (Math.abs(CatA-mouse)<Math.abs(CatB-mouse)) {
                return "Cat A";
            }
            else{
                return "Cat B";
            }
        }
        
        
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      
        int n=scan.nextInt();
         
        int arr[]=new int[3];
        
        for (int i = 0; i <n; i++) {
            for(int j=0;j<3;j++){
                
           arr[j]=scan.nextInt();
        }
            System.out.println(fnc(arr));
            
        }
        
       
    }
    
    
}


