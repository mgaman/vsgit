package com.henryd;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            System.out.println("Hello World " + i + "!");
            //System.out.println(i);
        }
    }
}
