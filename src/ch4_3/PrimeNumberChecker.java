package ch4_3;

public class PrimeNumberChecker {
	
	/**
	 * 
	 * @param number
	 * @return if isPrime
	 */
	public boolean isPrime(int number) {
		if (number <= 1) return false;
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
}
