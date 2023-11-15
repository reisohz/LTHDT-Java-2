/**
 * @(#)Employee.java
 *
 * Employee application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
public class Employee {
    private String lastName;
    private String firstName;
    private Date birthDate;
    private Date hireDate;

    // Constructor 4 tham s? (h? tên,ngày sinh, ngày vào làm)
    public Employee(String lastName, String firstName, Date birthDate, Date hireDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // Hàm xu?t d?i tu?ng nhân viên ra màn hình bao g?m: h?, tên, ngày sinh, ngày vào làm
    public void displayEmployee() {
        System.out.println("Ho va ten: " + lastName + " " + firstName);
        System.out.println("Ngay sinh: " + birthDate.toString());
        System.out.println("Ngay vao lam: " + hireDate.toString());
    }

    public static void main(String[] args) {
        // Ch?nh s?a thông tin nhân viên t?i dây
        Date birthDate = new Date(27, 1, 2004);
        Date hireDate = new Date(15, 11, 2023);

        Employee employee = new Employee("Tram", "Khoi Nguyen", birthDate, hireDate);
        employee.displayEmployee();
    }
}

