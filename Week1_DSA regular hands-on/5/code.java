class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

public class TaskManagement {
    static Task head = null;

    static void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        newTask.next = head;
        head = newTask;
    }

    static void searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                System.out.println("Found Task: " + current.taskId + " | " + current.taskName + " | " + current.status);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    static void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == id) {
                current.next = current.next.next;
                System.out.println("Task deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    static void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current.taskId + " | " + current.taskName + " | " + current.status);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        addTask(1, "Design UI", "Pending");
        addTask(2, "Write Code", "In Progress");
        addTask(3, "Test Module", "Completed");

        traverseTasks();

        searchTask(2);

        deleteTask(1);

        traverseTasks();
    }
}