public class ChuNhat {
  public double rong;
  public double dai;

  public ChuNhat(double rong, double dai) {
    this.rong = rong;
    this.dai = dai;
  }
  public double getChuVi(){
   return 2 * (rong + dai);
  }
  public double getDienTich(){
    return rong * dai;
  }
  public void xuat(){
    System.out.println("\nHÌNH CHỮ NHẬT");
    System.out.printf("Chiều dài: %.2f\n", dai);
    System.out.printf("Chiều rộng: %.2f\n", rong);
    System.out.printf("Chu vi: %.2f\n", getChuVi());
    System.out.printf("Diện tích: %.2f", getDienTich());
  }
}
