public class testePalavra {
	
	public static void main (String[] args) {
		int qtd = 0;
		try {
			 
			Palavra plv = new Palavra("TEXT");
			Palavra plv2 = new Palavra("TEX");
			//Palavra plv = BancoDePalavras.getPalavraSorteada(); // palavra sorteada
			System.out.println("Igual? "+plv.equals(plv2)); //equals
			System.out.println("Comparacao: "+plv.compareTo(plv2)); // campareto
			System.out.println("Palavra eh: "+plv); // tostring
			qtd = plv.getQuantidade('T'); // quantidade
			System.out.println("Caractere T");
			System.out.println("quantidade: "+qtd); // atributo quantidade
			System.out.println("tamanho: "+plv.getTamanho()); // tamanho da palavra
			for(int i = 0; i < plv.getTamanho(); i++) {
				System.out.println("Posicao: "+plv.getPosicaoDaIezimaOcorrencia(i, 'T')); // posicoes 
			}
			System.out.println("HashCode: "+plv.hashCode()); // hashCode
			
		} catch(Exception erro) {
			System.err.print(erro.getMessage());
		}
	}
}

