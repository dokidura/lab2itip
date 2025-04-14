package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры каждого класса
        Fridge fridge = new Fridge();
        Dishwasher dishwasher = new Dishwasher();
        Vacuum vacuum = new Vacuum();

        fridge.displayInfo();
        fridge.setCapacity(350); // изменим объем холодильника
        System.out.println("New fridge capacity: " + fridge.getCapacity() + " litres.");
        fridge.turnOff();
        fridge.turnOn();

        System.out.println();

        dishwasher.displayInfo();
        dishwasher.turnOn();
        dishwasher.turnOff();

        System.out.println();

        vacuum.displayInfo();
        vacuum.turnOn();
        vacuum.turnOff();

        System.out.println("\nNum of appliances created: " + Appliance.getCounter());
    }
}
