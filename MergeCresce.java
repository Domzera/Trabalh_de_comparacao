public class MergeCresce {
	
	public static void MergeCresce (int[] cresce) {
		int menores = 0,soma=0,resp=0;
		for(int i =0;i<cresce.length;i++){
			soma=soma+cresce[i];
		}
		resp=soma/cresce.length;
	}
}

