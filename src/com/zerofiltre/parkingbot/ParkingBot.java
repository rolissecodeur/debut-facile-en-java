package com.zerofiltre.parkingbot;

public class ParkingBot {

    /**
     * Fonction principale du programme java
     * @param args représente les données passées en paramètre
     */
    public static void main(String[] args) {
        sayHello(args);
    }

    private static void sayHello(String[] args) {
        String welcomeMessage = "Hello " + args[0] + ", bienvenue au parking OA";
        String services = "Nous offrons les services suivants : Gardienage, laverie ...";
        String warning = "Depechez-vous dentrer car il n'y aura bientôt plus de places!";
        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}
