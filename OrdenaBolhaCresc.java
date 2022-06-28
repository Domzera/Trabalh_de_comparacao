public class OrdenaBolhaCresc {
	
	static void ordenaBolhaCresc (int[] cresce) {
		int cont=1;
		while(cont!=0){
			cont=0;
			for(int y = 0;y<cresce.length-1;y++){
				if(cresce[y]>cresce[y+1]){
					troca(cresce,y,y+1);
					cont++;
				}
			}
		}
	}
	
	static void troca(int[] esse, int origem, int destino){
		int valorTem = esse[origem];		
		esse[origem]=esse[destino];
		esse[destino]=valorTem;
	}
}

