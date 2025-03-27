package lesson13.models;

public class Student {
    private String studentNumber;
    private String name;
    private int age;
    private double average;
    private static int counter = 1000;

    public Student(String name, int age, double average) {
        this.studentNumber = generateStudentNumber();
        this.name = name;
        this.age = age;
        this.average = average;
    }
    public Student(String studentNumber, String name, int age, double average) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.average = average;

    }

    private String generateStudentNumber() {
        return "ST" + (counter++);
    }
    public String getStudentNumber(){
        return studentNumber;
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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                '}';
    }
}
