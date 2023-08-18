import java.util.Arrays;

public class isDZ1 {
    /*
     * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
     * получить?
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных
     * массива, и возвращающий
     * новый массив, каждый элемент которого равен разности элементов двух входящих
     * массивов в той
     * же ячейке. Если длины массивов не равны, необходимо как-то оповестить
     * пользователя.
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных
     * массива, и возвращающий
     * новый массив, каждый элемент которого равен частному элементов двух входящих
     * массивов в той же ячейке.
     * Если длины массивов не равны, необходимо как-то оповестить пользователя.
     * Важно:
     * При выполнении метода единственное исключение, которое пользователь может
     * увидеть - RuntimeException, т.е. ваше.
     */

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(task1(new int[] { 2, 3 }, new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(task2(new int[] { 1, 2, 3 }, new int[] { 1, 4, 3 })));  
    }

    public static int[] task1(int[] args, int[] args2) {

        int[] newMas = new int[args.length];
        if (args.length != args2.length)
            throw new RuntimeException("Длины не равны");
        for (int i = 0; i < args.length; i++) {
            newMas[i] = args[i] * args2[i];
        }
        return newMas;

    }

    public static int[] task2(int[] args, int[] args2) {

        int[] newMas = new int[args.length];
        if (args.length != args2.length)
            throw new RuntimeException("Длины не равны");
        for (int i = 0; i < args.length; i++) {
            newMas[i] = args[i] - args2[i];
        }
        return newMas;

    }

}
