

public class Main {
    public static void main(String[] args) {
        String dynyaHyi = "0";
        int NUM = 1;
        String word = "7";
        dynyaHyi=(NUM+word);
        System.out.println(dynyaHyi + word+NUM);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else
            System.out.println("Вы сохранили ноль");
    }
}