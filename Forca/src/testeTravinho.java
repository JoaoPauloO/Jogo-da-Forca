public class testeTravinho {
	
	public static void main (String[] args) {
		try {
			Tracinhos trc = new Tracinhos (10);
			for(int i = 0; i < 10; i++) {
				trc.revele(i, 'A');
				System.out.println(trc);
				System.out.println("Tem tracinho ainda? "+trc.isAindaComTracinhos());
			}
			System.out.println(trc);
			trc.revele(5,'B');
			trc.revele(0,'C');
			System.out.println(trc);
			Tracinhos trc2 = new Tracinhos (10);
			trc2.revele(5,'B');
			trc2.revele(0,'C');
			System.out.println(trc2);
			System.out.println("Igual? "+trc.equals(trc2)); // equals
			System.out.println("HashCode: "+trc.hashCode()); // hashCode
			
			Tracinhos copia1 = new Tracinhos(trc);
			System.out.print("copia1: "+copia1);
			trc.revele(7,'U');
			System.out.println(" original: "+trc);
			Tracinhos copia2 = (Tracinhos)trc.clone();
			System.out.print("copia2: "+copia2);
			trc.revele(9,'P');
			System.out.println(" original: "+trc);
			System.out.println("copia1: "+copia1);
			System.out.print("copia2: "+copia2);
			
		} catch(Exception erro) {
			System.err.print(erro.getMessage());
		}
	}
}

