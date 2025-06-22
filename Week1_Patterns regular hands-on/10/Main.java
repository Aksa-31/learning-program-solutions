public class Main {
    public static void main(String[] args) {
        Student model = new Student("Aksa Susan", "S123", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.setStudentName("Aksa Susan Mathew");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
