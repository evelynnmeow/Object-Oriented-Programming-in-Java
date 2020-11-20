package demos;

public class ArrayLocation {
	private double corrds[];
	
	public ArrayLocation (double [] corrds) {
		this.corrds = corrds;
		
		
	}
	
	public static void main (String[] args) {
		double corrds[] = {5.0, 0.0};
		ArrayLocation accra = new ArrayLocation (corrds);
		corrds[0] = 32.9;
		corrds[1] = -117.2;
		System.out.println(accra.corrds[0]);
	}

}
