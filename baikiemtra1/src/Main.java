import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        do {
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.println("Sự lựa chon của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Nhap gia tri cac phan tu mang
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("arr[%d]=", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    //hien thi gia tri cac phan tu mang
                    System.out.println("Gia tri cac phan tu mang: ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    break;
                case 4:
                    int min = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] < arr[0]) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Phan tu nho nhat trong mang la: " + min);

                    int max = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > arr[0]) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Phan tu lon nhat trong mang la: " + max);
                    break;
                case 5:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = i+1; j < arr.length; j++) {
                            if (arr[i] < arr[j]) {
                                int a = arr[j];
                                arr[j] = arr[i];
                                arr[i] = a;
                            }
                        }
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");

            }

        } while (true);

    }
}