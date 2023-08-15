import java.util.HashSet;

public class DZ6 {
    /*Задание

Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

Создайте метод

public boolean equals(Object o)

Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

Создайте метод
public int hashCode()

который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились. */




    static void task1() {
        Cat cat1 = new Cat(3, 15, 5);
        // cat1.age = 3;
        // cat1.length = 15;
        // cat1.weight = 5;
        System.out.println(cat1);
        HashSet<Cat> hashSet = new HashSet<>();
        hashSet.add(new Cat(2, 10, 10));
        hashSet.add(new Cat(3, 8, 15));
        hashSet.add(new Cat(4, 9, 17));
        hashSet.add(new Cat(5, 15, 30));
        hashSet.add(new Cat(6, 20, 35));
        hashSet.add(new Cat(6, 20, 35));
        System.out.println(hashSet);

        System.out.println(new Cat(2, 2, 2).equals(new Cat(2, 2, 2)));
        


    }

    public static void main(String[] args) {

        task1();


         

    }

}
