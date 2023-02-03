public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = lastName + firstName + middleName;
        String fullNameUp = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullNameUp);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        String firstName = " Семён";
        String middleName = " Семёнович";
        String lastName = "Иванов";
        String fullName;
        fullName = lastName + firstName + middleName;
        String fullNameRep = fullName.replace('ё', 'е');
        System.out.println("ФИО сотрудника — " + fullNameRep);

    }
}