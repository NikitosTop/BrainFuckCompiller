package com.company;

public class SwitchLeft implements Command{

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        if (index == 0) {
            index = memory.getSymbols().length - 1;
        }
        else {
            index--;
        }
        memory.setIndex(index);
    }

}
