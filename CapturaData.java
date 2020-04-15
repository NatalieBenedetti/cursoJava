import java.util.Scanner;

public class CapturaData{
    public static void main(String args[]){

        Scanner teclado;
        teclado = new Scanner(System.in);
        int data, dia, mes, ano, res;

        System.out.print("Por favor digite a data ");
        data = teclado.nextInt();

        ano = data % 10000; /* ano e o resto da divisao*/
        res = data / 10000;
        
        dia = res / 100; 
        mes = res % 100; /* mes e o resto da divisao*/
        

        System.out.println("Ano = " +ano);
        System.out.println("Mes = " +mes);
        System.out.println("Dia = " +dia); 

    }

}
