package com.asdeire.oop.practice3.assembly;

import com.asdeire.oop.practice3.assembly.tools.Assemble;
import com.asdeire.oop.practice3.components.CPU;
import com.asdeire.oop.practice3.components.Case;
import com.asdeire.oop.practice3.components.GraphicCard;
import com.asdeire.oop.practice3.components.Memory;
import com.asdeire.oop.practice3.components.Motherboard;
import com.asdeire.oop.practice3.components.PowerSupply;
import com.asdeire.oop.practice3.components.RAM;
import com.asdeire.oop.practice3.components.builders.CaseBuilder;
import com.asdeire.oop.practice3.components.builders.GraphicCardBuilder;
import com.asdeire.oop.practice3.components.builders.MemoryBuilder;
import com.asdeire.oop.practice3.components.builders.CPUBuilder;
import com.asdeire.oop.practice3.components.builders.MotherboardBuilder;
import com.asdeire.oop.practice3.components.builders.PowerSupplyBuilder;
import com.asdeire.oop.practice3.components.builders.RamBuilder;

public class Service {

    private final Assemble computerAssembly;

    public Service(Assemble computerAssembly){
        this.computerAssembly = computerAssembly;
    }

    public void addProcessor(CPUBuilder processorBuilder) {
        CPU processor = processorBuilder.build();
        computerAssembly.addComponent(processor);
    }

    public void addMemory(MemoryBuilder memoryBuilder) {
        Memory memory = memoryBuilder.build();
        computerAssembly.addComponent(memory);
    }

    public void addMotherboard(MotherboardBuilder motherboardBuilder) {
        Motherboard motherboard = motherboardBuilder.build();
        computerAssembly.addComponent(motherboard);
    }

    public void addGraphicCard(GraphicCardBuilder graphicCardBuilder) {
        GraphicCard graphicCard = graphicCardBuilder.build();
        computerAssembly.addComponent(graphicCard);
    }

    public void addPowerSupply(PowerSupplyBuilder powerSupplyBuilder) {
        PowerSupply powerSupply = powerSupplyBuilder.build();
        computerAssembly.addComponent(powerSupply);
    }

    public void addRam(RamBuilder ramBuilder) {
        RAM ram = ramBuilder.build();
        computerAssembly.addComponent(ram);
    }

    public void addCase(CaseBuilder caseBuilder) {
        Case pcCase = caseBuilder.build();
        computerAssembly.addComponent(pcCase);
    }

    public Assemble getComputer(){return computerAssembly;}
}
