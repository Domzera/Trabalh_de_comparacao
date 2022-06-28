import java.util.Arrays;

public class Merge {
	
	static int[] crescente (int[] oriCres) {
	//--Copia para ordenar crescente
		int[] respCre = Arrays.copyOf(oriCres,oriCres.length);
	
	//--Ordena com Merge
		OrdenaMergeCres ordenaMergeCresc = new OrdenaMergeCres();
		ordenaMergeCresc.ordenaMergeCres(respCre);

		return respCre;	
	}
	
	static int[] decrescente (int[] oriDecres) {
	//--Copia para ordenar crescente
		int[] respDec = Arrays.copyOf(oriDecres,oriDecres.length);
	
	//--Ordena com Merge
		OrdenaMergeDecres ordenaMergeDecres = new OrdenaMergeDecres();
		ordenaMergeDecres.ordenaMergeDecres(respDec);
	
	return respDec;
	}
}

