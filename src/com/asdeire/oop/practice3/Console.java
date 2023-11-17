package com.asdeire.oop.practice3;

import com.asdeire.oop.practice3.components.builders.GraphicCardBuilder;
import com.asdeire.oop.practice3.components.builders.MemoryBuilder;
import com.asdeire.oop.practice3.components.builders.CPUBuilder;
import com.asdeire.oop.practice3.components.builders.MotherboardBuilder;
import com.asdeire.oop.practice3.components.builders.PowerSupplyBuilder;
import com.asdeire.oop.practice3.components.builders.RamBuilder;
import com.asdeire.oop.practice3.assembly.Assembly;
import com.asdeire.oop.practice3.assembly.tools.Assemble;
import com.asdeire.oop.practice3.assembly.Service;
import com.asdeire.oop.practice3.components.enums.FormFactor;
import com.asdeire.oop.practice3.components.enums.Manufacturer;

public class Main {

    private final Service service;


    public Main(Assemble assemble) {
        this.service = new Service(assemble);
    }

}
