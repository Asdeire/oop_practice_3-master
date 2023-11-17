package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.components.CPU;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.PowerSupply;

public class PowerSupplyBuilder {

    private String name;
    private int power;
    private Manufacturer manufacturer;
    private double price;

    public PowerSupplyBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PowerSupplyBuilder setPower(int power){
        this.power = power;
        return this;
    }

    public PowerSupplyBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public PowerSupplyBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public PowerSupply build(){
        if (name == null || manufacturer == null || power <= 0) {
            throw new MissingException("Не вдалося створити блок живлення");
        }
        return new PowerSupply(name, power, manufacturer, price);
    }
}
