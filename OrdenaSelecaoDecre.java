public class OrdenaSelecaoDecre {
	
	//Ordena a array em ordem decrescente
	static void ordenaSelecaoDecrece(int[] decresce){
		for(int i =0;i<decresce.length-1;i++){
			int menor = buscaMaior(decresce,i,decresce.length-1);
			troca(decresce,i,menor);
		}
	}
	//Aqui busca a maior
	static int buscaMaior(int[] decresce, int inicio, int termino){
		int menor=inicio;
		for(int atual =inicio+1; atual<termino;atual++){
			if(decresce[atual]>decresce[menor]){
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

