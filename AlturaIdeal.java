import java.util.Scanner;

public class AlturaIdeal {
        public static void main(String args[]){

            int sexo;
            float altura, pesoideal;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite sua altura: " );
            altura = teclado.nextFloat();
            System.out.println("Digite 1 para Masculo e 2 para Feminino: " );
            sexo = teclado.nextInt();

            if (sexo == 1) {
                pesoideal = 72.7f * altura - 58;

            }
            else {
                pesoideal = 62.1f * altura - 44.7f;

            }
                System.out.println("seu peso ideal deveria ser " +pesoideal);


        }

}

