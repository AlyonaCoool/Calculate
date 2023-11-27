import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Какую операцию Вы хотите совершить?\nВведите одну из: +, -, *, / ");
        Scanner in = new Scanner(System.in);
        String operation = in.next();

        System.out.println("Введите первое число, с которым необходимо совершить эту операцию");
        int x = in.nextInt();
        System.out.println("Введите второе число, с которым необходимо совершить эту операцию");
        int y = in.nextInt();

        int result = 0;

        switch(operation){
            case "+" : result = x + y;
                System.out.println("Результат выбранной вами операции:");
                System.out.println(result);
                break;
            case "-" : result = x - y;
                System.out.println("Результат выбранной вами операции:");
                System.out.println(result);
                break;
            case "*" : result = x * y;
                System.out.println("Результат выбранной вами операции:");
                System.out.println(result);
                break;
            case "/" : result = x / y;
                System.out.println("Результат выбранной вами операции:");
                System.out.println(result);
                break;
            default:  System.out.println("Вы ввели некорректную операцию");
        }

    }
}