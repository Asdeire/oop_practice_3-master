package com.asdeire.oop.practice3.components;

import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.assembly.tools.GetData;
import java.util.ArrayList;
import java.util.List;

public class Case implements GetData {

    private final String name;
    private Manufacturer manufacturer;
    private final double price;
    private Motherboard motherboard;
    private PowerSupply powerSupply;
    private final List<GetData> components;

    public Case(String name, Manufacturer manufacturer, double price){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.components = new ArrayList<>();
    }


    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Корпус: " + manufacturer + " " + name;

    }

    public void addMotherboard(Motherboard motherboard){this.motherboard = motherboard;}

    public void addPower(PowerSupply powerSupply){this.powerSupply = powerSupply;}

    public void addComponent(GetData component) {
        components.add(component);
    }

    public List<GetData> getComponents() {
        return components;
    }
}
