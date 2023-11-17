package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.assembly.tools.GetData;
import com.asdeire.oop.practice3.components.Case;
import com.asdeire.oop.practice3.components.Motherboard;
import com.asdeire.oop.practice3.components.PowerSupply;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import java.util.List;

public class CaseBuilder {
    private  String name;
    private Manufacturer manufacturer;
    private double price;

    public CaseBuilder setName(String name){
        this.name = name;
        return this;
    }

    public CaseBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public CaseBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public Case build(){
        if (name == null || manufacturer == null) {
            throw new MissingException("Не вдалося створити корпус");
        }
        return new Case(name, manufacturer, price);
    }
}

