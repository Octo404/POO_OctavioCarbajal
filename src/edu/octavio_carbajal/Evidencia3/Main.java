package edu.octavio_carbajal.Evidencia3;

import edu.octavio_carbajal.Evidencia3.ui.Cli;

public class Main {
    public static void main(String[] args) {
      try {
          Cli.lanzarApp();
      }catch (Exception e){
          System.out.println("Error");
      }
    }
}
