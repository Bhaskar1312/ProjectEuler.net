package problems_2_to_25;

public class Problem7 {

	public static void main(String[] args) {
		int count=0;
		int p=2;
		while(count<=10001) {
			if(IsPrime(p)) {
				count++;
				System.out.println(p+" is "+count+"th prime");	
			}
//			else System.out.println(p+" is not a prime");
			p++;
		}
//		System.out.println(p+" is "+count+"th prime ");

	}

	public static boolean IsPrime(int p) {
		if(p==1)
			return false;
		if(p==2 || p==3)
			return true;
		int i=2;
		while(i<=Math.sqrt(p)) {
			if(p%i==0)
				return false;
			i++;
		}
		return true;
	}

}
