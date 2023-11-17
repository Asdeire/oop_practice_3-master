package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.components.Memory;

public class MemoryBuilder {

    private String name;
    private String type;
    private double capacity;
    private Manufacturer manufacturer;
    private double price;

    public MemoryBuilder setName(String name){
        this.name = name;
        return this;
    }

    public MemoryBuilder setType(String type){
        this.type = type;
        return this;
    }

    public MemoryBuilder setCapacity(double capacity){
        this.capacity = capacity;
        return this;
    }

    public MemoryBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public MemoryBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public Memory build() {
        if (name == null || type == null ) {
            throw new MissingException(
                "Не вдалося створити накопичувач пам'яті");
        }

        return new Memory(name, type, price, manufacturer, capacity);
    }
}
