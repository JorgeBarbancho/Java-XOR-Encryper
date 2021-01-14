package XOREncrypter;

public class TextABinari {
    
    public static String [] textABinari(String text){
                
        char caracter;
        int codigoASCII;
        String binari;
        String [] binaris = new String [text.length()];

        for (int i=0;i<text.length();i++){

                caracter = text.charAt(i);
                codigoASCII = (int) caracter;
                binari = "";

                for(int j=7;j>=0;j--){
                        if(codigoASCII>=Math.pow(2, j)){
                                codigoASCII-=Math.pow(2,j);
                                binari +="1";
                        }else{
                                binari+="0";
                        }
                }
                binaris[i]= binari.toString();
        }
        return binaris;
    }    
}
