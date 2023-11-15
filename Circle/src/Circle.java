/**
 * @(#)Circle.java
 *
 * Circle application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
public class Circle {
    private double bankinh; // Thu?c t�nh b�n k�nh

    // Constructor
    public Circle(double bankinh) {
        this.bankinh = bankinh;
    }

    // Getter v� setter cho b�n k�nh
    public double getbankinh() {
        return bankinh;
    }

    public void setbankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    // Phuong th?c t�nh di?n t�ch
    public double dientich() {
        return Math.PI * Math.pow(bankinh, 2);
    }

    // Phuong th?c t�nh chu vi
    public double chuvi() {
        return 2 * Math.PI * bankinh;
    }

    public static void main(String[] args) {
        // truy c?p v� ch?nh s?a t?i d�y
        Circle myCircle = new Circle(5.0);

        // In th�ng tin v? h�nh tr�n
        System.out.println("Ban kinh cua hinh tron: " + myCircle.getbankinh());
        System.out.println("Dien tich cua hinh tron: " + myCircle.dientich());
        System.out.println("Chu vi cua hinh tron: " + myCircle.chuvi());

        //** Ch?nh s?a b�n k�nh v� t�nh to�n l?i di?n t�ch v� chu vi
       /* myCircle.setRadius(7.5);
        System.out.println("\nSau khi ch?nh s?a b�n k�nh:");
        System.out.println("B�n k�nh c?a h�nh tr�n: " + myCircle.getRadius());
        System.out.println("Di?n t�ch c?a h�nh tr�n: " + myCircle.calculateArea());
        System.out.println("Chu vi c?a h�nh tr�n: " + myCircle.calculatePerimeter());*/
    }
}
