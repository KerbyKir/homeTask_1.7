package com.company;

public class Task7 {
    public static void main(String[] args) {
        /* #7: Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”*/

        String string1 = "135";
        String string2 = "246";

        StringBuilder stringResult = new StringBuilder();
        int maxLength = Math.max(string1.length(),string2.length());

        for(int i=0; i<maxLength;i++) {
            if(i<string1.length()) {
                stringResult.append(string1.charAt(i));
            }

            if(i<string2.length()) {
                stringResult.append(string2.charAt(i));
            }
        }

        System.out.print("Данные строки — "+stringResult);
    }
}
