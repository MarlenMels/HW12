public class Person {
    private String name;
    private String position;
    private String place_of_work;
    private int age;
    private int salary;

    Person(String name, String position, String place_of_work, int age, int salary) {
        this.name = name;
        this.position = position;
        this.place_of_work = place_of_work;
        this.age = age;
        this.salary = salary;
    }

    Person() {
    }

    String getName() {
        return name;
    }

    String getPosition() {
        return position;
    }

    String getPlaceOfWork() {
        return place_of_work;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPosition(String position) {
        this.position = position;
    }

    void setPlaceOfWork(String place_of_work) {
        this.place_of_work = place_of_work;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }
}
