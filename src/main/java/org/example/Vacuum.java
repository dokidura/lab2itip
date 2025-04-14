package org.example;

public class Vacuum extends Appliance{
    private int suctionPower;

    public Vacuum(String name, int power, String brand, int suctionPower) {
        super(name, power, brand);
        this.suctionPower = suctionPower;
    }

    public Vacuum() {
        this("Vacuum Cleaner", 1200, "Dyson", 200);
    }

    public int getSuctionPower() {
        return suctionPower;
    }

    public void setSuctionPower(int suctionPower) {
        this.suctionPower = suctionPower;
    }

    @Override
    public void turnOn() {
        System.out.println("Vacuum is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Vacuum is off.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Suction power: " + suctionPower + " Watt.");
    }
}
