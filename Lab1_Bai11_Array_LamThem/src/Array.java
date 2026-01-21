import java.util.Arrays;
import java.util.Scanner;
// Viết chương trình nhập mảng số nguyên từ bàn phím.
// Sắp xếp và xuất mảng vừa nhập ra màn hình.
// Xuất phần tử có giá trị nhỏ nhất ra màn hình
// Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
public class Array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 1. Nhập số phần tử
    int n;
    do{
      System.out.print("Nhập số phần tử của mảng (n>0): ");
      n = scanner.nextInt();
    }while(n <= 0);

    int[] a = new int[n];
    // Nhập mảng
    for (int i = 0; i < n; i++) {
      System.out.printf("a[%d] = ", i);
      a[i] = scanner.nextInt();
    }
    // 2. Sắp xếp mảng
    Arrays.sort(a);
    System.out.print("Mảng sau khi sắp xếp:");
    for(int i = 0 ; i < n ; i++){
      System.out.print(a[i] + " ");
    }
    // 3. Tìm phần tử nhỏ nhất
    int min1 = a[0];
    for (int i = 1; i < n; i++) {
      min1 = Math.min(min1, a[i]);
    }
    System.out.println("\nPhần tử nhỏ nhất trong mảng: " + min1);
    // 4. Tính trung bình cộng các số chia hết cho 3
    int tong = 0;
    int dem = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] % 3 == 0) {
        tong += a[i];
        dem++;
      }
    }
    if (dem > 0) {
      double trungBinh = (double) tong / dem;
      System.out.printf("Trung bình cộng các số chia hết cho 3: %.2f",trungBinh);
    } else {
      System.out.print("Không có phần tử nào chia hết cho 3");
    }
  }
}
