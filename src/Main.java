import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập quãng đường: ");
        double distance = Double.parseDouble(scanner.nextLine());
        Bus bus = new Bus(distance);
        System.out.println(bus);

        Train train = new Train(distance);
        System.out.println(train);

        Plane plane = new Plane(distance);
        System.out.println(plane);
    }
}
