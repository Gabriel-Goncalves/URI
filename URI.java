import java.io.IOException;
import java.util.Scanner;

public class URI {
    public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
        int qua,i;
        String nome;
        double peso,nota=0,notaf,aux;
        double x[] = new double[7];
        
        qua = ler.nextInt();
        
        for(int k = 0 ;k < qua ; k++ ){
            nome = ler.next();
            peso = ler.nextDouble();
            
            for( i=0 ; i<7 ; i++){
             x[i] = ler.nextDouble();   
            }
            
            
            for( i=0 ; i<7 ; i++){
               for(int j=i+1 ; j<7 ; j++){
                   if(x[j] < x[i]){
                       aux = x[i];
                       x[i] =  x[j];
                       x[j] = aux;
                   }
               }
               }
               
            for ( i=1 ; i<6 ; i++){
                nota = nota + x[i];
            }
            
            notaf = nota * peso ;
            
            System.out.printf(nome+" %.2f\n",notaf);
            nota = 0;
        }
    }
    
}
