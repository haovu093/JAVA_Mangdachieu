import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;
import java.util.Scanner;

public class Mangmotchieu {


    void timSNT() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            a[i] = sc.nextInt();
        }
        int tong = 0;
        System.out.println("Các số nguyên tố trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (checkSNT(a[i])) {
                System.out.println((a[i]));
                tong = tong + a[i];
            }
        }
        System.out.println("Tổng các số nguyên tố trong mảng: " + tong);

        // Nhấp ví trí k, chèn vị trí k vào mảng
        System.out.println("Nhập vị trí cần chèn k=");
        int k = sc.nextInt();
        System.out.println("Nhập giá trị chèn:");
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[k] = x;
            a[i] = a[i];

        }
        System.out.println("Mảng sau khi chèn");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }


    boolean checkSNT(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}






