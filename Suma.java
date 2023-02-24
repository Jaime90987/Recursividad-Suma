public class Suma {

	private int n;
	
	Suma(int n) {
		this.n = n;
	}

	public int getSuma() {
		return calcular(n);
	}

	private int calcular(int n) {
		if(n == 1) {
			return 1;
		}
			
		return n + calcular(n - 1);
	}

}