package homework5;

public class Main {

    public static int summa_cifr_chisla(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + summa_cifr_chisla(n / 10);
    }

    public static boolean proverka_na_prostotu(int n, int i) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % i == 0)
            return false;
        else if (i < n / 2)
            return proverka_na_prostotu(n, i + 1);
        else
            return true;
    }

     public static void razlojenie_na_mnojiteli(int n, int k) {
            if (k > n / 2) {
                System.out.print(n);
                return;
            }
            if (n % k == 0) {
                System.out.print(k + ",");
                razlojenie_na_mnojiteli(n / k, k);
            }
            else {
                razlojenie_na_mnojiteli(n, ++k);
            }
    }


    public static void main(String[] args) {
        System.out.print("Сумма цифр числа ");
        System.out.println(summa_cifr_chisla(555123));
        System.out.print("Является число 55 простым? ");
        System.out.println((proverka_na_prostotu(55, 2) ? "Да" : "Нет"));
        System.out.print("Разложение на множители числа 126 | ");
        razlojenie_na_mnojiteli(126, 2);

    }
}