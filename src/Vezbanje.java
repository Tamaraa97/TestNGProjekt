
public class Vezbanje {
	public static int nadjiMin(int[]n) {
		int min = 0;
		for(int i=0;i<n.length;i++) {
			if(n[i]<min)
				min = n[i];
		}
		return min;
	}
}
