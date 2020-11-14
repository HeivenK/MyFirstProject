package ch.teko.prog.ue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String input = "";
        while (!input.toLowerCase().equals("stop ")){
            input = new Scanner(System.in).next();
            System.out.println(input);
            System.out.println(" ");
        }
    }
}
