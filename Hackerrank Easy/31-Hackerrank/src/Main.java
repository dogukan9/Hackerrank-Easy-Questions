
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int result( ArrayList<Integer>  ar){
        int max=0;
        int count=0;
        int num=ar.get(0);
        for (int i = 0; i < ar.size()-1; i++) {
            count=0;
            for (int j =i+1; j < ar.size(); j++) {
            if(ar.get(i)==ar.get(j)){
                count++;
                
            }
             
            }
            if(count>max){
                max=count;
                num=ar.get(i);
                
                   
                        }
        
            
        }
          System.out.println(num);
        return num;
      
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        ArrayList<Integer>  ar=new ArrayList<Integer>();
        
        for (int i = 0; i <n; i++) {
            ar.add(scan.nextInt());
            
        }
        int num=result(ar);
        
        
        int count=0;
        for (int i = 0; i < ar.size(); i++) {
          if(ar.get(i)!=num){
              count++;
          }
            
        }
        System.out.println(count);
    }
           
}
