package labs1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца ");
        String Month = in.nextLine();
        System.out.println("Введите количество дней в месяце");
        int day = in.nextInt();
        if (day > 31) {
            System.out.println("В " + Month + "не может быть больше 31 дня");
            in.close();
        }
        else
        {
            System.out.println("В " + Month + " " + day + " дней");
            in.close();
        }
    }
}
