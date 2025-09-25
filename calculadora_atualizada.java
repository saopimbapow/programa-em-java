import java.util.Scanner;


public class calculadora_atualizada {
    public static void main(String[] args) throws Exception {
        
     Scanner entrada = new Scanner(System.in);
    
     System.out.print ("escolha a sua opção(+,-,* ou /):");
     String p1 = entrada.next();
     
     System.out.print ("digite um numero:");
     int x = entrada.nextInt();
     
     System.out.print ("digite o segundo numero:");
     int y = entrada.nextInt();
    
     if (p1 .equals("+")) {
        soma(x,y);
        return  ;
     }
     else if (p1 .equals("-")) {
        subtração(x, y);
        return;
     }
     else if (p1.equals("/")) {
        divisão(x, y);
        return;
     }
     else if (p1.equals("*")) {
        multiplicação(x, y);
        return;
     }
     else {System.out.println("error 404");}
            

    }

    static void soma(int x , int  y){
        System.out.println(x+y);

    }

    static void subtração(int x , int  y){
        System.out.println(x-y);

    }
    static void divisão(int x , int  y){
        System.out.println(x/y);

    }

    static void multiplicação (int x , int  y){
        System.out.println(x*y);

    }

}

