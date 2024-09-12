public class Multiples {
    public static void main(String[] args) {
        int i = 10;
        int s = 0;

        while (i > 0) {

            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                s++;
            }
            i--;
        }
        System.out.println(s);
    }
}
