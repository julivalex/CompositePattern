package com.company;

import com.company.menu.MenuComponent;

import java.util.Iterator;

class Waitress {

    private MenuComponent allMenus;

    Waitress(MenuComponent menus) {
        this.allMenus = menus;
    }

    void printMenu() {
        allMenus.print();
    }

    void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if(component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
        allMenus.print();
    }
}
