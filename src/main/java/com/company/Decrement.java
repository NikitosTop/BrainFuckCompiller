package com.company;

public class Decrement implements Command{

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        memory.getSymbols()[index] -= 1;
    }
}
