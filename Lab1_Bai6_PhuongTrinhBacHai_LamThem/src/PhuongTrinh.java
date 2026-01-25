import java.util.Scanner;
//Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
//nhập từ bàn phím
public class PhuongTrinh {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập a: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập b: ");
    double b = scanner.nextDouble();
    System.out.print("Nhập c: ");
    double c = scanner.nextDouble();
    if(a == 0){
      // ax2 + bx + c = 0 -> ax + b = 0 giải phương trình bậc nhất
      if(b == 0){
        if(c == 0){
          System.out.print("Phương trình vô số nghiệm!");
        }
        else{
          System.out.print("Phương trình vô nghiệm!");
        }
      }
      else{
        double x = -c / b;
        System.out.printf("Nghiệm của phương trình bậc nhất: x = %.2f", x);
      }
    }else { // a != 0 tính delta
      double delta = Math.pow(b,2) - 4 * a * c;
      if(delta < 0){
        System.out.print("Phương trình vô nghiệm!");
      }
      else if(delta == 0){
        double x = -b / (2 * a);
        System.out.printf("Nghiệm kép x1 = x2 = %.2f", x);
      }
      else{
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("x1 = %.2f, x2 = %.2f", x1, x2);
      }
    }
  }
}
