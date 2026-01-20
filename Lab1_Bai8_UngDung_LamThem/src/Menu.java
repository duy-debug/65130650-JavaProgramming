import java.util.Scanner;
public class Menu {
  public static void giaiPTB1(){
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
  public static void giaiPTB2(){
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
  public static void tinhTienDien(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện sử dụng: ");
    double soDienSuDung = scanner.nextDouble();
    double soTien = 0;
    if(soDienSuDung >= 0 && soDienSuDung <= 50) {
      soTien = soDienSuDung * 1000;
    }
    if(soDienSuDung > 50) {
      soTien = (soDienSuDung - 50) * 1200 + 50 * 1000;
    }
    System.out.printf("Số tiền sử dụng: %.2f", soTien);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("1. Giải phương trình bậc nhất");
      System.out.println("2. Giải phương trình bậc 2");
      System.out.println("3. Tính tiền điện");
      System.out.println("4. Kết thúc");
      System.out.print("Nhập vào lựa chọn 1 hoặc 2 hoặc 3 hoặc 4: ");
    int luaChon = scanner.nextInt();
    switch(luaChon){
      case 1:
        giaiPTB1();
      break;
      case 2:
        giaiPTB2();
      break;
      case 3:
        tinhTienDien();
      break;
      case 4:
        System.out.print("Kết thúc!");
      break;
      default:
        System.out.print("Nhập số chưa hợp lệ!");
      break;
    }
  }
}
