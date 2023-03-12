// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список. 

package HW_04;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
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
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            System.out.print(list.getLast() + ", ");
            list.removeLast();
        }
    }
}