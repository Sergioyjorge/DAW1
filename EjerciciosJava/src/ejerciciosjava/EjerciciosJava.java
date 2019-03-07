/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author pinsilse
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pokemon = "";
        Scanner sc = new Scanner(System.in);
        int masterball = 1, pokeball = 20, num, opc;
        boolean capturado = false;
    
            num = (int) (Math.random() * 21);
            if (num < 3) {
                pokemon = "MewTwo";
            } else if (num < 10) {
                pokemon = "Charisah";
            } else {
                pokemon = "Caterpie";
            }
            System.out.println("Te enfrentas a: " + pokemon);
            do{
            System.out.println("Que quieres usar?\n1-Pokeball\n2-Masterball");
            opc = sc.nextInt();
            switch (opc) {
                case 1:

                    if (pokemon.equals("MewTwo")) {
                        for (; pokeball <= 0 || capturado == true;) {
                            num = (int) (Math.random() * 101);
                            if (num < 10) {
                                capturado = true;
                                System.out.println("Ya esta, pokemon capturado!");
                            } else {
                                pokeball--;
                                break;
                            }
                        }
                    }else  if (pokemon.equals("Charisah")) {
                        for (; pokeball <= 0 || capturado == true;) {
                            num = (int) (Math.random() * 101);
                            if (num < 30) {
                                capturado = true;
                                System.out.println("Ya esta, pokemon capturado!");
                            } else {
                                System.out.println("O no, se ha escapado");
                                pokeball--;
                                break;
                            }
                        }
                    }else{
                       for (; pokeball <= 0 || capturado == true;) {
                            num = (int) (Math.random() * 101);
                            if (num < 30) {
                                capturado = true;
                                System.out.println("Ya esta, pokemon capturado!");
                            } else {
                                pokeball--;
                                break;
                            }
                        }
                    }
                case 2:
                    System.out.println("Ya esta, pokemon capturado!");
            }

        } while (!capturado);

    }

}
