import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        
        for (int i = 1; i <= x; i++) {
                int y= (int) Math.pow(i, 2);
                int z= (int) Math.pow(i, 3);
                System.out.printf("%d %d %d\n",i,y,z);
                System.out.printf("%d %d %d\n",i,y+1,z+1);
        }
    }
}