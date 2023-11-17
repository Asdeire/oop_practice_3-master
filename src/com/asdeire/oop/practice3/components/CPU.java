package com.asdeire.oop.practice3.components;


import com.asdeire.oop.practice3.assembly.tools.ConnectToMotherboard;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.assembly.tools.GetData;

public class CPU implements ConnectToMotherboard, GetData {
    private final String name;
    private final Manufacturer manufacturer;
    private final String socket;
    private final int cores;
    private final double price;

    public CPU(String name, Manufacturer manufacturer, String socket, double price, int cores) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.socket = socket;
        this.price = price;
        this.cores = cores;
    }

    @Override
    public void connectToMotherboard(Motherboard motherboard) {
        motherboard.addCPU(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Процесор " +  manufacturer + " " + name + " (Socket: " + socket + "; " + "Cores: " + cores + ")";
    }
}
