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

    // Getter v� setter cho t�n
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter v� setter cho ch?c v?
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter v� setter cho m?c luong
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phuong th?c t�nh to�n m?c luong
    public double calculateSalary() {
        // C� th? th�m c�c logic t�nh to�n m?c luong ph?c t?p ? d�y
        return salary;
    }

    public static void main(String[] args) {
        // Ch?nh s?a t?i d�y
        Employee2 emp = new Employee2("Tram Khoi Nguyen", "Developer", 500.0);

        // In th�ng tin v? nh�n vi�n v� m?c luong
        System.out.println("Ten nhan vien: " + emp.getName());
        System.out.println("Chuc vu: " + emp.getPosition());
        System.out.println("Muc luong: $" + emp.getSalary());

        // T�nh to�n luong
        System.out.println("\nMuc luong tinh toan: $" + emp.calculateSalary());

        // Ch?nh s?a m?c luong v� t�nh to�n l?i
       /* emp.setSalary(60000.0);
        System.out.println("\nSau khi ch?nh s?a m?c luong:");
        System.out.println("Muc luong: $" + emp.getSalary());
        System.out.println("Muc luong tinh toan: $" + emp.calculateSalary());*/
    }
}
