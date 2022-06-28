import java.util.Arrays;

public class Sort {
	
	static int[] sortCres (int[] oriCresSort) {
	//--Copia para ordenar crescente
		int[] respCre = Arrays.copyOf(oriCresSort,oriCresSort.length);
	
	//--Ordena com Merge
		OrdenaSortCresc ordenaSortCres = new OrdenaSortCresc();
		return null;//ordenaSortCres.ordenaSortCresc(respCre);
		
	}
	
	static int[] sortDec (int[] oriDecresSort) {
	//--Copia para ordenar crescente
		int[] respDec = Arrays.copyOf(oriDecresSort,oriDecresSort.length);
	
	//--Ordena com Merge
		OrdenaSortDecres ordenasortDecres = new OrdenaSortDecres();
		ordenasortDecres.ordenaSortDecresc(respDec);

		return respDec;	
	}
}

