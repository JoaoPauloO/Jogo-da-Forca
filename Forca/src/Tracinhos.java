public class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
		// verifica se qtd não é positiva, lançando uma exceção.
		if(qtd < 0)
			throw new Exception ("QUANTIDADE DE TRACINHOS INVALIDA");
			
		// instancia this.texto com um vetor com tamanho igual qtd.
		this.texto = new char[qtd];
		
		// preenche this.texto com underlines (_).
		for(int i = 0; i < qtd; i++){
			this.texto[i] = 95; 
		}
    }

    public void revele (int posicao, char letra) throws Exception
    {
			if(posicao < 0 || posicao > this.texto.length) throw new Exception ("POSICAO INVALIDA");
		
		this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos ()
    {
        for (int i = 0; i < this.texto.length; i++){
			if(this.texto[i] == 95)
				return true;
		}
		return false;
    }
	@Override
    public String toString ()
    {
        String ret = "[ ";
        
        if(this.texto.length > 0){
			for(int i = 0; i < this.texto.length; i++){
				ret += this.texto[i]+" ";
			}
			ret += "]";
		}
		
		return ret;
    }
	@Override
    public boolean equals (Object obj)
    {
        
        if(this == obj) return true;
        
        if(this == null) return false;
        
        if(this.getClass() != obj.getClass()) return false;
        
        Tracinhos trc = (Tracinhos)obj;
        
        for(int i = 0; i < this.texto.length; i++){
			if(this.texto[i] != trc.texto[i]) 
				return false;
		}
		return true;
    }

	@Override
    public int hashCode ()
    {
        int ret = 10;
        for(int i = 0; i < this.texto.length; i++){
			if(this.texto[i] != 95){
				ret = 11 * ret + new Integer (this.texto[i]).hashCode();
				
				if(ret < 0) ret =- ret;
			}
		}  
		return ret;
	}

    public Tracinhos (Tracinhos t) throws Exception // construtor de cópia
    {
        if(t == null)
			throw new Exception("OBJETO AUSENTE PARA REALZIAR A COPIA");
			
		this.texto = new char[t.texto.length];
			
		for(int i = 0; i < this.texto.length; i++) {
			this.texto[i] = t.texto[i];
		}
    }

    public Object clone ()
    {
        Tracinhos ret = null;
        
        try {
			ret = new Tracinhos(this);
		} catch (Exception erro) {}
		
		return ret;
    }
}



