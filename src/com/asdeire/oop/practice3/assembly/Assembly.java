package com.asdeire.oop.practice3.assembly;

import com.asdeire.oop.practice3.assembly.tools.Assemble;
import com.asdeire.oop.practice3.assembly.tools.GetData;
import com.asdeire.oop.practice3.components.Case;
import com.asdeire.oop.practice3.components.Motherboard;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Assemble {

    private Motherboard motherboard;
    private Case pcCase;
    private final List<GetData> components = new ArrayList<>();

    @Override
    public void addComponent(GetData component) {
        components.add(component);
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Збірка комп'ютера:");

        if (motherboard != null) {
            description.append("\nМатеринська плата: ").append(motherboard.getDescription());
        }

        if (pcCase != null) {
            description.append("\nКорпус: ").append(pcCase.getDescription());
        }

        description.append("\nКомпоненти:");
        for (GetData component : components) {
            description.append("\n- ").append(component.getDescription());
        }

        return description.toString();
    }

    @Override
    public void connectToCase(Case pcCase) {
        this.pcCase = pcCase;
        List<GetData> componentList = getComponents();
        for (GetData component : componentList) {
            pcCase.addComponent(component);
        }
    }

    @Override
    public void connectToMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        List<GetData> componentList = getComponents();
        for (GetData component : componentList) {
            motherboard.addComponent(component);
        }
    }

    @Override
    public List<GetData> getComponents() {
        return components;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (GetData component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}
