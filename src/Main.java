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


    }
}
