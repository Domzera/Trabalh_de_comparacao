public class Cria {
	
		//Metodo que constroe as arrays
	static int[] constroe(int tamanho){
			int[] minha = new int[tamanho];
			for(int i=0; i<tamanho;i++){
				minha[i]=(int)(Math.random()*100+1);
			}
		return minha;
	}
}

