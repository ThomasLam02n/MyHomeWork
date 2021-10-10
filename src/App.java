import java.util.Scanner;

public class App {
   public static void main(String[] args) {
    Scanner bienNhap = new Scanner(System.in);
    int m = bienNhap.nextInt();
    String[] months = { "Not months is zero !!!", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    System.out.println(months[m]);
   }
}
