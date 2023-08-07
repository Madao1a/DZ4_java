/*Формат сдачи: ссылка на подписанный git-проект.

Задание

1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Это задание повышенной сложности, для решения задачи потребуется создать класс-обертку над LinkedList, например:

class MyQueue {
    private LinkedList elements = new LinkedList();

    public MyQueue() { }
    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }

        .........

}
3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.

Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы. */

import java.util.LinkedList;
import java.util.Scanner;

public class DZ4{
    public static void main(String[] args) {
        LinkedList<Integer> Linklist = CreateLinkedList();
        System.out.println(Linklist);
        LinkedList Linklist2 = task1(Linklist);
        System.out.println(Linklist2);

        System.out.println(enqueue(Linklist, 45)); // поместили элемент в конец очереди
        System.out.println(Linklist);

        System.out.println(dequeue(Linklist)); // удалили первый элемент
        System.out.println(Linklist);

        System.out.println(first(Linklist)); // вывели первый элемент
        System.out.println(Linklist); 
        
    }

    public static LinkedList<Integer> CreateLinkedList() {
                LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер листа");
        int n = Integer.parseInt(scanner.nextLine()) ;
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите значение поля с индексом %d\n", i);
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        return list;
    }

    public static LinkedList task1(LinkedList list){
    LinkedList revers_list = new LinkedList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
    Integer el = (int) list.get(i);
    revers_list.add(el);
    }
    return revers_list;
    }




public static int enqueue(LinkedList<Integer> lst, int num) {// помещает элемент в конец очереди
    lst.addLast(num);
    return num;
}

public static int dequeue(LinkedList<Integer> lst) { // возвращает первый элемент из очереди и удаляет его
    int num = lst.get(0);
    lst.remove(0);
    return num;
}

public static int first(LinkedList<Integer> lst) { // возвращает первый элемент из очереди, не удаляя
    int num = lst.get(0);
    return num;
}
}

