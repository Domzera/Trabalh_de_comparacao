import java.time.Duration;
import java.time.Instant;

public class trabalho {
	
	public static void main (String[] args) {
		
		//Inicia a contagem total do tempo de criação as arrays
		Instant comeca1 = Instant.now();
		
		//Cria as arrays
		Cria cria = new Cria();
		//Ordena as arrays em ordem crescente
		OrdenaCre ordenaCre = new OrdenaCre();
		//Ordena as arrays em ordem decrescente
		OrdenaDecre ordenaDecre = new OrdenaDecre();
		
		//Cria as array desordenadas
		int[] cem = cria.constroe(100);
		//Ainda nao estou usando os outros para testes, mas irei implantar
		int[] dezMil = cria.constroe(10000);
		int[] cemMil = cria.constroe(100000);
		int[] milhao = cria.constroe(1000000);
		
		
		//copia as arrays para poder ordenar em ordem crescente
		int[] cemCresce = cem;
		//Ainda nao estou usando os outros para testes, mas irei implantar
		int[] dezMilCresce = dezMil;
		int[] cemMilCresce = cemMil;
		int[] milhaoCresce = milhao;
		
		
		//copia as arrays para poder ordenar em ordem decrescente
		int[] cemDecresce = cem;
		//Ainda nao estou usando os outros para testes, mas irei implantar
		int[] dezMilDecresce = dezMil;
		int[] cemMildecresce = cemMil;
		int[] milhaodecresce = milhao;
		
		
		//ordena em ordem crescente crescente
		ordenaCre.ordenaCrescente(cemCresce,0,cemCresce.length);
		//ordena em ordem decrescente
		ordenaDecre.ordenaDecrece(cemDecresce,0,cemDecresce.length);
		
		//DEVERIA IMPREIMIR BAGUNÇADO
		System.out.println("\nBaguncado");
		imprime(cem);
		//DEVERIA IMPRIMIR EM ORDEM CRESCENTE
		System.out.println("\n\nCrescente");
		imprime(cemCresce);
		//IMPRIME EM ORDEM DECRESCENTE
		System.out.println("\n\nDecrescente");
		imprime(cemDecresce);
		
		//finaliza a contagem do tempo da criação das arrays
		Instant acaba1 = Instant.now();
		Duration duractionSelect1 = Duration.between(comeca1,acaba1);
		System .out.println("\n\nLevou " + duractionSelect1.toMillis() + " ms para fazer"  );	
	}
	
	//Imprime as arrays do jeito que foram criadas
	static void imprime(int[] mostra){
		for(int i =0;i<mostra.length;i++){
			System.out.print(mostra[i]+" - ");
		}
	}
}

