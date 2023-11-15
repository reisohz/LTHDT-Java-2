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

    // Constructor 4 tham s? (h? t�n,ng�y sinh, ng�y v�o l�m)
    public Employee(String lastName, String firstName, Date birthDate, Date hireDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // H�m xu?t d?i tu?ng nh�n vi�n ra m�n h�nh bao g?m: h?, t�n, ng�y sinh, ng�y v�o l�m
    public void displayEmployee() {
        System.out.println("Ho va ten: " + lastName + " " + firstName);
        System.out.println("Ngay sinh: " + birthDate.toString());
        System.out.println("Ngay vao lam: " + hireDate.toString());
    }

    public static void main(String[] args) {
        // Ch?nh s?a th�ng tin nh�n vi�n t?i d�y
        Date birthDate = new Date(27, 1, 2004);
        Date hireDate = new Date(15, 11, 2023);

        Employee employee = new Employee("Tram", "Khoi Nguyen", birthDate, hireDate);
        employee.displayEmployee();
    }
}

