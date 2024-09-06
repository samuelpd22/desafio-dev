public class Service {


    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, c;
        if (number == a || number == b) {
            return true;
        }
        c = a + b;
        while (c <= number) {
            if (c == number) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }


}

