package br.com.kentec;

public class Decoder {
	
	public void decoderStringHex(String codigo) {
		System.out.println(codigo.length());
		
		StringBuilder resultado = new StringBuilder();
		
        for (int i = 0; i < codigo.length(); i += 2) {
            String byteHex = codigo.substring(i, i + 2);         
            int valor = Integer.parseInt(byteHex, 16);       
            resultado.append((char) valor);                  
        }

        resultado.toString();

	    String[] montaSenha = new String[7];
	    
	    montaSenha = resultado.toString().split("");	  

	    var a = montaSenha[1];
	    var b = montaSenha[3];
	    var c = montaSenha[5];
	    var d = montaSenha[7];
	    var e = montaSenha[9];
	    var f = montaSenha[11];
	    var g = montaSenha[13];
	    var h = montaSenha[15];
	    var passClean = a+b+c+d+e+f+g+h; 	 
	   System.out.println(passClean);
	 
	}
}
