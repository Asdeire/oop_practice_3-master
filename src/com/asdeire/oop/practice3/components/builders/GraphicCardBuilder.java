package com.asdeire.oop.practice3.components.builders;

import com.asdeire.oop.practice3.MissingException;
import com.asdeire.oop.practice3.components.CPU;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import com.asdeire.oop.practice3.components.GraphicCard;
public class GraphicCardBuilder {

    private String name;
    private double price;
    private Manufacturer manufacturer;
    private double memory;

    public GraphicCardBuilder setName(String name){
        this.name = name;
        return this;
    }

    public GraphicCardBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public GraphicCardBuilder setManufacturer(Manufacturer manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    public GraphicCardBuilder setMemory(double memory){
        this.memory = memory;
        return this;
    }

    public GraphicCard build(){
        if (name == null || manufacturer == null ) {
            throw new MissingException("Не вдалося створити відеокарту");
        }
        return new GraphicCard(name, manufacturer, price, memory);
    }
}
