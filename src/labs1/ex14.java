package labs1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int op1 = in.nextInt();
        System.out.println((op1-1)+","+op1+","+(op1+1)+","+(((op1-1)+op1+(op1+1))*((op1-1)+op1+(op1+1))));
        in.close();    }
}
