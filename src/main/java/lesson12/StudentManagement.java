package lesson12;

public class StudentManagement {
    private String[] students;
    private int count;

    public StudentManagement() {
        students = new String[5];
        count = 0;
    }

    // add
    public void addStudent(String student) {
        if (count >= students.length) {
            System.out.println("Full student list. Cannot add student.");
            return;
        }
        students[count] = student;
        count++;
        System.out.println("Added student: " + student);

    }

    // remove student
    public void removeStudent(int index) throws StudentListEmptyException {
        if (count == 0) {
            throw new StudentListEmptyException("Student list empty! ");
        }
        if (index < 0 || index >= count){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        String removedStudent = students[index];
        for (int i = index + 1; i < count - 1 ; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        count--;
        System.out.println("Removed student: " + removedStudent);
    }
    // show student list
    public void displayStudents() throws StudentListEmptyException {
        if (count == 0) {
            throw new StudentListEmptyException("Student list empty! ");

        }
        System.out.println("Students list:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ":" + students[i]);
        }

    }

}
