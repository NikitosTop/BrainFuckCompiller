package com.company;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BrainFuckCompilerTest {

    @Test
    public void testBeerCode(){
        String beer = ">++++++++++[<++++++++++>-]<->>>>>+++[>+++>+++<<-]<<<<+<[>[>+\n" +
                ">+<<-]>>[-<<+>>]++++>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<[[-]>>\n" +
                ">>>>[[-]<++++++++++<->>]<-[>+>+<<-]>[<+>-]+>[[-]<->]<<<<<<<<\n" +
                "<->>]<[>+>+<<-]>>[-<<+>>]+>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<\n" +
                "<[>>+>+<<<-]>>>[-<<<+>>>]++>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<\n" +
                "<[>+<[-]]<[>>+<<[-]]>>[<<+>>[-]]<<<[>>+>+<<<-]>>>[-<<<+>>>]+\n" +
                "+++>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<[>+<[-]]<[>>+<<[-]]>>[<\n" +
                "<+>>[-]]<<[[-]>>>++++++++[>>++++++<<-]>[<++++++++[>++++++<-]\n" +
                ">.<++++++++[>------<-]>[<<+>>-]]>.<<++++++++[>>------<<-]<[-\n" +
                ">>+<<]<++++++++[<++++>-]<.>+++++++[>+++++++++<-]>+++.<+++++[\n" +
                ">+++++++++<-]>.+++++..--------.-------.++++++++++++++>>[>>>+\n" +
                ">+<<<<-]>>>>[-<<<<+>>>>]>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<<<\n" +
                "[>>>+>+<<<<-]>>>>[-<<<<+>>>>]+>+<[-<->]<[[-]>>-<<]>>[[-]<<+>\n" +
                ">]<<<[>>+<<[-]]>[>+<[-]]++>>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<\n" +
                "+<[[-]>-<]>[<<<<<<<.>>>>>>>[-]]<<<<<<<<<.>>----.---------.<<\n" +
                ".>>----.+++..+++++++++++++.[-]<<[-]]<[>+>+<<-]>>[-<<+>>]+>+<\n" +
                "[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<<[>>+>+<<<-]>>>[-<<<+>>>]++++\n" +
                ">+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<[>+<[-]]<[>>+<<[-]]>>[<<+>\n" +
                ">[-]]<<[[-]>++++++++[<++++>-]<.>++++++++++[>+++++++++++<-]>+\n" +
                ".-.<<.>>++++++.------------.---.<<.>++++++[>+++<-]>.<++++++[\n" +
                ">----<-]>++.+++++++++++..[-]<<[-]++++++++++.[-]]<[>+>+<<-]>>\n" +
                "[-<<+>>]+++>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<[[-]++++++++++.\n" +
                ">+++++++++[>+++++++++<-]>+++.+++++++++++++.++++++++++.------\n" +
                ".<++++++++[>>++++<<-]>>.<++++++++++.-.---------.>.<-.+++++++\n" +
                "++++.++++++++.---------.>.<-------------.+++++++++++++.-----\n" +
                "-----.>.<++++++++++++.---------------.<+++[>++++++<-]>..>.<-\n" +
                "---------.+++++++++++.>.<<+++[>------<-]>-.+++++++++++++++++\n" +
                ".---.++++++.-------.----------.[-]>[-]<<<.[-]]<[>+>+<<-]>>[-\n" +
                "<<+>>]++++>+<[-<->]<[[-]>>-<<]>>[[-]<<+>>]<<[[-]++++++++++.[\n" +
                "-]<[-]>]<+<]";
        List<Command> commands = new Compiller().compile(beer);
        Memory memory = new Memory();
        for(Command c:commands){
            c.execute(memory);
        }
        String beerResult = "99 Bottles of beer on the wall\n" +
                "99 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "98 Bottles of beer on the wall\n" +
                "\n" +
                "98 Bottles of beer on the wall\n" +
                "98 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "97 Bottles of beer on the wall\n" +
                "\n" +
                "97 Bottles of beer on the wall\n" +
                "97 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "96 Bottles of beer on the wall\n" +
                "\n" +
                "96 Bottles of beer on the wall\n" +
                "96 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "95 Bottles of beer on the wall\n" +
                "\n" +
                "95 Bottles of beer on the wall\n" +
                "95 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "94 Bottles of beer on the wall\n" +
                "\n" +
                "94 Bottles of beer on the wall\n" +
                "94 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "93 Bottles of beer on the wall\n" +
                "\n" +
                "93 Bottles of beer on the wall\n" +
                "93 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "92 Bottles of beer on the wall\n" +
                "\n" +
                "92 Bottles of beer on the wall\n" +
                "92 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "91 Bottles of beer on the wall\n" +
                "\n" +
                "91 Bottles of beer on the wall\n" +
                "91 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "90 Bottles of beer on the wall\n" +
                "\n" +
                "90 Bottles of beer on the wall\n" +
                "90 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "89 Bottles of beer on the wall\n" +
                "\n" +
                "89 Bottles of beer on the wall\n" +
                "89 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "88 Bottles of beer on the wall\n" +
                "\n" +
                "88 Bottles of beer on the wall\n" +
                "88 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "87 Bottles of beer on the wall\n" +
                "\n" +
                "87 Bottles of beer on the wall\n" +
                "87 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "86 Bottles of beer on the wall\n" +
                "\n" +
                "86 Bottles of beer on the wall\n" +
                "86 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "85 Bottles of beer on the wall\n" +
                "\n" +
                "85 Bottles of beer on the wall\n" +
                "85 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "84 Bottles of beer on the wall\n" +
                "\n" +
                "84 Bottles of beer on the wall\n" +
                "84 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "83 Bottles of beer on the wall\n" +
                "\n" +
                "83 Bottles of beer on the wall\n" +
                "83 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "82 Bottles of beer on the wall\n" +
                "\n" +
                "82 Bottles of beer on the wall\n" +
                "82 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "81 Bottles of beer on the wall\n" +
                "\n" +
                "81 Bottles of beer on the wall\n" +
                "81 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "80 Bottles of beer on the wall\n" +
                "\n" +
                "80 Bottles of beer on the wall\n" +
                "80 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "79 Bottles of beer on the wall\n" +
                "\n" +
                "79 Bottles of beer on the wall\n" +
                "79 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "78 Bottles of beer on the wall\n" +
                "\n" +
                "78 Bottles of beer on the wall\n" +
                "78 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "77 Bottles of beer on the wall\n" +
                "\n" +
                "77 Bottles of beer on the wall\n" +
                "77 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "76 Bottles of beer on the wall\n" +
                "\n" +
                "76 Bottles of beer on the wall\n" +
                "76 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "75 Bottles of beer on the wall\n" +
                "\n" +
                "75 Bottles of beer on the wall\n" +
                "75 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "74 Bottles of beer on the wall\n" +
                "\n" +
                "74 Bottles of beer on the wall\n" +
                "74 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "73 Bottles of beer on the wall\n" +
                "\n" +
                "73 Bottles of beer on the wall\n" +
                "73 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "72 Bottles of beer on the wall\n" +
                "\n" +
                "72 Bottles of beer on the wall\n" +
                "72 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "71 Bottles of beer on the wall\n" +
                "\n" +
                "71 Bottles of beer on the wall\n" +
                "71 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "70 Bottles of beer on the wall\n" +
                "\n" +
                "70 Bottles of beer on the wall\n" +
                "70 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "69 Bottles of beer on the wall\n" +
                "\n" +
                "69 Bottles of beer on the wall\n" +
                "69 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "68 Bottles of beer on the wall\n" +
                "\n" +
                "68 Bottles of beer on the wall\n" +
                "68 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "67 Bottles of beer on the wall\n" +
                "\n" +
                "67 Bottles of beer on the wall\n" +
                "67 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "66 Bottles of beer on the wall\n" +
                "\n" +
                "66 Bottles of beer on the wall\n" +
                "66 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "65 Bottles of beer on the wall\n" +
                "\n" +
                "65 Bottles of beer on the wall\n" +
                "65 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "64 Bottles of beer on the wall\n" +
                "\n" +
                "64 Bottles of beer on the wall\n" +
                "64 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "63 Bottles of beer on the wall\n" +
                "\n" +
                "63 Bottles of beer on the wall\n" +
                "63 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "62 Bottles of beer on the wall\n" +
                "\n" +
                "62 Bottles of beer on the wall\n" +
                "62 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "61 Bottles of beer on the wall\n" +
                "\n" +
                "61 Bottles of beer on the wall\n" +
                "61 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "60 Bottles of beer on the wall\n" +
                "\n" +
                "60 Bottles of beer on the wall\n" +
                "60 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "59 Bottles of beer on the wall\n" +
                "\n" +
                "59 Bottles of beer on the wall\n" +
                "59 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "58 Bottles of beer on the wall\n" +
                "\n" +
                "58 Bottles of beer on the wall\n" +
                "58 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "57 Bottles of beer on the wall\n" +
                "\n" +
                "57 Bottles of beer on the wall\n" +
                "57 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "56 Bottles of beer on the wall\n" +
                "\n" +
                "56 Bottles of beer on the wall\n" +
                "56 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "55 Bottles of beer on the wall\n" +
                "\n" +
                "55 Bottles of beer on the wall\n" +
                "55 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "54 Bottles of beer on the wall\n" +
                "\n" +
                "54 Bottles of beer on the wall\n" +
                "54 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "53 Bottles of beer on the wall\n" +
                "\n" +
                "53 Bottles of beer on the wall\n" +
                "53 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "52 Bottles of beer on the wall\n" +
                "\n" +
                "52 Bottles of beer on the wall\n" +
                "52 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "51 Bottles of beer on the wall\n" +
                "\n" +
                "51 Bottles of beer on the wall\n" +
                "51 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "50 Bottles of beer on the wall\n" +
                "\n" +
                "50 Bottles of beer on the wall\n" +
                "50 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "49 Bottles of beer on the wall\n" +
                "\n" +
                "49 Bottles of beer on the wall\n" +
                "49 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "48 Bottles of beer on the wall\n" +
                "\n" +
                "48 Bottles of beer on the wall\n" +
                "48 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "47 Bottles of beer on the wall\n" +
                "\n" +
                "47 Bottles of beer on the wall\n" +
                "47 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "46 Bottles of beer on the wall\n" +
                "\n" +
                "46 Bottles of beer on the wall\n" +
                "46 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "45 Bottles of beer on the wall\n" +
                "\n" +
                "45 Bottles of beer on the wall\n" +
                "45 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "44 Bottles of beer on the wall\n" +
                "\n" +
                "44 Bottles of beer on the wall\n" +
                "44 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "43 Bottles of beer on the wall\n" +
                "\n" +
                "43 Bottles of beer on the wall\n" +
                "43 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "42 Bottles of beer on the wall\n" +
                "\n" +
                "42 Bottles of beer on the wall\n" +
                "42 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "41 Bottles of beer on the wall\n" +
                "\n" +
                "41 Bottles of beer on the wall\n" +
                "41 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "40 Bottles of beer on the wall\n" +
                "\n" +
                "40 Bottles of beer on the wall\n" +
                "40 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "39 Bottles of beer on the wall\n" +
                "\n" +
                "39 Bottles of beer on the wall\n" +
                "39 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "38 Bottles of beer on the wall\n" +
                "\n" +
                "38 Bottles of beer on the wall\n" +
                "38 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "37 Bottles of beer on the wall\n" +
                "\n" +
                "37 Bottles of beer on the wall\n" +
                "37 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "36 Bottles of beer on the wall\n" +
                "\n" +
                "36 Bottles of beer on the wall\n" +
                "36 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "35 Bottles of beer on the wall\n" +
                "\n" +
                "35 Bottles of beer on the wall\n" +
                "35 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "34 Bottles of beer on the wall\n" +
                "\n" +
                "34 Bottles of beer on the wall\n" +
                "34 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "33 Bottles of beer on the wall\n" +
                "\n" +
                "33 Bottles of beer on the wall\n" +
                "33 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "32 Bottles of beer on the wall\n" +
                "\n" +
                "32 Bottles of beer on the wall\n" +
                "32 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "31 Bottles of beer on the wall\n" +
                "\n" +
                "31 Bottles of beer on the wall\n" +
                "31 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "30 Bottles of beer on the wall\n" +
                "\n" +
                "30 Bottles of beer on the wall\n" +
                "30 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "29 Bottles of beer on the wall\n" +
                "\n" +
                "29 Bottles of beer on the wall\n" +
                "29 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "28 Bottles of beer on the wall\n" +
                "\n" +
                "28 Bottles of beer on the wall\n" +
                "28 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "27 Bottles of beer on the wall\n" +
                "\n" +
                "27 Bottles of beer on the wall\n" +
                "27 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "26 Bottles of beer on the wall\n" +
                "\n" +
                "26 Bottles of beer on the wall\n" +
                "26 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "25 Bottles of beer on the wall\n" +
                "\n" +
                "25 Bottles of beer on the wall\n" +
                "25 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "24 Bottles of beer on the wall\n" +
                "\n" +
                "24 Bottles of beer on the wall\n" +
                "24 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "23 Bottles of beer on the wall\n" +
                "\n" +
                "23 Bottles of beer on the wall\n" +
                "23 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "22 Bottles of beer on the wall\n" +
                "\n" +
                "22 Bottles of beer on the wall\n" +
                "22 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "21 Bottles of beer on the wall\n" +
                "\n" +
                "21 Bottles of beer on the wall\n" +
                "21 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "20 Bottles of beer on the wall\n" +
                "\n" +
                "20 Bottles of beer on the wall\n" +
                "20 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "19 Bottles of beer on the wall\n" +
                "\n" +
                "19 Bottles of beer on the wall\n" +
                "19 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "18 Bottles of beer on the wall\n" +
                "\n" +
                "18 Bottles of beer on the wall\n" +
                "18 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "17 Bottles of beer on the wall\n" +
                "\n" +
                "17 Bottles of beer on the wall\n" +
                "17 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "16 Bottles of beer on the wall\n" +
                "\n" +
                "16 Bottles of beer on the wall\n" +
                "16 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "15 Bottles of beer on the wall\n" +
                "\n" +
                "15 Bottles of beer on the wall\n" +
                "15 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "14 Bottles of beer on the wall\n" +
                "\n" +
                "14 Bottles of beer on the wall\n" +
                "14 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "13 Bottles of beer on the wall\n" +
                "\n" +
                "13 Bottles of beer on the wall\n" +
                "13 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "12 Bottles of beer on the wall\n" +
                "\n" +
                "12 Bottles of beer on the wall\n" +
                "12 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "11 Bottles of beer on the wall\n" +
                "\n" +
                "11 Bottles of beer on the wall\n" +
                "11 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "10 Bottles of beer on the wall\n" +
                "\n" +
                "10 Bottles of beer on the wall\n" +
                "10 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "9 Bottles of beer on the wall\n" +
                "\n" +
                "9 Bottles of beer on the wall\n" +
                "9 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "8 Bottles of beer on the wall\n" +
                "\n" +
                "8 Bottles of beer on the wall\n" +
                "8 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "7 Bottles of beer on the wall\n" +
                "\n" +
                "7 Bottles of beer on the wall\n" +
                "7 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "6 Bottles of beer on the wall\n" +
                "\n" +
                "6 Bottles of beer on the wall\n" +
                "6 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "5 Bottles of beer on the wall\n" +
                "\n" +
                "5 Bottles of beer on the wall\n" +
                "5 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "4 Bottles of beer on the wall\n" +
                "\n" +
                "4 Bottles of beer on the wall\n" +
                "4 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "3 Bottles of beer on the wall\n" +
                "\n" +
                "3 Bottles of beer on the wall\n" +
                "3 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "2 Bottles of beer on the wall\n" +
                "\n" +
                "2 Bottles of beer on the wall\n" +
                "2 Bottles of beer\n" +
                "Take one down and pass it around\n" +
                "1 Bottle of beer on the wall\n" +
                "\n" +
                "1 Bottle of beer on the wall\n" +
                "1 Bottle of beer\n" +
                "Take one down and pass it around\n" +
                "0 Bottles of beer on the wall\n" +
                "\n";
        assertEquals(beerResult, memory.getResult().toString());
    }

    @Test
    public void testHelloWorld(){
        String helloWorld = "-[------->+<]>-.-[->+++++<]>++.+++++++..+++.[--->+<]>-----.---[->+++<]>.-[--->+<]>---.+++.------.--------.";
        List<Command> commands = new Compiller().compile(helloWorld);
        Memory memory = new Memory();
        for(Command c:commands){
            c.execute(memory);
        }
        assertEquals("Hello World", memory.getResult().toString());
    }

}
