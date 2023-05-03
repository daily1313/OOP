package ch5.coffee;

import ch5.menu.MenuItem;
import java.util.HashMap;

public class CoffeeFactory {

    private static final HashMap<String, Coffee> map = new HashMap<>();

    public static Coffee createCoffee(MenuItem item, int quantity, String coffeeName) {
        map.put(MenuItem.AMERICANO.getName(), new Americano(item, quantity));
        map.put(MenuItem.ESPRESSO.getName(), new Espresso(item, quantity));
        map.put(MenuItem.CARAMEL_MACCHIATO.getName(), new Macchiato(item, quantity));
        map.put(MenuItem.ESPRESSO.getName(), new Espresso(item, quantity));
        return map.get(coffeeName);
    }
}
