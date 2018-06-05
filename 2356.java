import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
            Scanner ler = new Scanner(System.in);
    
    String D,S;
    
    
     while(ler.hasNext()){
    D= ler.nextLine();
    S = ler.nextLine();
   
    if(D.contains(S)){
        System.out.printf("Resistente\n");
    }
    else{
        System.out.printf("Nao resistente\n");
    }
    }
    }
}