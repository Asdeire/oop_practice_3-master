package com.asdeire.oop.practice3;

import com.asdeire.oop.practice3.assembly.Assembly;
import com.asdeire.oop.practice3.assembly.tools.Assemble;
import com.asdeire.oop.practice3.assembly.Service;
import com.asdeire.oop.practice3.components.builders.CPUBuilder;
import com.asdeire.oop.practice3.components.builders.CaseBuilder;
import com.asdeire.oop.practice3.components.builders.GraphicCardBuilder;
import com.asdeire.oop.practice3.components.builders.MemoryBuilder;
import com.asdeire.oop.practice3.components.builders.MotherboardBuilder;
import com.asdeire.oop.practice3.components.builders.PowerSupplyBuilder;
import com.asdeire.oop.practice3.components.builders.RamBuilder;
import com.asdeire.oop.practice3.components.enums.FormFactor;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Assemble assemble = new Assembly();
        Console console = new Console(assemble);
        console.start();
    }
    private final Service service;

    public Console(Assemble assemble) {
        this.service = new Service(assemble);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Оберiть опцiю:");
            System.out.println("1. Додати процесор");
            System.out.println("2. Додати материнську плату");
            System.out.println("3. Додати вiдеокарту");
            System.out.println("4. Додати пам'ять");
            System.out.println("5. Додати оперативну пам'ять");
            System.out.println("6. Додати корпус");
            System.out.println("7. Додати блок живлення");
            System.out.println("8. Переглянути збiрку");
            System.out.println("9. Завершити");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addCPU();
                case 2 -> addMotherboard();
                case 3 -> addGPU();
                case 4 -> addMemory();
                case 5 -> addRam();
                case 6 -> addCase();
                case 7 -> addPower();
                case 8 -> viewAssembly();
                case 9 -> exit = true;
                default -> System.out.println("Виберiть iншу опцiю");
            }
        }
    }

    private void addCPU() {
        System.out.println("Введiть назву процесора:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника процесора (AMD або Intel):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer manufacturer = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть сокет процесора:");
        String socket = new Scanner(System.in).nextLine();

        System.out.println("Введiть кiлькiсть ядер:");
        int cores = new Scanner(System.in).nextInt();

        System.out.println("Введiть цiну процесора:");
        double price = new Scanner(System.in).nextDouble();

        CPUBuilder processorBuilder = new CPUBuilder()
            .setName(name)
            .setManufacturer(manufacturer)
            .setSocket(socket)
            .setCores(cores)
            .setPrice(price);

        service.addProcessor(processorBuilder);
    }

    private void addMotherboard(){
        System.out.println("Введiть назву материнської плати:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника материнської плати (Gigabyte, Asus):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer manufacturer = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть форм-фактор материнської плати (ATX, Micro_ATX, E_ATX, Mini2_ATX):");
        String formFactorStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        FormFactor formFactor = FormFactor.valueOf(formFactorStr);

        System.out.println("Введiть цiну материнської плати:");
        double price = new Scanner(System.in).nextDouble();

        MotherboardBuilder motherboardBuilder = new MotherboardBuilder()
            .setName(name)
            .setManufacturer(manufacturer)
            .setPrice(price)
            .setFormfactor(formFactor);

        service.addMotherboard(motherboardBuilder);
    }

    private void addGPU(){
        System.out.println("Введiть назву вiдеокарти:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника вiдеокарти (наприклад Gigabyte, MSI):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer brand = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть об'єм пам'ятi:");
        double memory = new Scanner(System.in).nextDouble();

        System.out.println("Введiть цiну вiдеокарти:");
        double price = new Scanner(System.in).nextDouble();

        GraphicCardBuilder graphicCardBuilder = new GraphicCardBuilder()
            .setName(name)
            .setMemory(memory)
            .setPrice(price)
            .setManufacturer(brand);

        service.addGraphicCard(graphicCardBuilder);
    }

    private void addMemory(){
        System.out.println("Введiть назву пам'ятi:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника пам'ятi (Samsung, Kingston):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer manufacturer = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть тип пам'ятi (SSD або HDD):");
        String type = new Scanner(System.in).nextLine();

        System.out.println("Введiть обсяг пам'ятi в гiгабайтах:");
        int capacityGB = new Scanner(System.in).nextInt();

        System.out.println("Введiть цiну пам'ятi:");
        double price = new Scanner(System.in).nextDouble();

        MemoryBuilder memoryBuilder = new MemoryBuilder()
            .setName(name)
            .setManufacturer(manufacturer)
            .setType(type)
            .setCapacity(capacityGB)
            .setPrice(price);

        service.addMemory(memoryBuilder);
    }

    private void addRam(){
        System.out.println("Введiть назву:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника RAM (наприклад Corsair, Kingston):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer manufacturer = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть обсяг пам'ятi в гiгабайтах:");
        int memory = new Scanner(System.in).nextInt();

        System.out.println("Введiть тип RAM (наприклад DDR4, DDR5):");
        String type = new Scanner(System.in).nextLine();

        System.out.println("Введiть цiну:");
        double price = new Scanner(System.in).nextDouble();

        RamBuilder ramBuilder = new RamBuilder()
            .setName(name)
            .setManufacturer(manufacturer)
            .setMemory(memory)
            .setType(type)
            .setPrice(price);

        service.addRam(ramBuilder);
    }

    private void addCase(){
        System.out.println("Введiть назву корпусу:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника (BE_QUIET, DEEPCOOL, ASUS):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer manufacturer = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть цiну корпусу:");
        double price = new Scanner(System.in).nextDouble();

        CaseBuilder caseBuilder = new CaseBuilder()
            .setName(name)
            .setManufacturer(manufacturer)
            .setPrice(price);

        service.addCase(caseBuilder);
    }

    private void addPower(){
        System.out.println("Введiть назву блока живлення:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Введiть виробника (наприклад Gigabyte, MSI):");
        String mnStr = new Scanner(System.in).nextLine().toUpperCase().replace(" ", "_");
        Manufacturer brand = Manufacturer.valueOf(mnStr);

        System.out.println("Введiть потужнiсть:");
        int power = new Scanner(System.in).nextInt();

        System.out.println("Введiть цiну блока живлення:");
        double price = new Scanner(System.in).nextDouble();

        PowerSupplyBuilder powerSupplyBuilder = new PowerSupplyBuilder()
            .setName(name)
            .setPower(power)
            .setPrice(price)
            .setManufacturer(brand);

        service.addPowerSupply(powerSupplyBuilder);
    }

    private void viewAssembly() {
        String description = service.getComputer().getDescription();
        double totalPrice = service.getComputer().calculateTotalPrice();

        System.out.println(description);
        System.out.println("Загальна цiна збiрки: " + totalPrice + " грн");
    }
}
