import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS {
  // qldsHS
  private List<HocSinh> dsHocSinh = new ArrayList<>();
  // qldsGVGD
  private List<GiaoVien> dsGiaoVien = new ArrayList<>();

  @Override
  public int them(CaNhan p) {
    if (p instanceof HocSinh) {
      dsHocSinh.add((HocSinh) p);
      return 1;
    }
    if (p instanceof GiaoVien) {
      dsGiaoVien.add((GiaoVien) p);
      return 1;
    }
    return 0;
  }

  @Override
  public int xoa(String ten) {
    // xóa học sinh
    for (HocSinh hs : dsHocSinh) {
      if (hs.hoTen.equalsIgnoreCase(ten)) {
        dsHocSinh.remove(hs);
        return 1;
      }
    }

    // xóa giáo viên
    for (GiaoVien gv : dsGiaoVien) {
      if (gv.hoTen.equalsIgnoreCase(ten)) {
        dsGiaoVien.remove(gv);
        return 1;
      }
    }
    return 0;
  }

  @Override
  public void inDS() {
    System.out.println("--- DANH SÁCH HỌC SINH ---");
    for (HocSinh hs : dsHocSinh) {
      System.out.println(hs.HienThiTT());
    }

    System.out.println("--- DANH SÁCH GIÁO VIÊN ---");
    for (GiaoVien gv : dsGiaoVien) {
      System.out.println(gv.HienThiTT());
    }
  }
}
