import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DZ5 {
    /*Задание

Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.

***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника. */

    private static Map<String, List<Integer>> numPhone = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] data = {
            "89124568975 Arslanov",
            "89456859425 Petrov",
            "89465165864 Godov",
            "89161351311 Arslanov"
        };
        //task1(data);

        System.out.println("Укажите номер задачи");

        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи");
            System.out.println("1 - Добвить запись");
            System.out.println("2 - Поиск номера");
            System.out.println("3 - Показать весь справочник");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());
    
            if (no == 1) {
                task2();
            }
            else if (no == 2) {
                task3();
            }
            else if (no == 3) {
                task4();
            }
            /*else if (no == 0) {
                f = false;
                System.out.println("Завершение работы");
            }*/
        }


    }

    /*private static void task1(String[] data){
        for (String personalNumber : data) {
            String[] parts = personalNumber.split(" ");
            if (numPhone.containsKey(parts[1])){
                numPhone.get(parts[1]).add(Integer.parseInt(parts[0]));
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(Integer.parseInt(parts[0]));
                numPhone.put(parts[1], list);
            }
        }
    }*/

    private static void task2() {
        System.out.println("Введите фамилию");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String number = scanner.nextLine();
        if (numPhone.containsKey(name)){
            numPhone.get(name).add(Integer.parseInt(number));
        }
        else {
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(number));
            numPhone.put(name, list);
        }
    }

    private static void task3() {
        System.out.println("Введите фамилию");
        String name = scanner.nextLine();
        System.out.println(numPhone.get(name));
    }

    private static void task4() {
        for (String name : numPhone.keySet()) {
            String name2 = name.toString();
            String value = numPhone.get(name).toString();
            System.out.println(name2 + " " + value);
        }
    }



        
    
}
