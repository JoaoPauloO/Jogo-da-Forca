public class testeDigitadas {
	
	public static void main (String[] args) {
		try {
			ControladorDeLetrasJaDigitadas ctr = new ControladorDeLetrasJaDigitadas ();
			ctr.registre('A');
			ctr.registre('B');
			ctr.registre('C');
			System.out.println(ctr);
			//ctr.registre('A');
			System.out.println("HashCode: "+ctr.hashCode());
			
			ControladorDeLetrasJaDigitadas copia1 = new ControladorDeLetrasJaDigitadas(ctr);
			ctr.registre('D');
			System.out.println("\nCopia1: "+copia1);
			System.out.println("Original: "+ctr);
			System.out.println("\nCopia1: "+copia1);
			System.out.println();
			ControladorDeLetrasJaDigitadas copia2 = (ControladorDeLetrasJaDigitadas)ctr.clone();
			ctr.registre('E');
			System.out.println("\nCopia2: "+copia2);
			System.out.println("Original: "+ctr);
			System.out.println("\nCopia2: "+copia2);
			
			
		} catch(Exception erro) {
			System.err.print(erro.getMessage());
		}
	}
}

