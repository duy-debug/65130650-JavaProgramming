// Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
// Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
// Yếu: điểm < 5
// Trung bình: 5 <= điểm < 6.5
// Khá: 6.5 <= điểm < 7.5
// Giỏi: 7.5<= điểm < 9
// Xuất sắc: điểm >= 9
// Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
import java.util.Scanner;
public class SinhVien {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 1. Nhập số sinh viên
    System.out.print("Nhập số sinh viên: ");
    int n = scanner.nextInt();
    scanner.nextLine(); // bỏ dòng thừa

    String[] hoTen = new String[n];
    double[] diem = new double[n];

    // 2. Nhập dữ liệu
    for (int i = 0; i < n; i++) {
      System.out.println("Sinh viên thứ " + (i + 1));
      System.out.print("Họ tên: ");
      hoTen[i] = scanner.nextLine();

      System.out.print("Điểm: ");
      diem[i] = scanner.nextDouble();
      scanner.nextLine(); // bỏ dòng thừa
    }

    // 3. Xuất danh sách sinh viên
    System.out.println("\nDANH SÁCH SINH VIÊN:");
    for (int i = 0; i < n; i++) {
      System.out.println("Họ tên: " + hoTen[i]);
      System.out.println("Điểm: " + diem[i]);
      System.out.println("Học lực: " + xepLoai(diem[i]));
      System.out.println("---------------------");
    }

    // 4. Sắp xếp tăng dần theo điểm (Bubble Sort)
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (diem[i] > diem[j]) {
          // đổi điểm
          double tempDiem = diem[i];
          diem[i] = diem[j];
          diem[j] = tempDiem;

          // đổi họ tên tương ứng
          String tempTen = hoTen[i];
          hoTen[i] = hoTen[j];
          hoTen[j] = tempTen;
        }
      }
    }

    // 5. Xuất danh sách sau khi sắp xếp
    System.out.println("\nDANH SÁCH SAU KHI SẮP XẾP THEO ĐIỂM:");
    for (int i = 0; i < n; i++) {
      System.out.println("Họ tên: " + hoTen[i]);
      System.out.println("Điểm: " + diem[i]);
      System.out.println("Học lực: " + xepLoai(diem[i]));
      System.out.println("---------------------");
    }
  }

  // Hàm xếp loại học lực
  public static String xepLoai(double diem) {
    if (diem < 5) {
      return "Yếu";
    } else if (diem < 6.5) {
      return "Trung bình";
    } else if (diem < 7.5) {
      return "Khá";
    } else if (diem < 9) {
      return "Giỏi";
    } else {
      return "Xuất sắc";
    }
  }
}
