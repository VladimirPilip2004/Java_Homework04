// 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример:
// 1 + 2 ответ: 3
// + 4 ответ: 7 
// Отмена 3 
// * 3 ответ: 9

package HW_04;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Double> result = new LinkedList<>();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            result.add(scan.nextDouble());
            scan.nextLine();

            while(true) {
                System.out.print("Выберите действие (+ , - , / , *): ");
                String action = scan.nextLine();
                
                if ("C".equals(action)) // Отмена последней операции
                    result.remove();
                else {
                    System.out.print("Введите второе число: ");
                    double num2 = scan.nextDouble();

                    mathAction(result, action, num2);
                    scan.nextLine();
                    }
                    
                System.out.println("Результат: " + result.getFirst());
            }
        }
    }

    // Метод выбора математического действия
    public static void mathAction(LinkedList<Double> list, String action, double number) {
        switch (action) {
            case "+":
                list.add(0, list.getFirst() + number);
                break;         
            case "-":
                list.add(0, list.getFirst() - number);
                break;
            case "*":
                list.add(0, list.getFirst() * number);
                break;
            case "/":
                list.add(0, list.getFirst() / number);
                break;                
            default:
                System.out.println("Неправильный ввод!");
        }
    }
}