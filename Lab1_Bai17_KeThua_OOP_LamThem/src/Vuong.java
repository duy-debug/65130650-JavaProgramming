public class Vuong extends ChuNhat{
  public Vuong(double canh) {
    super(canh,canh);
  }
  @Override
  public void xuat(){
    System.out.println("\nHÌNH VUÔNG");
    System.out.printf("Cạnh hình vuông: %.2f", this.dai);
  }
}
