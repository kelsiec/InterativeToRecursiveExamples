public class OddDigit {
    public static boolean hasAnOddDigit(int num) {
        num = Math.abs(num);
        return hasAnOddDigitHelper(num);
    }

    private static boolean hasAnOddDigitHelper(int num) {
        if (num > 0) {
            if (num % 2 == 1) {
                return true;
            }
            return hasAnOddDigitHelper(num / 10);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(1234)); // return true
        System.out.println(hasAnOddDigit(2468)); // return false
    }
}
