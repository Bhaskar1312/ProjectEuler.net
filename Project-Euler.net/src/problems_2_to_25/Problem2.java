package problems_2_to_25;

public class Problem2 {

	public static void main(String[] args) {
		int f0=1;
		int f1=1;
		int f2=f0+f1;
		int sum=0;int n=1;
		while(f2<4000000) {
			f2=f0+f1;
			f0=f1;
			f1=f2;
			if(f2%2==0)
				{sum +=f2;
//				System.out.println(n+"\t"+sum);
				}
			n++;
			System.out.println(n+"\t"+sum+"\t"+f2);
		}
		System.out.println(n+"\t"+sum+"\t"+f2);

	}

}
