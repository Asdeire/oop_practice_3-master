package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.RAM;
import com.asdeire.oop.practice3.components.enums.Manufacturer;

public class RamBuilder {

    private String name;
    private double price;
    private String memoryType;
    private double memory;
    private Manufacturer manufacturer;

    public RamBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public RamBuilder setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public RamBuilder setMemory(double memory) {
        this.memory = memory;
        return this;
    }

    public RamBuilder setType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public RamBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public RAM build() {
        if (name == null || manufacturer == null|| memoryType == null) {
            throw new MissingException(
                "Не вдалося створити RAM");
        }

        return new RAM(name, memory, memoryType, price, manufacturer);
    }
}
