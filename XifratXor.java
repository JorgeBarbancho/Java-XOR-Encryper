package XOREncrypter;

import static XOREncrypter.BinariAText.binariAText;
import static XOREncrypter.TextABinari.textABinari;
import java.util.Scanner;
import static XOREncrypter.Xifrar_Desxifrar.xifrar_Desxifrar;
 
public class XifratXor { 
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\t   ------------------");
        System.out.println("\t  |  * XIFRAT XOR * |");
        System.out.println("\t   ------------------");

        System.out.println("Ingresa el Missatge: ");
        String missatge  = sc.nextLine();
        System.out.println("Ingresa clau");
        String clau = sc.nextLine();
        
        System.out.println("\t   -----------------------------------------");
        System.out.println("\t  |              * XIFRANT *               |");
        System.out.println("\t   -----------------------------------------");

        //Convertim el missatge en un array de binaris
        String[] binaris = textABinari(missatge);
        String[] clauX = textABinari(clau);
        imprimir(binaris);
        System.out.println(" : <-- bytes del missatge");
        System.out.println("\t   -----------------------------------------");
        imprimir(clauX);
        System.out.println(" : <-- bytes de clau");
        System.out.println("\t   -----------------------------------------");
        //S'envia a Xifrar
        String[] xifrat = xifrar_Desxifrar(binaris, clauX);
        imprimir(xifrat);
        System.out.println(" : <-- bytes de cipher");
        System.out.println("\t   -----------------------------------------");
        System.out.print(" Missatge Xifrat: ");
        System.out.println(binariAText(xifrat));       
        //S'envia dexifrar;
        String[] desxifrat = xifrar_Desxifrar(xifrat, clauX);
        System.out.println("\t   -----------------------------------------");
        System.out.println("\t  |             * DESXIFRANT *             |");
        System.out.println("\t   -----------------------------------------");
        System.out.print(" Missatge Desxifrat: ");
        System.out.println(binariAText(desxifrat));

    }
    
    public static void imprimir(String [] text){

            for(int i=0;i<text.length;i++){
                    System.out.print(text[i]+" ");
            }
    }
}
 

