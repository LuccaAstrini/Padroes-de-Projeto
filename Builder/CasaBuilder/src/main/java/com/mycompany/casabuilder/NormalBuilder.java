package com.mycompany.casabuilder;

public class NormalBuilder implements Builder{

    private String wallType;
    private String windowType;
    private String doorType;

    @Override
    public void setWallType() {
        this.wallType = "Tijolo";
    }

    @Override
    public void setWindowType() {
        this.windowType = "Blindex";
    }

    @Override
    public void setDoorType() {
        this.doorType = "Madeira";
    }

    public House getResult() {
        return new House(wallType, windowType, doorType);
    }
}
