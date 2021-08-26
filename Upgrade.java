package clicker;

public class Upgrade {
    private double multiplier;
    private int quantity;
    private String name;
    private String description;
    private int cost;

    public int getCost(){
        return this.cost;
    }

    public void increaseCost(){
        this.cost *= 1.5;
    }

    public double getMultiplier(){
        return this.multiplier;
    }

    public void increaseQuantity(){
        this.quantity += 1;
    }

    public Upgrade(Double multiplier, int quantity, String name, String description, int cost) {
        this.multiplier = multiplier;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

}