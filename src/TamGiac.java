import java.util.Scanner;

public class TamGiac {

    void inTamgiac() {
        Scanner sc = new Scanner(System.in);
        int height;
        do {
            System.out.println("Nhập vào chiều cao của tam giác ");
            height = sc.nextInt();
        } while (height <= 0);

        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
