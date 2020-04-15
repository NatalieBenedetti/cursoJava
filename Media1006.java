import java.util.Scanner;


public class Media1006{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        float a, b, c;
        float media;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        
        media = ((a*2) + (b*3) + (c*5)) / 10;
        System.out.printf("MEDIA = %.1f\n",media);


    }
    
}