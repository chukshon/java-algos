// Wilson primes satisfy the following condition. Let 
// P represent a prime number.

// Then, (P−1)!+1P∗P should give a whole number, where 
// P! is the factorial of P

// Your task is to create a function that returns true if the given number is a Wilson prime and false otherwise.



public class wilsonPrime {
    
    public static boolean isWilsonPrime(long n){
        long modulus = n * n;
        long product = 1;
        for (long factor = 2; factor < n; factor++)
            product = (product * factor) % modulus;
        return product + 1 == modulus;
    }

   public static void main(String[] args) {
    System.out.println(isWilsonPrime(1));

   }
}
