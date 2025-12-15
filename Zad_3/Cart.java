package org.example;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    // Конструктор
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Добавить товар
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Добавлен товар: " + product.getName());
    }

    // Удалить товар по названию
    public boolean removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                Product removed = products.remove(i);
                System.out.println("Удален товар: " + removed.getName());
                return true;
            }
        }
        System.out.println("Товар с названием '" + name + "' не найден в корзине");
        return false;
    }

    // Посчитать общую сумму
    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Вывести содержимое корзины
    public void printCart() {
        System.out.println("\n=== Корзина ===");
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
            System.out.println("Итого: " + getTotal() + " руб.");
        }
        System.out.println("===============\n");
    }

    // Дополнительный метод для получения списка продуктов (опционально)
    public ArrayList<Product> getProducts() {
        return new ArrayList<>(products); // Возвращаем копию для безопасности
    }
}
