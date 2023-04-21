// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных. Если необходимо, исправьте данный код (задание 2 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package task2;

import java.util.Scanner;

public class exercice2 {
    static Scanner scanner = new Scanner(System.in);

    // Метод проверки ввода текста вместо числа
    public static Float getNumber(){
        System.out.println("Enter number: ");
        float number = 0;
        try{
            scanner.hasNextFloat();
            number = scanner.nextFloat();
        } catch (RuntimeException e){
            System.err.println("Error: Вы ввели не число! Попробуйте еще раз.");
            scanner.next();
            number = getNumber();
        } 
        return number;
    }

    // Исполняемая программа
    public static void main(String[] args){
        float number = getNumber();
        System.out.println("Вы ввели число: " + number);
    }
}