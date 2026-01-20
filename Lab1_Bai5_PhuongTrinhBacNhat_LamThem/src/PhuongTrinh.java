//Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
//nhập từ bàn phím
import java.util.Scanner;
public class PhuongTrinh {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Nhập a và b
    System.out.print("Nhập hệ số a: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập hệ số b: ");
    double b = scanner.nextDouble();
    if(a == 0){
      if(b == 0){
        System.out.print("Phương trình vô số nghiệm!");
      }
      else{
        System.out.print("Phương trình vô nghiệm!");
      }
    }
    else{
      // ax + b = 0 -> x = -b/a
      double x = -b / a;
      System.out.printf("Nghiệm của phương trình: x = %.2f", x);
    }
  }
}
