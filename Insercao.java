import java.util.Arrays;

public class Insercao {
	
	static int[] crescente (int[] oriCrec) {
		
	//-----Copia para ordenar por selecao-----
		//Copia as arrays para poder ordenar em ordem crescente por Selecao	
		int[] respCre =Arrays.copyOf(oriCrec,oriCrec.length);
		
	//-----Ordenar por Selecao-----
		//Funcao que ordena por selecao em ordem crescente
		OrdenaInsercaoCre ordenaInserCre = new OrdenaInsercaoCre();
		//Ordena em ordem crescente por selecao
		ordenaInserCre.ordenaInsercaoCre(respCre);
		
		return respCre;
	}
	
	static int[] decrescente(int[] oriDec){
		
		//Copia as arrays para poder ordenar em ordem decrescente por Selecao
		int[] respDec =Arrays.copyOf(oriDec,oriDec.length);
		
		//Funcao que ordena por selecao em ordem decrescente
		OrdenaInsercaoDecre ordenaInserDecrec = new OrdenaInsercaoDecre();
		//Ordena em ordem decrescente por selecao
		ordenaInserDecrec.ordenaInsercaoDecre(respDec);
		
		return respDec;
	}
}

