package com.company;

public class Print implements Command{


    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        memory.setResult(String.valueOf((char) memory.getSymbols()[index]));
    }

}
