import java.util.Scanner;

public class pares_e_total {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite um número inteiro positivo: ");
        int n1 =  entrada.nextInt();

        int total = 0;
            
        for(int i = 0; i<= n1 ;i++ ){

            if (i %2==0) {
                
             System.out.println("todos os números pares de 0 até " + n1 + " são: " + i); 
                total++;
            }                  

            
        }
         
        System.out.println("quantidade de números pares encontrados: " + total);


        

        
     entrada.close();
    }
    
}
