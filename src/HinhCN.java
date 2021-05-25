import java.util.Scanner;

public class HinhCN {

    void inHCN() {
        Scanner sc = new Scanner(System.in);
        int height, width;
        do {
            System.out.println("Nhập height: ");
            height = sc.nextInt();
        } while (height <= 0);

        do {
            System.out.println("Nhập width: ");
            width = sc.nextInt();
        } while (width <= 0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

}



