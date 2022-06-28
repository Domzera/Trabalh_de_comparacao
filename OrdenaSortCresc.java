public class OrdenaSortCresc {
	
	static void ordenaSortCresc(int[] cresce){
	
		ordena(cresce,0,cresce.length);
		
	}
	
	static void ordena(int[] esse,int indice,int maior){
		if(maior-indice>=2){
			//int pivo = contaMenores(esse,indice,maior);
			
			//ordena(esse,indice,pivo);
			
			//ordena(esse,pivo+1,maior);
		}
	}
	
	/*
	static void contaMenores(int[] esse,int maior,int menor){
		int menores = maior;
		int posicaoDoPivo=menor-1;
		int pivo = esse[posicaoDoPivo];
		
		for(int atual = maior;atual<posicaoDoPivo;atual++){
			if(esse[atual]<pivo){
				troca(esse,atual,menores);
				menores++;
			}
		}
		troca(esse,posicaoDoPivo,menores);	
			
		return menores;
	}*/
	
	static void troca (int[] esse,int origem, int destino){
		int temp=esse[origem];
		esse[destino]=esse[origem];
		esse[origem]=temp;
	}
}
