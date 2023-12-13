public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        User user1 = new User("Пользователь 1");
        User user2 = new User("Пользователь 2");

        taskManager.addObserver(user1);
        taskManager.addObserver(user2);

        taskManager.addTask("Задача 1");
        taskManager.addTask("Задача 2");

        taskManager.removeObserver(user1);

        taskManager.addTask("Задача 3");

    }
}
