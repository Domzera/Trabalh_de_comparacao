public class OrdenaSortDecres{	
		
	static void ordenaSortDecresc (int[] decresce) {
		int menor = 0;
		for(int i =decresce.length-1;i<0;i++){
			if(decresce[i]<decresce[i++]){
				menor++;
			}
		}
		troca(decresce,menor);
	}
	
	static void troca(int[] esse,int tamanho){
		int temp = esse[esse.length-1];
		esse[esse.length-1] = esse[tamanho];
		esse[tamanho] = temp;
	}
}

