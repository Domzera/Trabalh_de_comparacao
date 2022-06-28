public class OrdenaMergeCres {
	
	static void ordenaMergeCres (int[] cresce) {
		divide(cresce,0,cresce.length);
	}
	
	static void divide(int[] cresce,int comeca,int acaba){
		if(acaba-comeca>=2){
			int meio=(comeca+acaba)/2;
			divide(cresce,comeca,meio);
			divide(cresce,meio,acaba);
			intercala(cresce,comeca,meio,acaba);
		}
	}
	
	static void intercala(int[] original,int comecai,int meioi,int acabai){
		int comprimentoA = meioi;
		int comprimentoB = acabai;
		int comprimentoC = acabai-comecai;
		int[] outra = new int[comprimentoC];
		int lugarA=comecai,lugarB=meioi,lugarC=0;
		
		while(lugarA<comprimentoA && lugarB<comprimentoB){
			if(original[lugarA]<original[lugarB]){
				outra[lugarC++]=original[lugarA++];
			}else{
				outra[lugarC++]=original[lugarB++];
			}
		}
		
		while(lugarA<comprimentoA){
			outra[lugarC++]=original[lugarA++];
		}
		while(lugarB<comprimentoB){
			outra[lugarC++]=original[lugarB++];
		}
		for(int i=0;i<outra.length;i++){
			original[i+comecai]=outra[i];
		}
	}
}

