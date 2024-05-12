package edu.octavio_carbajal.reto11;

import edu.octavio_carbajal.reto11.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchApp();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}