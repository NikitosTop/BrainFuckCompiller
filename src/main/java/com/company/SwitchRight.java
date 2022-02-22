package com.company;

public class SwitchRight implements Command{

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        if(index == memory.getSymbols().length - 1){
            index = 0;
        }else{
            index++;
        }
        memory.setIndex(index);
    }
}
