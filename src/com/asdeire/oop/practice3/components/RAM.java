package com.asdeire.oop.practice3.components;

import com.asdeire.oop.practice3.assembly.tools.ConnectToMotherboard;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.assembly.tools.GetData;

public class RAM implements GetData, ConnectToMotherboard{

    private final String name;
    private final double price;
    private final String memoryType;
    private final double memory;
    private Manufacturer manufacturer;

    public RAM(String name, double price, String memoryType, double memory,
        Manufacturer manufacturer){
        this.name = name;
        this.price = price;
        this.memoryType = memoryType;
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    @Override
    public void connectToMotherboard(Motherboard motherboard) {
        motherboard.addRAM(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Оперативна пам'ять: " + manufacturer + " " + name + "(Тип пам'яті: " + memoryType + "; Об'єм пам'яті: " + memory;
    }
}
