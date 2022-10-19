
public class PerfectNumbers {

	public static void main(String[] args) {
		//6-->1,2,3 (1+2+3=6)the sum of its divisors is equal to itself
		int number =28;
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total= total + i ;
			}
		}
		if(total==number) {
			System.out.println("Its a perfect number.");
		}else {
			System.out.println("Its not a perfect number.");
		}

	}

}
