package ch5.menu;

public enum MenuItem {

    AMERICANO("아메리카노", 1500),
    CAPPUCCINO("카푸치노", 2000),
    CARAMEL_MACCHIATO("카라멜 마키아또", 2500),
    ESPRESSO("에스프레소", 2500);

    private final String name;
    private final int price;

    MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
