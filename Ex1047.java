import java.util.Scanner;

public class Ex1047 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int HoraIn, HoraFin, MinutoIn, MinutoFin, HoraTot, MinutoTot;

        HoraIn = teclado.nextInt();
        MinutoIn = teclado.nextInt();
        HoraFin = teclado.nextInt();
        MinutoFin = teclado.nextInt();

        HoraTot = HoraFin - HoraIn;

        if (HoraFin > HoraIn){

        }      

        MinutoTot = 60 + (MinutoFin - MinutoIn);


        System.out.println("O JOGO DUROU " +HoraTot+ " HORA(S) E " +MinutoTot+ "MINUTO(S)");
        
       

    }
        

}
    
