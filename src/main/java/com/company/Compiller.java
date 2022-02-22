package com.company;

import java.util.ArrayList;
import java.util.List;

public class Compiller {

    public List<Command> compile(String code){
        List<String> temp = List.of(code.split(""));
        List<Command> symbols = new ArrayList<>();
        for(int i = 0; i < temp.size(); i++){
            switch (temp.get(i)) {
                case "+" -> symbols.add(new Increment());
                case "-" -> symbols.add(new Decrement());
                case "." -> symbols.add(new Print());
                case ">" -> symbols.add(new SwitchRight());
                case "<" -> symbols.add(new SwitchLeft());
                case "[" -> {
                    int endBracket = findCloseBracket(i,code) - 1;
                    symbols.add(new Loop(code.substring(i + 1, endBracket)));
                    i = endBracket;
                }
            }
        }
        return symbols;
    }

    private static int findCloseBracket(int from, String word){

        int checkOpenBrackets = 1;
        int position = from + 1;
        while (checkOpenBrackets > 0) {
            if (word.charAt(position) == '[') {
                checkOpenBrackets++;
            }

            if (word.charAt(position) == ']') {
                checkOpenBrackets--;
            }

            position++;
        }
        return position;

    }

}
