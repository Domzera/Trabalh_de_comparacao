public class OrdenaCre {
	
	//Ordena a array em ordem crescente
	static void ordenaCrescente(int[] cresce, int inicio, int termino){
		for(int i =inicio;i<termino-1;i++){
			int menor = buscaMenor(cresce,i,termino);
			troca(cresce,i,menor);
		}
	}
	//Aqui busca o menor
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

