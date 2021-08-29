package clicker;

public class Upgrade {
    private double multiplier;
    public int quantity;
    public String name;
    public String description;
    public int cost;

    public int getCost(){
        return this.cost;
    }

    public void increaseCost(){
        this.cost *= 1.06;
    }

    public double getMultiplier(){
        return this.multiplier;
    }

    public void increaseQuantity(Game jogo, Conquistas conq){
        switch (name) {
            case "cloroquina":
                if (this.quantity == 9) {
                    conq.checker(jogo, 4);
                }
                break;
            case "propina":
                if (this.quantity == 9) {
                    conq.checker(jogo, 5);
                }
                break;
            case "patadas":
                if (this.quantity == 9) {
                    conq.checker(jogo, 6);
                }
                break;
            case "nepotismo":
                if (this.quantity == 9) {
                    conq.checker(jogo, 7);
                }
                break;
        }
        this.quantity += 1;
    }

    public Upgrade(int multiplier, int quantity, String name, String description, int cost) {
        this.multiplier = multiplier;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

}
