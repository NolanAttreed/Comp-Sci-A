
public class NumberMethods {
	public static boolean isPrime(int n) {
		boolean prime = false;
		int divisors = 0;
		if(n > 1) {
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					divisors++;
				}
			}
			
			if(divisors == 1) {
				prime = true;
			}
		}
			
		return prime;
	}
	
	public static int divisorSum(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		boolean prime = isPrime(n);
		int sum = divisorSum(n);
		
		if(sum < n && prime == false) {
			strong = true;
		}

		return strong;
	}
	
	public static void printDivisors(int n) {
		System.out.print("All divisors of " + n + " are: ");
		int divisor = 1;
		while(divisor < n) {
			if(n % divisor == 0) {
				System.out.print(divisor + " ");
			}
			divisor++;
		}
		System.out.println();
	}
	
	public static void printPrimes(int n) {
		System.out.print("All prime numbers less than " + n + " are: ");
		int number = 2;
		while(number < n) { 
			boolean prime = isPrime(number);
			if(prime == true) {
				System.out.print(number + " ");
			}
			number++;
		}
		System.out.println();
	}
	
	public static void printComposites(int n) {
		System.out.print("All composite numbers less than " + n + " are: ");
		int number = 2;
		while(number < n) { 
			boolean prime = isPrime(number);
			if(prime == false) {
				System.out.print(number + " ");
			}
			number++;
		}
		System.out.println();
		
	}
	
	public static void printStrong(int n) {
		System.out.print("All strong numbers less than " + n + " are: ");
		int number = 2;
		while(number < n) {
			boolean strong = isStrong(number);
			if(strong == true) {
				System.out.print(number + " ");
			}
			number++;
		}
		System.out.println();
		
	}
	
	public static void printWeak(int n) {
		System.out.print("All weak numbers less than " + n + " are: ");
		int number = 2;
		while(number < n) {
			boolean prime = isPrime(number);
			if(prime == false) {
				boolean strong = isStrong(number);
				if(strong == false) {
					System.out.print(number + " ");
				}
			
			}
			number++;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		printDivisors(30);
		printPrimes(30);
		printComposites(30);
		printStrong(30);
		printWeak(30);
	}

}
