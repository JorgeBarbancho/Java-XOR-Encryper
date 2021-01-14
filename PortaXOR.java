
package XOREncrypter;

public class PortaXOR {
    
    public static String PortaXOR (String binari1 , String binari2){
                
        char[] arrayBinari1 = binari1.toCharArray();
        char[] arrayBinari2 = binari2.toCharArray();
        char[] arrayResultat = new char[arrayBinari1.length];
        
        for (int i=0;i<arrayBinari1.length;i++){
            if(arrayBinari1[i]==(arrayBinari2[i])){
                arrayResultat[i] = '0';
            } else {
                arrayResultat[i] = '1';
            }
        }    
    return String.valueOf(arrayResultat);
    }    
}
