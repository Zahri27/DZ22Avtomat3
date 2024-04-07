public enum DrinksMachine {
    COFFEE(2.5),
    TEA(1.8),
    LEMONADE(3.0),
    MOJITO(4.0),
    MINERAL_WATER(1.0),
    COCA_COLA(2.2);

    private final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
