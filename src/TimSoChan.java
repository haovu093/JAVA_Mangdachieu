import java.util.Scanner;

public class TimSoChan {
    void timSoChan() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào n:");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phẩn tử: "+i);
            arr[i] = sc.nextInt();
        }
        int num = soChan(arr);
        if(num == -1)
            System.out.println("Không có số chẵn trong mảng");
        else
            System.out.println("Số chẵn cuối cùng trong mảng:  " + num);


        int res = timSoam(arr);
        if(res == 1)
            System.out.println("Không có số âm trong mảng");
        else
            System.out.println("Số âm đầu tiên trong mảng:  " + res);
    }

    int soChan(int arr[]) {
        int num = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0) {
                num = arr[i];
            }
        }
        return num;
    }
    int timSoam(int arr[]) {
        int min = 1;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i] && arr[i] < 0 ) {
                min = arr[i];
                break;
            }
        }
        return min;
    }

}

