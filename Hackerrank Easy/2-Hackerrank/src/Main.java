
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doğukan
 */
public class Main {
    public static int birthday(int[] chocolate,int top,int adet){
        int sum=0;
        int count=0;
       for(int i=0;i<=chocolate.length-adet;i++){
           
          for(int j=0;j<adet;j++){
            sum+=chocolate[i+j];  
              
          }
          if(sum==top){
              count++;
          }
          sum=0;
           
           
       }
        
        
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scan.nextInt();
        }
           int top=scan.nextInt();
              int adet=scan.nextInt();
            int result=birthday(scores,top,adet);
            System.out.println(result);
      
    }
}
