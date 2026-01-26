public class Main {
  public static void main(String[] args) {
    QLDS qlds = new QLDS();
    HocSinh hs1 = new HocSinh("Nguyen Van A", 18, "Khanh Hoa", "0123", "12A1", "Bong da");
    GiaoVien gv1 = new GiaoVien("Tran Van B", 45, "Nha Trang", "0999", "Toan", "Tu nhien");
    qlds.them(hs1);
    qlds.them(gv1);
    qlds.inDS();
    System.out.println("--- SAU KHI XÓA ---");
    qlds.xoa("Nguyen Van A");
    qlds.inDS();
  }
}
