package lesson13.backend;

import lesson13.models.Student;
import lesson13.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW06 {
    ScannerUtils scannerUtils = new ScannerUtils();
    List<Student> studentList = new ArrayList<Student>();


    public void studentManagement() {
        showMenu();

    }

    private void showMenu() {
        while (true) {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|                  Student Management                   |");
            System.out.println("+-------------------------------------------------------+");
            System.out.printf("|    %-51s|%n", "1. Add new student.");
            System.out.printf("|    %-51s|%n", "2. Modify student.");
            System.out.printf("|    %-51s|%n", "3. Remove student.");
            System.out.printf("|    %-51s|%n", "4. Show students.");
            System.out.printf("|    %-51s|%n", "5. Sort student list.");
            System.out.printf("|    %-51s|%n", "   5.1. Sort by name (A-Z).");
            System.out.printf("|    %-51s|%n", "   5.2. Sort by average score (Ascending).");
            System.out.printf("|    %-51s|%n", "   5.3. Sort by average score (Descending).");
            System.out.printf("|    %-51s|%n", "6. Search student.");
            System.out.printf("|    %-51s|%n", "7. Exit program.");
            System.out.println("+-------------------------------------------------------+");

            int userSelection = scannerUtils.inputInt("Your selection: ");
            switch (userSelection) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    modifyStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    showStudent();
                    break;
                case 5:
                    sortStudentList();
                    break;
                case 6:
                    searchStudent();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    return;
                default:
                    break;

            }

        }
    }

    private void addNewStudent() {
        System.out.println("+------------------- Add new student -------------------+");
        String studentName = scannerUtils.inputString("Enter student name: ");
        int age = scannerUtils.inputAge("Enter student age: ");
        double average = scannerUtils.inputDouble("Enter student average: ");
        Student student = new Student(studentName, age, average);
        System.out.println("Student " + studentName + " added.");
        studentList.add(student);
    }

    private void modifyStudent() {
        System.out.println("+------------------ Modify student -------------------+");

        if (!studentList.isEmpty()) {
            System.out.println("Current student list: ");
            for(Student student : studentList) {
                System.out.println(student);
            }
        } else{
            System.out.println("Student list is empty.");
        }
        String studentNumber = scannerUtils.inputString("Enter student number to modify: ");
        Student modifyingStudent = null;
        for (Student student : studentList) {
            if (student.getStudentNumber().trim().equalsIgnoreCase(studentNumber)) {
                modifyingStudent = student;
                break;
            }
        }
        if (modifyingStudent == null) {
            System.out.println("Student " + studentNumber + " not found.");
            return;
        }
        System.out.println("Student needs to be modified:");
        System.out.println(modifyingStudent);

        // update
        String newName = scannerUtils.inputString("Enter new student name: ");
        int newAge = scannerUtils.inputAge("Enter new student age: ");
        double newAverage = scannerUtils.inputDouble("Enter new student average: ");

        modifyingStudent.setName(newName);
        modifyingStudent.setAge(newAge);
        modifyingStudent.setAverage(newAverage);

        System.out.println("Student " + studentNumber + " modified.");

    }

    private void removeStudent() {
        System.out.println("+------------------ Remove student -------------------+");

        if (studentList.isEmpty()) {
            System.out.println("Student list is empty.");
            return;
        }

        String studentNumber = scannerUtils.inputString("Enter student number to remove: ");
        boolean found = false;

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentNumber().equals(studentNumber)) {
                iterator.remove();
                System.out.println("Student " + studentNumber + " removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + studentNumber + " not found.");
        }
    }

    private void showStudent() {
        System.out.println("+-------------------- Show student --------------------+");
        if (!studentList.isEmpty()) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("No students to display.");
        }
    }

    private void sortStudentList() {
    }
    private void searchStudent() {
        

    }




}