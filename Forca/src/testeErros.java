public class testeErros {
	
	public static void main (String[] args) {
		try {
			ControladorDeErros ctr = new ControladorDeErros(10);
			ControladorDeErros ctr2 = new ControladorDeErros(10);
			System.out.println("Iguais? "+ctr.equals(ctr2));
			System.out.println(ctr); //toString
			ctr.registreUmErro(); //registrando erros
			ctr.registreUmErro(); //registrando erros
			System.out.println(ctr); //toString
			System.out.println("Ja atingiu? "+ctr.isAtingidoMaximoDeErros()); //quantidade maxima de erros
			System.out.println("HashCode: "+ctr.hashCode()); //HashCode
			System.out.println();
			
			ControladorDeErros copia1 = new ControladorDeErros(ctr);
			System.out.print("erros da copia: "+copia1);
			ctr.registreUmErro();
			System.out.println(" erros do original: "+ctr);
			System.out.println();
			ControladorDeErros copia2 = (ControladorDeErros)ctr.clone();
			System.out.print("erros da copia2: "+copia2);
			ctr.registreUmErro();
			System.out.println(" erros do original: "+ctr);
			System.out.println();
			System.out.println("erros do copia1: "+copia1);
			System.out.println("erros do copia2: "+copia2);
			
		} catch(Exception erro) {
			System.err.print(erro.getMessage());
		}
	}
}

