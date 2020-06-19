
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void result(String[][] str, int[][] arr,int n){
        
         ArrayList<Integer> arr2=new ArrayList<Integer>();
         int k=0,l=0;
          for(int i=1;i<n-1;i++) {            
            for (int j =1; j<n-1; j++) {
                if((arr[i][j]>arr[i][j+1])&& (arr[i][j]>arr[i-1][j]) &&(arr[i][j]>arr[i][j-1]) &&(arr[i][j]>arr[i+1][j])){
                    
                    arr2.add(i);
                
                     arr2.add(j);
                }
                }
                
            }
      
               
            for (int j = 0; j<arr2.size(); j++) {
                str[arr2.get(j)][arr2.get(j+1)]="X";
               j++;                }
             for(int i=0;i<n;i++) {            
            for (int j =0; j<n; j++) {
                System.out.print(str[i][j]);
                }
                 System.out.println("");
                
            }
              
                
            
          
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
       int[][] arr=new int[n][n];
        String[][] s=new String[n][n];
       ArrayList<String> str=new ArrayList<String>();
       
       for(int i=0;i<n;i++) {            
        
            
            str.add(scan.next());
               
                
                
            }
      
        
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
              
                 s[i][j]=String.valueOf(str.get(i).charAt(j));
                 arr[i][j]=Integer.valueOf(s[i][j]);
            }
            
        }
       result(s,arr,n);
        }
    }

/*

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void result( String[][] str, int[][] arr,int n){
        
         ArrayList<Integer> arr2=new ArrayList<Integer>();
         int k=0,l=0;
          for(int i=1;i<n-1;i++) {            
            for (int j =1; j<n-1; j++) {
                if((arr[i][j]>arr[i][j+1])&& (arr[i][j]>arr[i-1][j]) &&(arr[i][j]>arr[i][j-1]) &&(arr[i][j]>arr[i+1][j])){
                     // arr2[k]=i;
                    arr2.add(i);
                 //   k++;
                  //     arr2[k]=j;
                    //  k++;
                     arr2.add(j);
                }
                }
                
            }
      
               
            for (int j = 0; j<arr2.size(); j++) {
                str[arr2.get(j)][arr2.get(j+1)]="X";
               j++;                }
             for(int i=0;i<n;i++) {            
            for (int j =0; j<n; j++) {
                System.out.print(str[i][j]);
                }
                 System.out.println("");
                
            }
              
                
            
          
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
       int[][] arr=new int[n][n];
       String[][] str=new String[n][n];
       for(int i=0;i<n;i++) {            
            for (int j = 0; j<n; j++) {
            arr[i][j]=scan.nextInt();
             str[i][j]=String.valueOf(arr[i][j]);
                }
                
            }
       result(str,arr,n);
        }
    }



*/