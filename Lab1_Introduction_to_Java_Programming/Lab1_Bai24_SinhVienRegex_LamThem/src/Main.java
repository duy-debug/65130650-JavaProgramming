import java.util.Scanner;
/*
Nhập mảng 5 sinh viên (mỗi sinh viên gồm họ tên, email, số điện thoại, chứng
minh nhân dân). Kiểm tra và thông báo lỗi nếu nhập không đúng định dạng email,
số điện thoại và CMND.
HƯỚNG DẪN:
✓ Thực hiện tương tự như bài 3 để nhập danh sách sinh viên
✓ Kiểm soát dữ liệu nhập vào bằng cách sử dụng biểu thức chính qui (tham
khảo slide bài giảng) để kiểm tra và thông báo lỗi
o Email
o Số điện thoại
o CMND
 */
public class Main {
  static Scanner sc = new Scanner(System.in);

  // Regex
  static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
  static final String PHONE_REGEX = "^0\\d{9}$";
  static final String CMND_REGEX = "^\\d{9}(\\d{3})?$";

  public static void main(String[] args) {
    SinhVien[] ds = new SinhVien[5];

    for (int i = 0; i < ds.length; i++) {
      System.out.println("Nhập sinh viên thứ " + (i + 1));

      System.out.print("Họ tên: ");
      String hoTen = sc.nextLine();

      String email;
      do {
        System.out.print("Email: ");
        email = sc.nextLine();
        if (!email.matches(EMAIL_REGEX)) {
          System.out.println("Email không hợp lệ!");
        }
      } while (!email.matches(EMAIL_REGEX));

      String sdt;
      do {
        System.out.print("Số điện thoại: ");
        sdt = sc.nextLine();
        if (!sdt.matches(PHONE_REGEX)) {
          System.out.println("Số điện thoại không hợp lệ!");
        }
      } while (!sdt.matches(PHONE_REGEX));

      String cmnd;
      do {
        System.out.print("CMND: ");
        cmnd = sc.nextLine();
        if (!cmnd.matches(CMND_REGEX)) {
          System.out.println("CMND không hợp lệ!");
        }
      } while (!cmnd.matches(CMND_REGEX));

      ds[i] = new SinhVien(hoTen, email, sdt, cmnd);
    }

    System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
    for (SinhVien sv : ds) {
      System.out.println(sv);
    }
  }
}
