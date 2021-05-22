import java.util.Scanner;

public class Mangdachieu {
    void nhapMang() {
        Scanner sc = new Scanner(System.in);
        int row, colum;
        System.out.println("Nhập só hàng: ");
        row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        colum = sc.nextInt();
        int[][] arr = new int[row][colum];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        xuatMang(arr);
        System.out.println("Các phần tử trên đường chéo chính: ");
        timDuongCheo(arr);
        sapxep(arr);
    }

    void xuatMang(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void timDuongCheo(int[][] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                    tong = tong + arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trên đừng cheos: " + tong);
    }

    void sapxep(int[][] arr) {
        int temp = arr[0][0];
        System.out.println("Các phần tử ở hàng 2: ");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
              if(arr[1][i]>arr[1][j]){
                  temp= arr[1][i];
                  arr[1][i]=arr[1][j];
                  arr[1][j]=temp;
              }
//                System.out.println(arr[1][i]);
                }

            }

        }
    }



