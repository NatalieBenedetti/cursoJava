import java.util.Scanner;

public class Cateleitoral {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: " );
        idade = teclado.nextInt();

        if (idade < 16) {
             System.out.println("Nao eleitor!!! ");
        }
        else { 
                if (( idade >= 18) && (idade <= 65)) {
                    System.out.println("Eleitor obrigatorios: entre 18 e 65 anos ");
                }
                else {
                    
                        System.out.println("Eleitor facultativos: entre 16 e 18 e maiores de 65 anos ");
                    

                }

        }


    }

}
