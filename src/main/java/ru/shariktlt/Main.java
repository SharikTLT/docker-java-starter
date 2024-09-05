package ru.shariktlt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dummy app is starting");


        while (true) {
            try {
                printLogs(args);
                Thread.currentThread().sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void printLogs(String[] args) {
        System.out.println("##########################################################");
        System.out.println("#       Dont forget to map your jar to /app/app.jar      #");
        System.out.println("##########################################################");

        System.out.println("Environment:");
        System.getenv().forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.println("Args [" + args.length + "]:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("[" + i + "] " + args[i]);
            
        }
    }
}