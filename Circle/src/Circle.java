/**
 * @(#)Circle.java
 *
 * Circle application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
public class Circle {
    private double bankinh; // Thu?c tính bán kính

    // Constructor
    public Circle(double bankinh) {
        this.bankinh = bankinh;
    }

    // Getter và setter cho bán kính
    public double getbankinh() {
        return bankinh;
    }

    public void setbankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    // Phuong th?c tính di?n tích
    public double dientich() {
        return Math.PI * Math.pow(bankinh, 2);
    }

    // Phuong th?c tính chu vi
    public double chuvi() {
        return 2 * Math.PI * bankinh;
    }

    public static void main(String[] args) {
        // truy c?p và ch?nh s?a t?i dây
        Circle myCircle = new Circle(5.0);

        // In thông tin v? hình tròn
        System.out.println("Ban kinh cua hinh tron: " + myCircle.getbankinh());
        System.out.println("Dien tich cua hinh tron: " + myCircle.dientich());
        System.out.println("Chu vi cua hinh tron: " + myCircle.chuvi());

        //** Ch?nh s?a bán kính và tính toán l?i di?n tích và chu vi
       /* myCircle.setRadius(7.5);
        System.out.println("\nSau khi ch?nh s?a bán kính:");
        System.out.println("Bán kính c?a hình tròn: " + myCircle.getRadius());
        System.out.println("Di?n tích c?a hình tròn: " + myCircle.calculateArea());
        System.out.println("Chu vi c?a hình tròn: " + myCircle.calculatePerimeter());*/
    }
}
