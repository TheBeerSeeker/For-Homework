package Homework5;

public class Emploee {

    String name;
    String position;
    String email;
    String mobile_number;
    int salary;
    int age;

    public Emploee() {
        name = "Иванов Иван Иванович";
        position = "Сотрудник";
        email = "email";
        mobile_number = "+79991234567";
        salary = 0;
        age = 0;
    }

    public Emploee(String name, String position, String email, String mobile_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mobile_number = mobile_number;
        this.salary = salary;
        this.age = age;
    }

    public void getEmploeeInfo(Emploee emp) {
        System.out.println("Имя: " + emp.name + " Должность: " + emp.position + " Email: " + emp.email + " Номер телефона: " + emp.mobile_number + " З/п: " + emp.salary + " Возраст: " + emp.age);
    }
}
