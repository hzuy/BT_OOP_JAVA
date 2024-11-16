package Chuong3.B6_Person_Employee_PartimeEmployee;

public class PartTimeEmployee extends Employee{
    int hoursPerWeek;



    //constructor
    public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }
    public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender, employerName, dateHired);
    }

    //getter va setter
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hoursPerWeek=" + hoursPerWeek +
                ", employerName='" + employerName + '\'' +
                ", dateHired='" + dateHired + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
