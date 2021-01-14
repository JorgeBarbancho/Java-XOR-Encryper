package XOREncrypter;

import static XOREncrypter.PortaXOR.PortaXOR;

public class Xifrar_Desxifrar {
    
    
    public static String [] xifrar_Desxifrar (String [] missatge,String [] clau){
                
        String[] resultat = new String[missatge.length];
        int punter = 0;
        for (int i=0;i<missatge.length;i++){            
            resultat[i]= PortaXOR(missatge[i],clau[punter]);
            punter++;
            if(punter==clau.length)punter=0;
        }
        return resultat;
    }    
}
