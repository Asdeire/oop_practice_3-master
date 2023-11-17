package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.enums.FormFactor;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.components.Motherboard;


public class MotherboardBuilder {
    private  String name;
    private double price;
    private FormFactor formFactor;
    private Manufacturer manufacturer;

    public MotherboardBuilder setName(String name){
        this.name = name;
        return this;
    }

    public MotherboardBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public MotherboardBuilder setFormfactor(FormFactor formFactor){
        this.formFactor = formFactor;
        return this;
    }

    public MotherboardBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public Motherboard build(){
        if (name == null || manufacturer == null) {
            throw new MissingException("Не вдалося створити материнську плату");
        }
        return new Motherboard(name, price, formFactor, manufacturer);
    }
}
