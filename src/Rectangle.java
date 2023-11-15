/**
 * @(#)Rectangle.java
 *
 * Rectangle application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
public class Rectangle {
    private int len;
    private int wid;

    // Constructor v?i gi� tr? m?c d?nh l� 10
    public Rectangle() {
        this.len = 10;
        this.wid = 10;
    }

    // Constructor v?i gi� tr? c� th? di?u ch?nh
    public Rectangle(int len, int wid) {
        if (isValidDimension(len) && isValidDimension(wid)) {
            this.len = len;
            this.wid = wid;
        } else {
            System.out.println("Kich thuoc khong hop le. Su dung gia tri mac dinh (10 x 10).");
            this.len = 10;
            this.wid = 10;
        }
    }

    // Phuong th?c "set" cho chi?u d�i
    public void setChieuDai(int len) {
        if (isValidDimension(len)) {
            this.len = len;
        } else {
            System.out.println("Chieu dai khong hop le. Chieu dai khong thay doi.");
        }
    }

    // Phuong th?c "set" cho chi?u r?ng
    public void setChieuRong(int wid) {
        if (isValidDimension(wid)) {
            this.wid = wid;
        } else {
            System.out.println("Chieu rong khong hop le. Chieu rong khong thay doi.");
        }
    }

    // Phuong th?c "get" cho chi?u d�i
    public int getChieuDai() {
        return len;
    }

    // Phuong th?c "get" cho chi?u r?ng
    public int getChieuRong() {
        return wid;
    }

    // Phuong th?c t�nh chu vi
    public int tinhChuVi() {
        return 2 * (len + wid);
    }

    // Phuong th?c t�nh du?ng ch�o
    public double tinhDuongCheo() {
        return Math.sqrt(len * len + wid * wid);
    }

    // Phuong th?c t�nh di?n t�ch
    public int tinhDienTich() {
        return len * wid;
    }

    // Phuong th?c ki?m tra c� ph?i h�nh vu�ng hay kh�ng
    public boolean laHinhVuong() {
        return len == wid;
    }

    // Phuong th?c xu?t h�nh ch? nh?t ra m�n h�nh
    public void xuatHinhChuNhat() {
        System.out.println("[" + len + " x " + wid + "]");
    }

    // Phuong th?c v? h�nh ch? nh?t d?c
    public void veHinhChuNhat(char kyTu) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                System.out.print(kyTu);
            }
            System.out.println();
        }
    }

    // Phuong th?c ki?m tra chi?u d�i ho?c chi?u r?ng c� h?p l? kh�ng
    private boolean isValidDimension(int dimension) {
        return dimension >= 0 && dimension <= 20;
    }

    // Phuong th?c ch�nh d? ki?m tra v� s? d?ng l?p Rectangle
    public static void main(String[] args) {
        Rectangle hcn1 = new Rectangle(15, 8);
        Rectangle hcn2 = new Rectangle();

        System.out.println("Hinh chu nhat 1: " + hcn1.getChieuDai() + " x " + hcn1.getChieuRong());
        System.out.println("Chu vi: " + hcn1.tinhChuVi());
        System.out.println("Duong cheo: " + hcn1.tinhDuongCheo());
        System.out.println("Dien tich: " + hcn1.tinhDienTich());
        System.out.println("La hinh vuong: " + hcn1.laHinhVuong());

        System.out.println();

        System.out.println("Hinh chu nhat 2: " + hcn2.getChieuDai() + " x " + hcn2.getChieuRong());
        System.out.println("Chu vi: " + hcn2.tinhChuVi());
        System.out.println("Duong cheo: " + hcn2.tinhDuongCheo());
        System.out.println("Dien tich: " + hcn2.tinhDienTich());
        System.out.println("La hinh vuong: " + hcn2.laHinhVuong());

        System.out.println();

        System.out.println("Ve hinh chu nhat 1:");
        hcn1.veHinhChuNhat('*');
    }
}
