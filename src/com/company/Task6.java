package com.company;

public class Task6 {
    public static void main(String[] args) {
        /* #6: Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“
, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”*/

        String fullName="ivanov ivan ivanovich";
        String firstName;
        String lastName;
        String middleName;
        String firstNameCorrect;
        String lastNameCorrect;
        String middleNameCorrect;
        String fullNameCorrect;

        lastName=fullName.substring(0,fullName.indexOf(' '));
        firstName=fullName.substring(fullName.indexOf(' '),fullName.lastIndexOf(' ')).trim();
        middleName=fullName.substring(fullName.lastIndexOf(' ')).trim();

        lastNameCorrect = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        firstNameCorrect = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        middleNameCorrect = middleName.substring(0,1).toUpperCase() + middleName.substring(1);

        fullNameCorrect = lastNameCorrect + ' ' + firstNameCorrect + ' ' + middleNameCorrect;

        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — "+fullNameCorrect);
    }
}
