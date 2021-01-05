public class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String texto) throws Exception
    {
		if (texto == null) throw new Exception ("PALAVRA AUSENTE");

		this.texto = texto;
    }
     
    public int getQuantidade (char letra) throws Exception
    {
		if(Character.isWhitespace(letra)) throw new Exception ("LETRA AUSENTE");
			
		int qtd = 0;
		for(int i = 0; i < this.texto.length(); i++ ){
			if(this.texto.charAt(i) == letra)
				qtd++;
		}    
		return qtd;
    }
    
    public int getTamanho ()
    {
        return this.texto.length();
    }

    public int getPosicaoDaIezimaOcorrencia (int i, char letra) throws Exception
    {
    	int vez = -1;
    	int pos = -1;
    	
        for(int j = 0; j < this.texto.length(); j++) {
			if(this.texto.charAt(j) == letra) {
				vez++;
				
				if(vez == i) {
					pos = j;
					break;
				}
			}
		}
			
        if(vez == -1) throw new Exception("NAO TEM ESTA LETRA");
			
		return pos;
    }

   
	@Override
    public String toString ()
    {
        return this.texto;
    }
	@Override
    public boolean equals (Object obj)
    {
        if(this == obj) return true;
        
        if(obj == null) return false;
        
        if(this.getClass() != obj.getClass()) return false;
        
        Palavra plv = (Palavra)obj;
        
        if(this.texto != plv.texto) return false;
        
        return true;
    }
	@Override
    public int hashCode ()
    {
        int ret = 10;
        
        ret = 11 * ret + new String (this.texto).hashCode();
        
        if(ret < 0) ret =- ret;
        
        return ret;
    }
	@Override
    public int compareTo (Palavra palavra)
    {
        return this.texto.compareTo(palavra.texto);
    }
}
