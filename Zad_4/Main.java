package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем корзину
        Cart cart = new Cart();

        // Создаем товары
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);
        Product headphones = new Product("Наушники", 5000.0);

        // Добавляем товары в корзину
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);
        cart.addProduct(headphones);

        // Показываем корзину и итоговую сумму
        cart.printCart();

        // Удаляем один товар
        System.out.println("Удаляем: Мышка");
        cart.removeProduct("Мышка");

        // Снова показываем корзину
        cart.printCart();

        // Дополнительные операции для демонстрации
        System.out.println("Дополнительные операции:");

        // Пробуем удалить несуществующий товар
        cart.removeProduct("Монитор");

        // Добавляем еще один товар
        Product monitor = new Product("Монитор", 25000.0);
        cart.addProduct(monitor);

        // Снова показываем корзину
        cart.printCart();

        // Удаляем все товары по одному
        System.out.println("Очищаем корзину:");
        cart.removeProduct("Ноутбук");
        cart.removeProduct("Клавиатура");
        cart.removeProduct("Наушники");
        cart.removeProduct("Монитор");

        // Показываем пустую корзину
        cart.printCart();
    }
}
