import java.util.Scanner;

public class Ex1038 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod, quant;
        float total;

        cod = teclado.nextInt();
        quant = teclado.nextInt();

        switch (cod) {
            case 1 : 
                total = (quant * 4f);
                System.out.printf("Total: R$ %.2f\n",total);
                break;
            
            case 2 :
                total = (quant * 4.50f);
                System.out.printf("Total: R$ %.2f\n",total);
                break;

             case 3 :
                total = (quant * 5f);
                System.out.printf("Total: R$ %.2f\n",total);
                break;

             case 4 :
                total = (quant * 2f);
                System.out.printf("Total: R$ %.2f\n",total);
                break;

             case 5 :
                total = (quant * 1.50f);
                System.out.printf("Total: R$%10.2f\n",total);
                break;

        }



   
   
    }
        

}
    