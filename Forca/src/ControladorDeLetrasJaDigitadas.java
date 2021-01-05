public class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.letrasJaDigitadas = " ";
    }

    public boolean isJaDigitada (char letra)
    {
        for(int i = 0; i < letrasJaDigitadas.length(); i++){
			if(letra == this.letrasJaDigitadas.charAt(i)) return true;
		}
        return false;
    }

    public void registre (char letra) throws Exception
    {
		if(this.isJaDigitada(letra)) throw new Exception ("LETRA JA DIGITADA");
			
		this.letrasJaDigitadas += letra;
	}
	@Override
    public String toString ()
    {
		String ret = "[ ";
		
		for(int i = 1; i < letrasJaDigitadas.length(); i++){
			ret += letrasJaDigitadas.charAt(i)+", ";
		}
		return ret += "]";
    }
	@Override
    public boolean equals (Object obj)
    {
        
        if(this == obj) return true;
        
        if(obj == null) return false;
        
        if(this.getClass() != obj.getClass()) return false;
        
        ControladorDeLetrasJaDigitadas ctr = (ControladorDeLetrasJaDigitadas)obj;
        
        if(this.letrasJaDigitadas != ctr.letrasJaDigitadas) return false;
        
        return true;
    }
	@Override
    public int hashCode ()
    {
        int ret = 10;
         
        ret = 11 * ret + new String(this.letrasJaDigitadas).hashCode();
         
        if(ret < 0) ret =- ret;
         
        return ret;
    }

    public ControladorDeLetrasJaDigitadas(ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
    throws Exception // construtor de cópia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        if(controladorDeLetrasJaDigitadas == null)
			throw new Exception("OBJETO AUSENTE PARA REALZIAR A COPIA");
		
		this.letrasJaDigitadas = controladorDeLetrasJaDigitadas.letrasJaDigitadas;
    }

    public Object clone ()
    {
        // criar uma cópia do this com o construtor de cópia e retornar
        ControladorDeLetrasJaDigitadas ret = null;
        
        try {
			ret = new ControladorDeLetrasJaDigitadas (this);
		} catch(Exception erro) {}
		
		return ret;
    }
}
