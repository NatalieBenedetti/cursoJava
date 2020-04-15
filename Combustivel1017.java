import java.util.Scanner;

public class Combustivel1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempo, velocidade;
        float distancia, gastos;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        distancia = tempo * velocidade;

        gastos = distancia / 12;

        System.out.printf("%.3f\n",gastos);



    }
}
    