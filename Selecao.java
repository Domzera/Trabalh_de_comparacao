import java.util.Arrays;

public class Selecao {
	
	static int[] crescente (int[] oriCrec) {
		
	//-----Copia para ordenar por selecao-----
		//Copia as arrays para poder ordenar em ordem crescente por Selecao
		int[] respCre =Arrays.copyOf(oriCrec,oriCrec.length);
		
	//-----Ordenar por Selecao-----
		//Funcao que ordena por selecao em ordem crescente
		OrdenaSelecaoCre ordenaSelecaoCre = new OrdenaSelecaoCre();
		//Ordena em ordem crescente por selecao
		ordenaSelecaoCre.ordenaSelecaoCre(respCre);
		
		return respCre;
	}

	static int[] decescente(int[] oriDec){
		
		//Copia as arrays para poder ordenar em ordem decrescente por Selecao
		int[] respDec =Arrays.copyOf(oriDec,oriDec.length);
		
		//Funcao que ordena por selecao em ordem decrescente
		OrdenaSelecaoDecre ordenaSelecaoDecre = new OrdenaSelecaoDecre();
		//Ordena em ordem decrescente por selecao
		OrdenaSelecaoDecre.ordenaSelecaoDecrece(respDec);
		
		return respDec;
	}
}
