
public class FindingNumber {

	public static void main(String[] args) {
		int[] numb = new int [] {1,2,3,5,7,9,0};
		int search =5;
		
		boolean isThere=false;
		
		for (int numbers :numb) {
			if(numbers==search) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("number is found");
		}else {
			System.out.println("Number not found");
		}

	}

}
