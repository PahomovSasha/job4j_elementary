package ru.job4j.encapsulation;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Обнуляем первый элемент, чтобы образовалась дырка");
        products[0] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        System.out.println("Смещаем все не null элементы влево");
        delete(products, 1);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            products[i - 1] = products[i];
        }
        products[products.length - 1] = null;
        return products;
    }
}
