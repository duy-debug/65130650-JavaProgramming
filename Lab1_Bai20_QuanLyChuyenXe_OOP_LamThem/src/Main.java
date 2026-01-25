/*
Công ty vận tải V quản lý thông tin là các chuyến xe.
Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.
Thực hiện các yêu cầu sau:
- Vẽ sơ đồ lớp cho bài tập.
- Xây dựng các lớp với chức năng thừa kế.
- Viết lớp QuanLyChuyenXe (bao gồm cả nội thành và ngoại thành) với các chức năng sau:
- Thêm chuyến xe, xuất danh sách các chuyến xe (danh sách có thể dùng cấu trúc mảng), in
thông tin từng chuyến xe. - Tính tổng doanh thu cho từng loại xe, tổng doanh thu cả hai loại xe.
Hàm main thực hiện các công việc:
- Khởi tạo các chuyến xe (3 ngoại thành, 3 nội thành)
- Thêm các chuyến xe đã khởi tạo vào đối tượng thuộc lớp QuanLyChuyenXe.
- In thông tin của từng chuyến xe. - Tổng doanh thu của xe ngoại thành. - Tổng doanh thu của xe nội thành.
- Tổng doanh thu của cả 2 loại xe.
 */
public class Main{
  public static void main(String[] args) {
    QuanLyChuyenXe ql = new QuanLyChuyenXe();
    // 3 xe nội thành
    ql.themChuyenXe(new ChuyenXeNoiThanh(1, 20, "79A-001", "Duy", "79A-001", 500000));
    ql.themChuyenXe(new ChuyenXeNoiThanh(2, 20, "79A-002", "Lực", "79A-002", 700000));
    ql.themChuyenXe(new ChuyenXeNoiThanh(3, 20, "79A-003", "An", "79A-003", 600000));

    // 3 xe ngoại thành
    ql.themChuyenXe(new ChuyenXeNgoaiThanh("Đà Nẵng", 3, "79B-001", "Hùng", "79A-005", 2000000));
    ql.themChuyenXe(new ChuyenXeNgoaiThanh("Huế", 4, "79B-002","Nga" , "79A-006", 1500000));
    ql.themChuyenXe(new ChuyenXeNgoaiThanh("Sài Gòn", 5, "79B-003","Lan" , "79A-007", 3000000));
    System.out.println("Danh sách các xe");
    ql.xuatDanhSach();
    System.out.println("Tổng doanh thu xe nội thành: " + ql.tinhDoanhThuNoiThanh());
    System.out.println("Tổng doanh thu xe ngoại thành: " + ql.tinhDoanhThuNgoaiThanh());
    System.out.println("Tổng doanh thu tất cả: " + ql.tinhTongDoanhThu());
  }
}