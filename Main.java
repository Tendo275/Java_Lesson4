package ru.geekbrains.seminar_4;

/**
 * main - точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();                   // Формирование базы данных сотрудников.
        directory.addEmployee(new Employee(1, "Алмазов Андрей",
                "+7-909-888-77-66", 5));
        directory.addEmployee(new Employee(2, "Борисов Борис",
                "+7-909-888-77-55", 4));
        directory.addEmployee(new Employee(3, "Воронов Виктор",
                "+7-909-888-77-44", 3));
        directory.addEmployee(new Employee(4, "Громов Герман",
                "+7-909-888-77-33", 2));


        System.out.println("\nПОИСК СОТРУДНИКА ПО НОМЕРУ:");                      // Вызов метода поиска по № п/п.
        System.out.println(directory.findByTabelNumber(2).toString().
                replace("[", "").replace("]", ""));


        System.out.println("\nВЫВОД НОМЕРА ТЕЛЕФОНА СОТРУДНИКА ПО ИМЕНИ:");       // Вызов метода поиска номеру тел.
        System.out.println(directory.findPhoneNumber("Алмазов Андрей"));

        System.out.println("\nПОИСК СОТРУДНИКА СТАЖУ:");                          // Вызов метода поиска по стажу.
        System.out.println(directory.findByExperience(2).toString().
                replace("[", "").replace("]", ""));

        System.out.println("\nДОБАВЛЕНИЕ СОТРУДНИКА:");                           // Вызов метода добавления сотрудника.
        System.out.print(directory.addEmployee(new Employee(5, "Дружинин Дмитрий",
                        "+7-909-888-77-22", 1)).toString().
                replace("[", "").replace(",", "").replace("]", ""));
    }
}
