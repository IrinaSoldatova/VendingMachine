package org.example.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottleOfWater machineBOW = new VendingMachineBottleOfWater();
        machineBOW.addBottleOfWater(new BottleOfWater("Water", 110, 5));
        machineBOW.addBottleOfWater(new BottleOfWater("Coca-cola", 90, 0.5));
        machineBOW.addBottleOfWater(new BottleOfWater("Coca-cola", 150, 2));
        machineBOW.addBottleOfWater(new BottleOfWater("Water", 25, 1));
        VendingMachineHotDrink machineHD = new VendingMachineHotDrink();
        machineHD.addHotDrink(new HotDrink("Coffee", 300, 0.35, 92));
        machineHD.addHotDrink(new HotDrink("Coffee", 170, 0.15, 92));
        machineHD.addHotDrink(new HotDrink("Tea", 150, 0.2, 80));
        machineHD.addHotDrink(new HotDrink("Tea", 300, 0.4, 80));
        machineHD.addHotDrink(new HotDrink("Cocoa", 250, 0.3, 60));
        machineHD.addHotDrink(new HotDrink("Cocoa", 450, 0.5, 60));
        System.out.println(machineBOW.getProduct("Water", 1));
        System.out.println(machineBOW.getProduct("Water", 5));
        System.out.println(machineHD.getProduct("Tea", 0.4, 80));
        System.out.println(machineHD.getProduct("Tea", 0.2));
    }
}
