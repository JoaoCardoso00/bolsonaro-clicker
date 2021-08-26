package clicker;

public class Game {
    private int bolsonarinhos = 0;
    private double multiplier = 1;

    public void click() {
        bolsonarinhos += 1 * multiplier;

    }

    public int getBolsonarinhos() {
        return bolsonarinhos;
    }

    public Game() {

    }

    public void setMultiplier(double num) {
        multiplier += num;
    }

    public void buyUpgrade(Upgrade upgrade) {
        if (bolsonarinhos >= upgrade.getCost()) {
            bolsonarinhos -= upgrade.getCost();
            setMultiplier(upgrade.getMultiplier());
            upgrade.increaseQuantity();
            upgrade.increaseCost();
        }
    }

}
