package labs1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {

        }
        System.out.println("Введите Имя: ");
        String name = in.nextLine();
        System.out.println("Введите Фамилию: ");
        String Surname = in.nextLine();
        System.out.println("Введите Отчество: ");
        String Middlename = in.nextLine();
        System.out.println("Привет " + Surname+ " " + name+ " " + Middlename);
        in.close();
    }
}
