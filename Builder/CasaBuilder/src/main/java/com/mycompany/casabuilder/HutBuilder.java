package com.mycompany.casabuilder;

public class HutBuilder implements Builder{
    
    private String wallType;
    private String windowType;
    private String doorType;

    @Override
    public void setWallType() {
        this.wallType = "Madeira";
    }

    @Override
    public void setWindowType() {
        this.windowType = "Madeira";
    }

    @Override
    public void setDoorType() {
        this.doorType = "Madeira";
    }
    
    public House getResult(){
        return new House(wallType, windowType, doorType);
    }
    
}
