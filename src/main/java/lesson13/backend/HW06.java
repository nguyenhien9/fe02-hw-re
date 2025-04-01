package lesson13.backend;

import lesson13.models.Student;
import lesson13.utils.ScannerUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HW06 {
    ScannerUtils scannerUtils = new ScannerUtils();
    List<Student> studentList = new ArrayList<>();


    public void studentManagement() {
        loadStudentFromFile();
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
                    saveToFile();
                    scannerUtils.close();
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
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
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

        if (studentList.isEmpty()) {
            System.out.println("Student list is empty.");
            return;
        }

        while (true) {
            System.out.println("+----------------------------------------------+");
            System.out.println("|                  Sort List                   |");
            System.out.println("+----------------------------------------------+");
            System.out.printf("|    %-42s|%n", "1. Sort by name (A-Z).");
            System.out.printf("|    %-42s|%n", "2. Sort by average score (Ascending).");
            System.out.printf("|    %-42s|%n", "3. Sort by average score (Descending).");
            System.out.printf("|    %-42s|%n", "4. Exit.");
            System.out.println("+----------------------------------------------+");

            int userSelection = scannerUtils.inputInt("Your selection: ");
            switch (userSelection) {
                case 1:
                    System.out.println("+------------ Sort by name (A-Z). ------------+");
                    studentList.sort((s1, s2) -> {
                        String[] name1 = s1.getName().split("\\s+");
                        String[] name2 = s2.getName().split("\\s+");
                        String lastName1 = name1[name1.length - 1];
                        String lastName2 = name2[name2.length - 1];
                        return lastName1.compareToIgnoreCase(lastName2);
                    });
                    showStudent();
                    break;
                case 2:
                    System.out.println("Sort by average score (Ascending).");
                    studentList.sort((s1, s2) -> Double.compare(s1.getAverage(), s2.getAverage()));
                    showStudent();
                    break;
                case 3:
                    System.out.println("Sort by average score (Descending).");
                    studentList.sort((s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage()));
                    showStudent();
                    break;
                case 4:
                    System.out.println("Exit program.");
                    return;
                default:
                    break;
            }
        }
    }

    private void searchStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty.");
        }
        String stNumber = scannerUtils.inputString("Enter student number to search: ");
        Student foundStudent = null;
        for (Student student : studentList) {
            if (student.getStudentNumber().trim().equalsIgnoreCase(stNumber)) {
                foundStudent = student;
                break;
            }
        }
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student " + stNumber + " not found.");
        }
    }

    private void saveToFile() {
        try (PrintWriter input = new PrintWriter("src/main/java/lesson13/backend/studentList.txt")) {
            for (Student student : studentList) {
                input.println(student);
            }
            System.out.println("Student list saved.");

        } catch (IOException e) {
            System.err.println("Save to file failed." + e.getMessage());
        }
    }

    private void loadStudentFromFile() {
        File file = new File("src/main/java/lesson13/backend/studentList.txt");
        if (!file.exists()) {
            return;
        }
        try (Scanner input = new Scanner(file)) {
            studentList.clear();
            int maxID = 999;
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                // Check line format, must start with Student{ and end with }
                if (line.startsWith("Student{") && line.endsWith("}")) {
                    // only get middle string, except start and end.
                    String content = line.substring("Student{".length(), line.length() - 1);
                    // split string by "," and ""
                    String[] parts = content.split(",\\s*");
                    if (parts.length >= 4) {
                        String studentNumber = parts[0].split("=")[1].replace("'", "").trim();
                        String name = parts[1].split("=")[1].replace("'", "").trim();
                        int age = Integer.parseInt(parts[2].split("=")[1].trim());
                        double average = Double.parseDouble(parts[3].split("=")[1].trim());

                        // Create student
                        Student student = new Student(studentNumber, name, age, average);
                        studentList.add(student);

                        /*
                         * Find max student number
                         * split numeric part from studentNumber*/
                        String numericPart = studentNumber.replace("ST", "");
                        int numericId = Integer.parseInt(numericPart);
                        if (numericId > maxID) {
                            maxID = numericId;
                        }
                    }
                }
            }
            Student.setCounter(maxID + 1);
            System.out.println("Successfully read student list from file: " + input);


        } catch (FileNotFoundException e) {
            System.err.println("Load to file failed." + e.getMessage());
        }
    }


}