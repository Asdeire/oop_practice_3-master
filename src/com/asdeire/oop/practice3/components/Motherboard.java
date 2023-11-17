package com.asdeire.oop.practice3.components;

import com.asdeire.oop.practice3.assembly.tools.GetData;
import com.asdeire.oop.practice3.assembly.tools.ConnectToMotherboard;
import com.asdeire.oop.practice3.components.enums.FormFactor;
import com.asdeire.oop.practice3.components.enums.Manufacturer;
import java.util.List;
import java.util.ArrayList;


public class Motherboard implements  GetData{
    private final String name;
    private final double price;
    private FormFactor formFactor;
    private Manufacturer manufacturer;
    private CPU processor;
    private GraphicCard graphicCard;
    private List<RAM> rams;
    private Memory memory;
    private List<GetData> components;

    public Motherboard(String name, double price, FormFactor formFactor,
        Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.formFactor = formFactor;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.rams = rams;
        this.memory = memory;
        this.components =new ArrayList<>();
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getDescription() {
        return "Материнська плата: " + manufacturer + " " + name + " " + "Форм-фактор: " + formFactor;

    }

    public void addCPU(CPU processor) {
        this.processor = processor;
    }
    public void addGPU(GraphicCard graphicCard){
        this.graphicCard = graphicCard;
    }
    public void addRAM(RAM ram){
        rams.add(ram);
    }
    public void addMemory(Memory memory){this.memory = memory;}

    public void connectToCase(Case pcCase) {
        pcCase.addMotherboard(this);
    }

    public List<GetData> getComponents() {
        return components;
    }

    public void addComponent(GetData component) {
        components.add(component);

        if (component instanceof ConnectToMotherboard) {
            ((ConnectToMotherboard) component).connectToMotherboard(this);
        }
    }
}
