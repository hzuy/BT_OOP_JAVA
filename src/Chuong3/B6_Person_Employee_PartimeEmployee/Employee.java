package Chuong3.B6_Person_Employee_PartimeEmployee;

public class Employee extends Person{
    String employerName;
    String dateHired;

//constructor

    public Employee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    //getter va setter
    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    //toString
    @Override
    public String toString() {
        return "Employee{" +
                "employerName='" + employerName + '\'' +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
