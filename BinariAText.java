package XOREncrypter;

public class BinariAText {
    
    public static String binariAText(String [] binaris){
        
        String text="";
        
        for(int j=0;j<binaris.length;j++){
            char [] bin = binaris[j].toCharArray();
            int decimal =0;
            int contador=0;
            
            for(int i=bin.length-1;i>-1;i--){
                if(bin[contador]=='1'){
                        decimal+=Math.pow(2, i);
                }
                contador++;
            }
            
            text+= (char) decimal;
        }
        return text;
    }    
}
