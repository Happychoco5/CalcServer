package dev.terry.app;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create();

        app.get("hello", ctx ->{
           ctx.result("HI EVERYONE!");
        });

        app.start();
    }
}
