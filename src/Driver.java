public class Driver {
    String name;
    int age;
    String gender;
    String driverId;
    int salary;

    public Driver () {}

    public Driver(String name, int age, String gender, String driverId, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.driverId = driverId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}