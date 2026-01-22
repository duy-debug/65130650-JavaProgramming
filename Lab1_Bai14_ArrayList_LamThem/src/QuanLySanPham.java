import java.util.*;

public class QuanLySanPham {
  static Scanner scanner = new Scanner(System.in);
  static List<SanPham> list = new ArrayList<>();

  public static void main(String[] args) {
    int luaChon;
    do {
      System.out.println("\n===== MENU =====");
      System.out.println("1. Nhập danh sách sản phẩm");
      System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
      System.out.println("3. Tìm và xóa sản phẩm theo tên");
      System.out.println("4. Xuất giá trung bình của các sản phẩm");
      System.out.println("0. Thoát");
      System.out.print("Chọn chức năng: ");

      luaChon = scanner.nextInt();
      scanner.nextLine(); // clear buffer
      switch (luaChon) {
        case 1:
          nhapDanhSach();
          break;
        case 2:
          sapXepGiamDanTheoGia();
          break;
        case 3:
          timVaXoaTheoTen();
          break;
        case 4:
          xuatGiaTrungBinh();
          break;
        case 0:
          System.out.println("Thoát chương trình");
          break;
        default:
          System.out.println("Nhập không hợp lệ!");
      }
    } while (luaChon != 0);
  }

  // 1. Nhập danh sách sản phẩm từ bàn phím
  static void nhapDanhSach() {
    while (true) {
      SanPham sp = new SanPham();
      sp.nhap();
      list.add(sp);

      System.out.print("Nhập tiếp không? (y/n): ");
      if (scanner.nextLine().equalsIgnoreCase("n")) { // không phân biệt chữ hoa hay chữ thường
        break;
      }
    }
  }
  // 2. Sắp xếp giảm dần theo giá và xuất ra màn hình
  static void sapXepGiamDanTheoGia() {
    Comparator<SanPham> comp = (o1, o2) -> o2.donGia.compareTo(o1.donGia);
    list.sort(comp);
    if(list.isEmpty()){
      System.out.println("Danh sách sản phản phẩm trống");
      return;
    }
    System.out.println("\nDanh sách sau khi sắp xếp:");
    for (SanPham sp : list) {
      sp.xuat();
    }
  }
  // 3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím
  static void timVaXoaTheoTen() {
    if(list.isEmpty()){
      System.out.println("Danh sách sản phản phẩm trống");
      return;
    }
    System.out.print("Nhập tên sản phẩm cần xóa: ");
    String tenCanXoa = scanner.nextLine();

    Iterator<SanPham> iterator = list.iterator();
    boolean found = false;

    while (iterator.hasNext()) {
      SanPham sp = iterator.next();
      if (sp.ten.equalsIgnoreCase(tenCanXoa)) {
        iterator.remove();
        found = true;
      }
    }

    if (found) {
      System.out.println("Đã xóa sản phẩm!");
    } else {
      System.out.println("Không tìm thấy sản phẩm!");
    }
  }
  // 4. Xuất giá trung bình của các sản phẩm
  static void xuatGiaTrungBinh() {
    if(list.isEmpty()){
      System.out.println("Danh sách sản phản phẩm trống");
      return;
    }
    double tong = 0;
    for (SanPham sp : list) {
      tong += sp.donGia;
    }
    double trungBinh = tong / list.size();
    System.out.printf("Giá trung bình: %.2f" ,trungBinh);
  }
}
