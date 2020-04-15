import java.util.Scanner;

public class Ex1051 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, impostoTot, sobra, sobra2, imposto1, imposto2;


        salario = teclado.nextFloat();

        if (salario <= 2000f){
            System.out.println("Isento");
        }
        else {
            if ((salario > 2000f) && (salario <= 3000f)){
                sobra = salario -2000.01f;
                impostoTot = sobra * 0.08f;
                System.out.println("R$ " +impostoTot);
             }
             else {
                 if ((salario > 3000) && (salario <= 4500)) {
                     sobra = salario -2000.01f;
                     imposto1 = sobra * 0.08f;
                     sobra2 = salario - 3000.01f;
                     imposto2 = sobra2 * 0.18f;
                     impostoTot = imposto1 + imposto2;
                     System.out.println("R$ " +impostoTot);

                 }
             }
            

        }



    }

}
