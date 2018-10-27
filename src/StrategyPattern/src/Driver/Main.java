package StrategyPattern.src.Driver;

import StrategyPattern.src.Cart.ShoppingCart;
import StrategyPattern.src.Models.Item;
import StrategyPattern.src.PaymentTypes.CreditCardStrategy;
import StrategyPattern.src.PaymentTypes.PaypalStrategy;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item = new Item("1234", 10);
        Item item1 = new Item("5678", 40);

        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);

        shoppingCart.pay(new PaypalStrategy("testmail@gmail.com","mypwd"));
        shoppingCart.pay(new CreditCardStrategy("Karan","12345678", "123", "12/15"));
    }
}
