import java.util.Scanner;
//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
// Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
public class HinhChuNhat {
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   // Nhập cạnh a và b
   System.out.print("Nhập cạnh a: ");
   double a = scanner.nextDouble();
   System.out.print("Nhập cạnh b: ");
   double b = scanner.nextDouble();
   // Tính chu vi và diện tích, tìm cạnh nhỏ nhất
   double chuVi = (a + b) * 2;
   double dienTich = a * b;
   double canhNhoNhat = Math.min(a,b);
   // In ra màn hình
   System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
   System.out.printf("Diện tích: %.2f\n" ,dienTich);
   System.out.printf("Cạnh nhỏ nhất: %.2f" , canhNhoNhat);
  }
}
