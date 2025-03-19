public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n < 2) return false; 
        // Numbers less than 2 are not prime
        for (int i = 2; i * i <= n; i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(num + " is prime? " + isPrime(num));
    }
}
