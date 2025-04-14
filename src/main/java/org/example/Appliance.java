package org.example;

public abstract class Appliance {
    private String name;       // Название прибора
    private int power;         // Мощность
    private String brand;      // Производитель
    private static int counter = 0; // Статическое поле для подсчета экземпляров

    // конструктор с параметрами
    public Appliance(String name, int power, String brand) {
        this.name = name;
        this.power = power;
        this.brand = brand;
        counter++;
    }

    // конструктор по умолчанию
    public Appliance() {
        this("Unknown", 0, "Unknown");
    }

    // абстрактный метод, который будет реализован в дочерних классах
    public abstract void turnOn();

    public abstract void turnOff();

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getCounter() {
        return counter;
    }

    // Метод для вывода информации об устройстве
    public void displayInfo() {
        System.out.println("Name: " + name + ", Power: " + power + " Watt, Brand: " + brand);
    }
}
