package com.company;

public class Task5 {
    public static void main(String[] args) {
        /* #5: К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName— для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”*/

        String fullName = "Ivanov Ivan Ivanovich";
        String firstName;
        String lastName;
        String middleName;

        lastName=fullName.substring(0,fullName.indexOf(' '));
        firstName=fullName.substring(fullName.indexOf(' '),fullName.lastIndexOf(' ')).trim();
        middleName=fullName.substring(fullName.lastIndexOf(' ')).trim();

        System.out.println("Имя сотрудника — "+firstName);
        System.out.println("Фамилия сотрудника — "+lastName);
        System.out.println("Отчество сотрудника — "+middleName);
    }
}
