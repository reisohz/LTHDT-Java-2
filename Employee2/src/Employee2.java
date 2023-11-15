public class Employee2 {
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee2(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Getter và setter cho tên
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và setter cho ch?c v?
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter và setter cho m?c luong
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phuong th?c tính toán m?c luong
    public double calculateSalary() {
        // Có th? thêm các logic tính toán m?c luong ph?c t?p ? dây
        return salary;
    }

    public static void main(String[] args) {
        // Ch?nh s?a t?i dây
        Employee2 emp = new Employee2("Tram Khoi Nguyen", "Developer", 500.0);

        // In thông tin v? nhân viên và m?c luong
        System.out.println("Ten nhan vien: " + emp.getName());
        System.out.println("Chuc vu: " + emp.getPosition());
        System.out.println("Muc luong: $" + emp.getSalary());

        // Tính toán luong
        System.out.println("\nMuc luong tinh toan: $" + emp.calculateSalary());

        // Ch?nh s?a m?c luong và tính toán l?i
       /* emp.setSalary(60000.0);
        System.out.println("\nSau khi ch?nh s?a m?c luong:");
        System.out.println("Muc luong: $" + emp.getSalary());
        System.out.println("Muc luong tinh toan: $" + emp.calculateSalary());*/
    }
}
