import java.util.Scanner;

//  Viết chương trình cho phép nhập họ và tên sinh viên,
//  điểm trung bình từ bàn phím sau đó xuất ra màn hình.
public class SinhVien {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Nhập thông tin sinh viên và điểm
    System.out.print("Nhập họ tên sinh viên: ");
    String hoTen = scanner.nextLine();
    System.out.print("Nhập điểm trung bình: ");
    double diemTrungBinh = scanner.nextDouble();

    // In ra màn hình thông tin sinh viên và điểm
    System.out.println("Họ tên: " + hoTen);
    System.out.print("Điểm trung bình: " + diemTrungBinh);
  }
}
