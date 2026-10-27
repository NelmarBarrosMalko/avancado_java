public class Lambda {
        interface FactorialNumber {
            boolean isFactor(int a, int b);
        }
    public static void main(String[] args) {
    FactorialNumber isFactor = (int a, int b) -> (b % a) == 0;

    if (isFactor.isFactor(2, 8)) {
        System.out.println("2 is a factor of 8");
    }
    }
}
