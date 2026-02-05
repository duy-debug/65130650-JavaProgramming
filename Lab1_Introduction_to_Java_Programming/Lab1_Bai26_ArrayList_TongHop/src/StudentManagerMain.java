import java.util.*;

public class StudentManagerMain {

  // Danh sách sinh viên dùng ArrayList
  static List<Student> list = new ArrayList<>();

  // Scanner dùng để nhập dữ liệu từ bàn phím
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    // Vòng lặp menu chạy liên tục cho đến khi chọn Thoát
    while (true) {
      showMenu();

      // Đọc lựa chọn từ người dùng
      int choice = Integer.parseInt(sc.nextLine());

      // Xử lý theo lựa chọn
      switch (choice) {
        case 1:
          addStudent();      // Thêm sinh viên
          break;
        case 2:
          removeStudent();   // Xóa sinh viên theo ID
          break;
        case 3:
          findStudent();     // Tìm sinh viên theo tên
          break;
        case 4:
          sortByMark();      // Sắp xếp theo điểm
          break;
        case 5:
          showStudents();    // Hiển thị danh sách
          break;
        case 0: {
          System.out.println("Thoat chuong trinh!");
          return;            // Thoát chương trình
        }
        default:
          System.out.println("Lua chon khong hop le!");
          break;
      }
    }
  }

  // Hiển thị menu chức năng
  static void showMenu() {
    System.out.println("\n===== MENU =====");
    System.out.println("1. Them sinh vien");
    System.out.println("2. Xoa sinh vien theo ID");
    System.out.println("3. Tim sinh vien theo ten");
    System.out.println("4. Sap xep theo diem");
    System.out.println("5. Hien thi danh sach");
    System.out.println("0. Thoat");
    System.out.print("Chon: ");
  }

  // Thêm sinh viên mới vào danh sách
  static void addStudent() {
    System.out.print("Nhap ID: ");
    String id = sc.nextLine();

    System.out.print("Nhap ten: ");
    String name = sc.nextLine();

    System.out.print("Nhap diem: ");
    double mark = Double.parseDouble(sc.nextLine());

    // Tạo đối tượng Student và thêm vào ArrayList
    list.add(new Student(id, name, mark));
    System.out.println("Them thanh cong!");
  }

  // Xóa sinh viên theo ID
  static void removeStudent() {
    System.out.print("Nhap ID can xoa: ");
    String id = sc.nextLine();

    // Duyệt ngược để tránh lỗi khi remove
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i).getId().equalsIgnoreCase(id)) {
        list.remove(i); // Xóa sinh viên
        System.out.println("Xoa thanh cong!");
        return;
      }
    }

    // Nếu không tìm thấy
    System.out.println("Khong tim thay sinh vien!");
  }

  // Tìm sinh viên theo tên (không phân biệt hoa thường)
  static void findStudent() {
    System.out.print("Nhap ten can tim: ");
    String keyword = sc.nextLine().toLowerCase();

    boolean found = false;

    // Duyệt danh sách sinh viên
    for (Student s : list) {
      if (s.getName().toLowerCase().contains(keyword)) {
        System.out.println(s); // Gọi toString()
        found = true;
      }
    }

    // Nếu không có sinh viên phù hợp
    if (!found) {
      System.out.println("Khong co sinh vien phu hop!");
    }
  }

  // Sắp xếp sinh viên theo điểm tăng dần
  static void sortByMark() {
    Collections.sort(list, Comparator.comparingDouble(Student::getMark)
    );
    System.out.println("Da sap xep theo diem tang dan!");
  }

  // Hiển thị toàn bộ danh sách sinh viên
  static void showStudents() {
    if (list.isEmpty()) {
      System.out.println("Danh sach rong!");
      return;
    }

    for (Student s : list) {
      System.out.println(s);
    }
  }
}
