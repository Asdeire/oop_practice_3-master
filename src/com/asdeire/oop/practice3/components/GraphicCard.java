package com.asdeire.oop.practice3.components;

import com.asdeire.oop.practice3.assembly.tools.ConnectToMotherboard;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.assembly.tools.GetData;

public class GraphicCard implements GetData, ConnectToMotherboard {

    private final String name;
    private final double price;
    private final Manufacturer manufacturer;
    private final double memory;

    public GraphicCard(String name, Manufacturer manufacturer, double price, double memory){
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.memory = memory;
    }
    @Override
    public void connectToMotherboard(Motherboard motherboard) {
        motherboard.addGPU(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Відеокарта: " + manufacturer + " " + name + "(Пам'ять: " + memory + ")";
    }
}
