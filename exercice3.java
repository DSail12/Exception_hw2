// Дан следующий код, исправьте его там, где требуется (задание 3 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package task2;

public class exercice3 {
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так...");
        }

        try {
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера!");
        }
    }
}
