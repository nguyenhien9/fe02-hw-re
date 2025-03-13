package lesson10;

public class Student {
    private String fullName;
    private String address;
    private String email;
    private String phone;
    private String studentId;

    public Student() {

    }
    public Student(String fullName, String address, String email, String phone, String studentId) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.studentId = studentId;

    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void goToSchool(){
        System.out.printf("Student %s Go to School%n",fullName);
    }
    public void doHomework(){
        System.out.printf("Student %s Do homework%n", fullName);
    }
    public void payTuition(){
        System.out.printf("Student %s Pay tuition%n", fullName);
    }
    public void takeExam(){
        System.out.printf("Student %s Take exam%n", fullName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
