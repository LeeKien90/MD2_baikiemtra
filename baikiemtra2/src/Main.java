import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap kich thuoc col: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];

        do {
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.printf("arr[%d][%d]=", i, j);
                        arr[i][j] = Integer.parseInt(sc.nextLine());
                    }
                }
                    break;
                case 2:
                    System.out.println("Mang moi la: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int tongCheo=0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i==j){
                                tongCheo+=arr[i][j];
                                System.out.printf("%d\t",arr[i][j]);
                            }
                        }
                    }System.out.println(" Tong gia tri cheo chinh la = "+tongCheo);
                    int tongCheophu=0;
                    for (int i=0;i<row; i++){
                        for (int j = 0; j < col; j++) {
                            if (i+j==col-1){
                                tongCheophu+=arr[i][j];
                                System.out.printf("%d\t",arr[i][j]);
                            }
                        }
                    }System.out.println(" Tong gia tri cheo phu la = "+tongCheophu);
                    break;
                case 4:
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-5");
            }

        }while (true);



    }
}