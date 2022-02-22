package com.company;

import java.util.List;

public class Loop implements Command {

    private final List<Command> commands;

    public Loop(String substring) {
        this.commands = new Compiller().compile(substring);
    }

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        while (memory.getSymbols()[index] != 0){
            for(Command c:commands){
                c.execute(memory);
            }
        }
    }
}
