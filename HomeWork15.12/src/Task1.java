
public class Task1 {
    public static void main(String[] args) {
        int temperature1 = 110;
        int temperature2 = 90;
boolean isDeviseWorking = device(temperature1, temperature2);
        if (isDeviseWorking){
            System.out.println("Прибор работает корректно");
        }
        else {
            System.out.println("Прибор работает не корректно");
        }
    }
    public static boolean device(int temp1, int temp2) {
return temp1 > 100 && temp2 < 100;
    }
}
// Представим, что у нас есть устройство, в котором две колбы.
//         Прибор работает корректно, если температура первой колбы выше 100 градусов,
//         а температура второй колбы меньше 100 градусов.
//         Вы должны написать метод, который проверяет это устройство.
//         Ваша программа должна иметь переменные temperature1 и temperature2.
//         В результате метод возвращает true или false.

