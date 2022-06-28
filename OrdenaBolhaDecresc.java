public class OrdenaBolhaDecresc {
	
	static void ordenaBolhaDecresc (int[] decre) {
		int cont=1;
		while(cont!=0){
			cont=0;
			for(int y = 0;y<decre.length-1;y++){
				if(decre[y]<decre[y+1]){
					troca(decre,y,y+1);
					cont++;
				}
			}
		}
	}
	static void troca(int[] esse, int origem, int destino){
		int valorOrigem = esse[origem];
		int valorDestino = esse[destino];
		
		esse[origem]=valorDestino;
		esse[destino]=valorOrigem;
	}
}
