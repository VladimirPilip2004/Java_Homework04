// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HW_04;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // Создание списка элементов
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);        
        
        System.out.println(list); // Вывод список в консоль
        enqueue(list,addElement()); // Добавление нового элемента в конец очереди
        System.out.println("Новый список: " + list); 
        System.out.println("Удален первый элемент: " + dequeue(list));
        System.out.println("Новый список: " + list);
        System.out.println("Вывод первого элемента: " + first(list));
    }

    public static int addElement(){ // Запращивает элемент от пользователя
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элемент: ");
        int number = Integer.parseInt(scan.nextLine());
        return number;
    }

    public static void enqueue(LinkedList<Integer> list, int number) {// Метод помещает элемент в конец очереди
        list.addLast(number);
    }

    public static int dequeue(LinkedList<Integer> list) { // Метод возвращает первый элемент из очереди и удаляет его
        int number = list.get(0);
        list.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> list) { // Метод возвращает первый элемент из очереди, не удаляя его
        int number = list.get(0);
        return number;
    }   
}