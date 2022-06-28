import java.util.Arrays;
import java.util.Collections;

public class ArrayS {
	
	static int[] arraySOrdenCresc(int[] cresce) {
		int[] respCre = Arrays.copyOf(cresce,cresce.length);
		Arrays.sort(respCre);
		return respCre;
	}
	
	static int[] arraySOrdenDecr(int[] decresce) {
		int[]respDec = Arrays.copyOf(decresce, decresce.length);
		
		
		Arrays.sort(respDec);
		int[]troca = Arrays.copyOf(respDec, respDec.length);
		
		int y=0;
		for(int i=decresce.length-1;i>=0;i--){
			
			troca[y]=respDec[i];
			y++;
		
		}
		return troca;
	}
}

