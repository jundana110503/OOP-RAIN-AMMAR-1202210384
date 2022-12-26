import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        Calculation calculation = new Calculation();

        do {
            try {
              System.out.println("Menu:");
              System.out.println("1. luas persegi");
              System.out.println("2. luas lingkaran");
              System.out.println("3. luas trapesium");
              System.out.println("0. exit");
              System.out.print("pilihan: ");

              int choice = scanner.nextInt();
              switch (choice) {
                case 1:
                  System.out.print("sisi Persegi: ");
                  double radius = scanner.nextDouble();
                  calculation.setSquare(radius);
                  
                case 2:
                  System.out.print("Jari-Jari Lingkaran: ");
                  double side = scanner.nextDouble();
                  calculation.setCircle(side);
                
                case 3:
                  System.out.print("Sisi Atas: ");
                  double a = scanner.nextDouble();
                  System.out.print("Sisi Bawah: ");
                  double b = scanner.nextDouble();
                  System.out.print("Tinggi: ");
                  double t = scanner.nextDouble();
                  calculation.setTrapezoid(a, b, t);
                  
                case 0:
                  repeat = false;
                  break;
                default:
                  System.out.println("Tidak Valid!");
                  break;
              }
            } catch (InputMismatchException e) {
              System.out.println("Tidak Valid!");
              scanner.nextLine();
              
            } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
            }
          } while (repeat);
    }
}
