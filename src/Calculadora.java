import java.util.Scanner;

    public class Calculadora {

        public static void main(String[] args)
        {
            Scanner ler = new Scanner(System.in);

            int numero1;
            int numero2;
            int resultado; 
            int resultad1; 
            int resulta2;

            System.out.print("Digite um numero para somar:  ");
            numero1 = ler.nextInt();
            System.out.print("Digite outro numero:  ");
            numero2 = ler.nextInt();

            resultado = numero1 + numero2;
            resultad1 = numero1 - numero2;
            resulta2 = numero1 / numero2;

            System.out.print("O RESULTADO E "+ resultado);
            System.out.print("O RESULTADO  "  + resultad1);  
            System.out.print("O RESULTADO" +resulta2);
            
        


        }
        }

