package edu.octavio_carbajal.reto2;

import edu.octavio_carbajal.reto2.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchAPP();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}