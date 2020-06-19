
import java.util.Scanner;

public class Main {
   
static int solve(int n, int p) {
    int page1 = Math.abs((p) / 2);
    if(n%2==0){
        n++;
    }
    int page2 = Math.abs((p - (n)) / 2);
    return page1 < page2 ? page1 : page2;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int p = in.nextInt();
    int result = solve(n, p);
    System.out.println(result);
}
 
}

