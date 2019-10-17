package problems_2_to_25;

public class Problem10 extends Problem7{
	public static void main(String[] args) {
		long sum=0;
		int p=2;
		for(p=2;p<=2000000;p++) {
			if(IsPrime(p)) {
				sum +=(long)p;
			}
		}
		System.out.println(sum);
	}
}
