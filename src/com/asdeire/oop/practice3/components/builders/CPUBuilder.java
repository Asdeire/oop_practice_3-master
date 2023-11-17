package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.components.CPU;

public class CPUBuilder {

    private String name;
    private Manufacturer manufacturer;
    private String socket;
    private int cores;
    private double price;

    public CPUBuilder setName(String name){
        this.name = name;
        return this;
    }

    public CPUBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public CPUBuilder setSocket(String socket){
        this.socket = socket;
        return this;
    }

    public CPUBuilder setCores(int cores){
        this.cores = cores;
        return this;
    }

    public CPUBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public CPU build(){
        if (name == null || manufacturer == null || socket == null ) {
            throw new MissingException("Не вдалося створити процесор");
        }
        return new CPU(name, manufacturer, socket, price, cores);
    }
}
