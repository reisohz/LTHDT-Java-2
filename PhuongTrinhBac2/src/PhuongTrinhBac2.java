/**
 * @(#)PhuongTrinhBac2.java
 *
 * PhuongTrinhBac2 application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    // Hàm t?o không tham s?
    public PhuongTrinhBac2() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    // Hàm t?o có 3 tham s?
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phuong th?c get/set cho a
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    // Phuong th?c get/set cho b
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Phuong th?c get/set cho c
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Phuong th?c tính delta
    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    // Phuong th?c tính nghi?m phuong trình
    public void tinhNghiem() {
        double delta = tinhDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a:");
        double a = scanner.nextDouble();

        System.out.println("Nhap b:");
        double b = scanner.nextDouble();

        System.out.println("Nhap c:");
        double c = scanner.nextDouble();

        PhuongTrinhBac2 pt = new PhuongTrinhBac2(a, b, c);

        System.out.println("He so a: " + pt.getA());
        System.out.println("He so b: " + pt.getB());
        System.out.println("He so c: " + pt.getC());

        System.out.println("Delta: " + pt.tinhDelta());
        pt.tinhNghiem();

        scanner.close();
    }
}
