import java.util.Date; // Import the Date class for date of birth

public class Student {
    private String name;
    private int rollNumber;
    private char grade;
    private Date dateOfBirth; // Added attribute for date of birth

    public Student(String name, int rollNumber, char grade, Date dateOfBirth) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter methods to access the attributes
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter methods to modify the attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + ", dateOfBirth=" + dateOfBirth + "]";
    }
}
