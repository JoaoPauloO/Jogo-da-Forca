public class ControladorDeErros implements Cloneable
{
    private int qtdMax, qtdErr=0;

    public ControladorDeErros (int qtdMax) throws Exception
    {
		if(qtdMax < 0) throw new Exception ("QUANTIDADE INVALIDA");
		this.qtdMax = qtdMax;
    }

    public void registreUmErro () throws Exception
    {
        qtdErr++;
        
        if(this.qtdErr == this.qtdMax) throw new Exception ("SUAS CHANCES ACABARAM");
    }

    public boolean isAtingidoMaximoDeErros  ()
    {
        if(this.qtdErr == this.qtdMax) return true;
        
        return false;
    }
	@Override
    public String toString ()
    {
        return this.qtdErr + "/" + this.qtdMax;
    }
	@Override
    public boolean equals (Object obj)
    {
        if(this == obj) return true;
        
        if(obj == null) return false;
        
        if(this.getClass() != obj.getClass()) return false;
        
        return true;       
    }
	@Override
    public int hashCode ()
    {
        int ret = 10;
        
        ret = 11 * ret + new Integer(this.qtdMax).hashCode();
        ret = 11 * ret + new Integer(this.qtdErr).hashCode();
        
        if(ret < 0) ret =- ret;
        
        return ret;
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception // construtor de cópia
    {
        if(c == null) throw new Exception("OBJETO NULO PARA REALZIAR A COPIA");
			
		this.qtdMax = c.qtdMax;
		this.qtdErr = c.qtdErr;
    }

    public Object clone ()
    {
        ControladorDeErros ret = null;
        try {
			ret = new ControladorDeErros(this);
		} catch(Exception erro) {}
		
		return ret;
    }

}
