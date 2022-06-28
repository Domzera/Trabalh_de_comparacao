import java.util.Arrays;

public class Bolha {
	
	static int[] crescente(int[] oriCrec) {
	
	//-----Copia para ordenar por Bolha-----
		//Copia as arrays para poder ordenar em ordem crescente por Bolhas
		int[] respCre =Arrays.copyOf(oriCrec,oriCrec.length);
		
	//-----Ordenar por Bolha-----
		//Funcao que ordena por bolha em ordem crescente
		OrdenaBolhaCresc ordenaBolhaCresc = new OrdenaBolhaCresc();
		//Ordena em ordem crescente por Bolha
		ordenaBolhaCresc.ordenaBolhaCresc(respCre);
		
		return respCre;
	}
	
	static int[] decrescente(int[] oriDecres){
		
	//Copia as arrays para poder ordenar em ordem decrescente por Bolha
		//Copia as arrays para poder ordenar em ordem decrescente por Bolhas
		int[] respDecre =Arrays.copyOf(oriDecres,oriDecres.length);
		
	//-----Ordenar por Bolha-----
		//Funcao que ordena por bolha em ordem decrescente
		OrdenaBolhaDecresc ordenaBolhaDecresc = new OrdenaBolhaDecresc();
		//Ordena em ordem decrescente por Bolha
		ordenaBolhaDecresc.ordenaBolhaDecresc(respDecre);
		
		return respDecre;
		
	}
}

