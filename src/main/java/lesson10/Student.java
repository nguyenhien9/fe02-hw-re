package lesson10;

public class Student {
    private String fullName;
    private String address;
    private String phone;
    private String studentID;

    public Student() {
    }



    public Student(String fullName, String address, String phone, String studentID) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.studentID = studentID;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


}
