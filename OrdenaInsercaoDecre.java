public class OrdenaInsercaoDecre {
	
	static void ordenaInsercaoDecre(int[] decrece) {
		for(int i=1;i<decrece.length;i++){
			int posicao = i;
			while(posicao<0 && decrece[posicao]>decrece[posicao-1]){
				troca(decrece,posicao,posicao-1);
				posicao--;
			}
		}		
	}
	
	static void troca (int[] esse,int origem, int destino){
		int valorTemporario = esse[origem];
		esse[origem] = esse[destino];
		esse[destino] = valorTemporario;		
	}
}

