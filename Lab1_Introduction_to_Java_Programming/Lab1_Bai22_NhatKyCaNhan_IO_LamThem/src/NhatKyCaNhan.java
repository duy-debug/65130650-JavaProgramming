import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class NhatKyCaNhan {

  static final String TEN_FILE = "nhatky.txt";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int luaChon;
    do {
      System.out.println("\n=== NHẬT KÝ CÁ NHÂN ===");
      System.out.println("1. Ghi nhật ký");
      System.out.println("2. Đọc nhật ký");
      System.out.println("0. Thoát");
      System.out.print("Chọn chức năng: ");
      luaChon = scanner.nextInt();
      scanner.nextLine(); // xoá bộ nhớ đệm

      switch (luaChon) {
        case 1:
          ghiNhatKy(scanner);
          break;
        case 2:
          docNhatKy();
          break;
        case 0:
          System.out.println("Đã thoát chương trình!");
          break;
        default:
          System.out.println("Lựa chọn không hợp lệ!");
      }
    } while (luaChon != 0);

    scanner.close();
  }

  // Hàm dùng để ghi nội dung nhật ký vào file
  private static void ghiNhatKy(Scanner sc) {
    // Yêu cầu người dùng nhập nội dung nhật ký
    System.out.println("Nhập nội dung nhật ký:");
    String noiDung = sc.nextLine();
    // BufferedWriter giúp ghi dữ liệu nhanh và ổn định hơn
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(TEN_FILE, true))) {
      // Tạo định dạng ngày giờ (ngày-tháng-năm giờ:phút:giây)
      DateTimeFormatter dinhDang = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      // Ghi thời gian hiện tại vào file
      bw.write("[" + dinhDang.format(LocalDateTime.now()) + "]");
      // Xuống dòng sau khi ghi thời gian
      bw.newLine();
      // Ghi nội dung nhật ký mà người dùng vừa nhập
      bw.write(noiDung);
      // Xuống dòng để nội dung không dính vào dòng khác
      bw.newLine();
      // Ghi dòng phân cách giữa các lần ghi nhật ký
      bw.write("----------------------------");
      // Xuống dòng để ghi nhật ký lần 2,3,4... để biết
      bw.newLine();
      // Thông báo ghi thành công
      System.out.println("Đã lưu nhật ký thành công!");
    } catch (IOException e) {
      // Thông báo lỗi nếu có vấn đề khi ghi file
      System.out.println("Lỗi khi ghi nhật ký!");
    }
  }

  // Hàm đọc nhật ký
  private static void docNhatKy() {
    File file = new File(TEN_FILE);
    if (!file.exists()) { // file không tồn tại
      System.out.println("Chưa có nhật ký nào!");
      return;
    }
    try (BufferedReader br = new BufferedReader(new FileReader(TEN_FILE))) {
      String dong;
      System.out.println("\n=== NỘI DUNG NHẬT KÝ ===");
      while ((dong = br.readLine()) != null) {// đọc từng dòng và in nếu hết file null thì trả về giá trị null kết thúc.
        System.out.println(dong);
      }
    } catch (IOException e) {
      System.out.println("Lỗi khi đọc nhật ký!");
    }
  }
}
