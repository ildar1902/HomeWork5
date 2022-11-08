public class Main {
    public static void main(String[] args) {
        System.out.println("Дз-5. Задание 1.");

        // Задание 1.
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке"); }
        else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке"); }
        else {
            System.out.println("Для данной ОС у нас пока нет мобильного приложения"); }

        //Задание 2.
        System.out.println("Дз-5. Задание 2.");
        int clientDeviceYear = 2013;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOs == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке"); }
                else if (clientOs == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке"); }
                if (clientOs > 1) {
                    System.out.println("Для вашей ОС у нас пока нет мобильного приложения"); }

                //Задание 3.
        System.out.println("Дз-5. Задание 3.");
                int year = 1996;
                if (year % 100 == 0 && year % 400 == 0) {
                    System.out.println(year + " год является високосным"); }
                else if (year % 4 ==0 && year % 100 > 0) {
                    System.out.println(year + " год является високосным!"); }
                else if (year % 100 == 0) {
                    System.out.println(year + " год не является високосным..."); }
                else { System.out.println(year + " год не является високосным!"); }

                //Задание 4.
        System.out.println("Дз-5. Задание 4.");
                int deliveryDistance = 95;
                if (deliveryDistance <= 20) {
                    System.out.println("Доставка будет выполнена в течение суток"); }
                else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                    System.out.println("Для доставки потребуется дней: 2"); }
                else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потребуется дней: 3"); }
                else {
                    System.out.println("Доставка в ваш регион недоступна"); }

                // Задание 5.
        System.out.println("Дз-5. Задание 5.");
                int monthNumber = 7;
                switch (monthNumber) {
                    case 1:
                    case 2:
                    case 12:
                        System.out.println("Это зимний месяц");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Это весенний месяц");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Это летний месяц");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Это осенний месяц");
                        break;
                    default:
                        System.out.println("В году всего 12 месяцев");
                                        }
        System.out.println("---");
        System.out.println("Ну вот и всё!");

    }
}
