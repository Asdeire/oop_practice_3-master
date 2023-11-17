package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.CPU;
import com.asdeire.oop.practice3.components.enums.FormFactor;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.components.Motherboard;


public class MotherboardBuiler {
    private  String name;
    private double price;
    private FormFactor formFactor;
    private Manufacturer manufacturer;

    public  MotherboardBuiler setName(String name){
        this.name = name;
        return this;
    }

    public  MotherboardBuiler setPrice(double price){
        this.price = price;
        return this;
    }

    public  MotherboardBuiler setFormfactor(FormFactor formFactor){
        this.formFactor = formFactor;
        return this;
    }

    public  MotherboardBuiler setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public Motherboard build(){
        if (name == null || manufacturer == null) {
            throw new MissingException("Не вдалося створити процесор");
        }
        return new Motherboard(name, price, formFactor, manufacturer);
    }
}
