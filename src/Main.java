public class Main {
    public static void main(String[] args) {
        System.out.println("task1");

        String firstName = "Ivanov";
        String secondName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + secondName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("task2");

        String capital = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + capital);

        System.out.println("task3");

        fullName = "Иванов Семён Семёныч";
        String changedName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + changedName );
    }
}