//Programa para convertir decadas a años
package convertirdecadasdias;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ConvertirDecadasDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner convertir = new Scanner(System.in);
        int Decadas=10;
        int Años=365;
        int NumDecadas;
        int DecadasAños;
        int Conversion;
        System.out.println("Ingrese el numero de decadas que desea convertir");
        NumDecadas = convertir.nextInt();
        DecadasAños=Decadas*Años;
        Conversion=DecadasAños*NumDecadas;
        System.out.println("El numero de decadas equivale:"+Conversion+" dias");
    }
    
}
