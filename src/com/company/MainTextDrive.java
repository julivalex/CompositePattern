package com.company;

import com.company.menu.Menu;
import com.company.menu.MenuComponent;
import com.company.menu.MenuItem;

public class MainTextDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus =
                new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));

        dinerMenu.add(new MenuItem("BLT",
                "Pancake with fried eggs, sausage",
                false,
                2.99));

        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                true,
                3.29));

        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple Pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
