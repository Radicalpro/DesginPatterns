package com.ty.patterns.iterator;

import com.ty.patterns.iterator.concreteaggregate.FilmMenu;
import com.ty.patterns.iterator.concreteaggregate.TVChanneMenu;

public class Test {
    public static void main(String[] args) {

        TVChanneMenu tvMenu = new TVChanneMenu();
        FilmMenu filmMenu = new FilmMenu();

        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}
