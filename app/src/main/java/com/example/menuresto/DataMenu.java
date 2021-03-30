package com.example.menuresto;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class DataMenu {
    private static String [] MenuName = {
            "Baked broccoli",
            "Grilled octopus salad, citrus emulsion",
            "Spicy meatballs, marinara",
            "Carbonara Pasta",
            "Ratatouille",
            "Roasted chicken with potato wedges and vegetable salad",
            "Ham Sandwich with french fries",
            "Red Velvet Cake",
            "Tiramisu Cake",
            "Original cheese cake",
            "Classic Vanilla",
            "Banana Pudding",
            "Strawberries and Cream Shortcake",
            "Chocolate Fudge Cake",
            "Chocolate Caramel Toffee Cake"
    };

    private static String [] MenuDesc = {
            "Baked broccoli Is a fresh broccoli baked with virgin olive oil and cheese",
            "Vegetable salad with octopus grilled with our signature sauce, with the addition of a citrus emulsion",
            "5 level of spicy meatballs fryed with a delicious marinara sauce",
            "A premium pasta with bacon or ham served with carbonara sauce and cheese",
            "a vegetable dish consisting of onions, zucchini, tomatoes, eggplant, and peppers, fried and stewed in olive oil",
            "Roasted chicken with garlic and lemon herb served with mashed potato vegetable and salad",
            "Basic sandwich with ham, bacon, egg, cheese and vegetables served with vegetable salad",
            " a red-brown, crimson, scarlet-colored chocolate layer cake, layered with ermine icing.",
            " Tiramisu flavoured cake made of cake dipped in coffee, layered with a whipped mixture of eggs, sugar, and mascarpone cheese, flavoured with cocoa.",
            " a cake made up from two layer of components, first the crust on the bottom and the cheese-flavoured cake on the top of it served with fruits topping",
            " A moist vanilla cake made with Madagascar vanilla extract",
            " served in a pan or in jars depending on your need. Filled with Bananas, tons of Nilla wafer cookies, more bananas and our special made banana filling.",
            " Layers of shortcake, vanilla cream and strawberry jam. Topped off with white chocolate shaving and fresh strawberries.",
            " cake filled with Vanilla Bean or Raspberry or White chocolate buttercream or Chocolate Ganache",
            " Cake filled with Toffee Buttercream iced with Chocolate and drizzled with Caramel and toffee bits"
    };

    private static int [] menuImg = {
            R.drawable.broccoli,
            R.drawable.octopussalad,
            R.drawable.meatballs,
            R.drawable.carbonara,
            R.drawable.ratatoile,
            R.drawable.chicken,
            R.drawable.sandwich,
            R.drawable.redvelvet,
            R.drawable.tiramisu,
            R.drawable.cheesecake,
            R.drawable.vanilla,
            R.drawable.bananapudding,
            R.drawable.shortcake,
            R.drawable.fudge,
            R.drawable.toffee
    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList();
        for (int position = 0; position <MenuName.length; position++){
            Menu menu = new Menu();
            menu.setName(MenuName[position]);
            menu.setDesc(MenuDesc[position]);
            menu.setImages(menuImg[position]);
            list.add(menu);
        }
        return list;
    }

}
