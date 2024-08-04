// MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("John Doe", "S12345", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to handle communication between the model and the view
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentId("S67890");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
