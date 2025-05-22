package com.mycompany.casabuilder;

public class CastleBuilder implements Builder{
    
    private String wallType;
    private String windowType;
    private String doorType;

    @Override
    public void setWallType() {
        this.wallType = "Pedra";
    }

    @Override
    public void setWindowType() {
        this.windowType = "Ferro";
    }

    @Override
    public void setDoorType() {
        this.doorType = "Ferro";
    }
    
    public House getResult(){
        return new House(wallType, windowType, doorType);
    }
    
}
