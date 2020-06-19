
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
    public static int [] breakingRecords(int a[]){
        int[] b=new int[2];
        int min=a[0];
        int max=a[0];
        int minc=0,maxc=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                maxc++;
                max=a[i];
            }
            if(a[i]<min){
                minc++;
                 min=a[i];
            }
        }
        b[0]=maxc;
        b[1]=minc;
        return b;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=scan.nextInt();
        }
        int[] result=breakingRecords(scores);
         System.out.println(result[0]+" "+result[1]);
    }
}
