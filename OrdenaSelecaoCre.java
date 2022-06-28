public class OrdenaSelecaoCre {
	
	//Ordena a array em ordem crescente
	static void ordenaSelecaoCre(int[] cresce){
		for(int i =0;i<cresce.length-1;i++){
			int menor = buscaMenor(cresce,i,cresce.length-1);
			troca(cresce,i,menor);
		}
	}
	//Aqui buscamos o menor
	static int buscaMenor(int[] cresce, int inicio, int termino){
		int menor=inicio;
		for(int atual =inicio+1; atual<termino;atual++){
			if(cresce[atual]<cresce[menor]){
				menor=atual;
			}
		}
		return menor;
	}
	//Aqui vamos trocar os valores
	static void troca(int[] cresce, int origem, int destino){
		int vOrigem=cresce[origem];
		int vDestino=cresce[destino];
		
		cresce[origem]=vDestino;
		cresce[destino]=vOrigem;
	}
}

