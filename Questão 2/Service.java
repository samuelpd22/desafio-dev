public class Service {


    public static int ContadorLetraA(String frase) {
        int count = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
