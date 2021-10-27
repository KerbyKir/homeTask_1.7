package com.company;

public class Task8 {
    public static void main(String[] args) {
        /* #8: Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".*/

        String string = "aabccddefgghiijjkk";
        StringBuilder stringResult= new StringBuilder();

        for(int i=1;i<string.length();i++){
            if(string.charAt(i)==string.charAt(i-1) && stringResult.toString().indexOf(string.charAt(i))==-1){
                stringResult.append(string.charAt(i));
            }
        }

        System.out.print(stringResult);
    }
}
