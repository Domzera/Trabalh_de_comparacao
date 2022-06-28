public class OrdenaInsercaoCre {
	
	static void ordenaInsercaoCre (int[] cresce) {
		for(int i=1+1;i<cresce.length;i++){
			int posicao = i;
			while(posicao>0 && cresce[posicao]<cresce[posicao-1]){
				troca(cresce,posicao,posicao-1);
				posicao--;
			}
		}
	}
	
	static void troca(int[] esse,int origem,int destino){
		int valorTemporario = esse[origem];
		esse[origem] = esse[destino];
		esse[destino] = valorTemporario;
	}
}

