package shubha;


public class NewApp {
 public static void main(String[] args) {

	int sumOfOdd = 0 ;


		for(int num = 7; num <= 21 ; num++) {
			if(num % 2 != 0) {
				System.out.println(num);
				sumOfOdd += num ;
			}
		}
		
		System.out.println("sum of odd numbers : " + sumOfOdd);
		 
 }}
	