   
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void result(ArrayList<Integer> a,String word){
    ArrayList<Integer> nums=new ArrayList<Integer>();
     ArrayList<Character> alfabe=new ArrayList<Character>();
        for (char i ='a'; i <='z'; i++) {
        alfabe.add(i);
    } 
        for (int j =0; j <word.length(); j++) {
         
           int b=a.get(alfabe.indexOf(word.charAt(j)));
           nums.add(b);
    
         } 
       int big= Collections.max(nums);
        
        System.out.println(big*word.length());
        
  
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    ArrayList<Integer> a=new ArrayList<Integer>();
     for (int i = 0; i <26; i++) {
        a.add(scan.nextInt());
    }
     String word=scan.next();
        result(a,word);
}
    
}
    

