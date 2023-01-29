public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1" );
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = firstName+middleName+lastName;
        System.out.println("ФИО сотрудника - "+fullName);
        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = firstName+middleName+lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullName.toUpperCase());
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Иванов ";
        String middleName = "Семён ";
        String lastName = "Семёнович";
        String fullName = firstName+middleName+lastName;
        fullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - "+fullName);
        System.out.println();
    }
}