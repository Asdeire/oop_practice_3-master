package com.asdeire.oop.practice3.assembly.tools;

import java.util.List;
import com.asdeire.oop.practice3.components.Motherboard;
import com.asdeire.oop.practice3.components.Case;

public interface Assemble {

    void connectToMotherboard(Motherboard motherboard);

    void connectToCase(Case computerCase);

    void addComponent(GetData component);

    double calculateTotalPrice();

    String getDescription();

    List<GetData> getComponents();
}
