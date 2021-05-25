import java.util.Scanner;

public class BT9 {

    void b2() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }

    void b3() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += ((2.0 * i) + 1) / ((2.0 * i) + 2);
        }
        System.out.println(sum);

    }

    void soDaoNguoc() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số nguyên n: ");
        n = sc.nextInt();
        int res = 0;
        int original = n;
        while (n != 0) {
            res = res * 10 + (n % 10);
            n = n / 10;
        }
        System.out.println(res);

        if (res == original) {
            System.out.println("n là số đối xứng:" + original);
        } else
            System.out.println("n k là số đối xứng" + original);
    }


}
