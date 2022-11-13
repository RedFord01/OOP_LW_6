import java.util.Scanner;

interface Human2 {
    public void setSurname(String surname);
    public void setName(String name);
    public void setAge(int age);
    public String getSurname();
    public String getName();
    public int getAge();
    public void printInfo();
}
class Person2 implements Human2 {
    private String surname;
    private String name;
    private int age;
    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getSurname() {
        return surname;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void printInfo() {
        System.out.println("Людина(прізвище та ім'я): " + getSurname() + " " + getName() + ", вік: " + getAge() + '\n');
    }
}
class Student2 extends Person2 {
    private int group;
    private int cardNumber;
    public void setGroup(int group) {
        this.group = group;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getGroup() {
        return group;
    }

    public int getCardNumber() {
        return cardNumber;
    }
    @Override
    public void printInfo() {
        System.out.println("Студент " + getGroup() + " групи " + "," +getSurname() + " " + getName() +
                ", його(її) вік: " + getAge() + ". \nНомер картки студенту: " + getCardNumber() + '\n');

    }
}
class Lecturer2 extends Person2 {
    private String chair;
    private int salary;
    public void setDepartment(String chair) {
        this.chair = chair;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public float getSalary() {
        return salary;
    }
    public String getDepartment() {
        return chair;
    }
    @Override
    public void printInfo() {
        System.out.println("Лектор " + getDepartment() + " кафедри " + getSurname() + " " + getName() +
                ", вік: " + getAge() + ". \nЗарплатня: " + getSalary() + '\n');
    }
}

public class Interface {
    public static void main(String [] args) {

        System.out.println("/*Введіть дані про людей*/");
        Scanner in = new Scanner(System.in);
        Human[] people = new Human[6];

        System.out.println('\n' + "Персони:".toUpperCase());
        for (int i = 0; i < 2; i++) {

            Human person = new Person();

            System.out.println("Введіть прізвище: ");
            person.setSurname(in.next() );

            System.out.println("Введіть ім'я: ");
            person.setName(in.next() );

            System.out.println("Введіть вік: ");
            person.setAge(in.nextInt() );
            people[i] = person;
        }

        System.out.println('\n' + "Студенти:".toUpperCase());
        for (int i = 2; i < 5; i++) {

            Human student = new Student();

            System.out.println("Введіть прізвище: ");
            student.setSurname(in.next() );

            System.out.println("Введіть ім'я: ");
            student.setName(in.next() );

            System.out.println("Введіть вік: ");
            student.setAge(in.nextInt() );

            System.out.println("Введіть групу: ");
            Student studentData = (Student) student;
            studentData.setGroup(in.nextInt() );

            System.out.println("Введіть номер картки студента: ");
            studentData.setCardNumber(in.nextInt() );
            people[i] = student;
        }

        System.out.println('\n' + "Лектори:".toUpperCase());
        for (int i = 5; i < 6; i++) {

            Human lecturer = new Lecturer();

            System.out.println("Введіть прізвище: ");
            lecturer.setSurname(in.next() );

            System.out.println("Введіть ім'я: ");
            lecturer.setName(in.next() );

            System.out.println("Введіть вік: ");
            lecturer.setAge(in.nextInt() );

            System.out.println("Введіть кафедру: ");
            Lecturer lecturerData = (Lecturer) lecturer;
            lecturerData.setDepartment((in.next() ) );

            System.out.println("Введіть зарплатню: ");
            lecturerData.setSalary(in.nextInt() );
            people[i] = lecturer;
        }

        for (int i = 0; i < 6; i++) {
            people[i].printInfo();
        }
    }
}

