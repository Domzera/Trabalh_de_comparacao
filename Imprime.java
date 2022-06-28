public class Imprime {
	
	static void imprimeLimpo (int[] mostraLimpo) {
		System.out.println("Sem formatacao");
		for(int i =0;i<mostraLimpo.length;i++){
			System.out.print(mostraLimpo[i]);
		}
	System.out.println("\n");
	}
	
	static void imprimeTraco (int[] mostraTraco) {
		System.out.println("Separados por tracos");
		for(int i =0;i<mostraTraco.length;i++){
			System.out.print(mostraTraco[i]+" - ");
		}
	System.out.println("\n");
	}
	
	static void imprimePorLinha (int[] mostraPorLinha) {
		System.out.println("Pulando linha");
		for(int i =0;i<mostraPorLinha.length;i++){
			System.out.println(mostraPorLinha[i]);
		}
	System.out.println("\n");
	}
}

