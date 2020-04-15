import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        /*entrada de dados */
        int valor;
        System.out.print(" Por Favor digite um valor ");
        valor = teclado.nextInt();

        /*processamento*/
        valor = valor * 100;

        /*Saida*/
        System.out.print ("Novo Valor " + valor);
    }
    
}