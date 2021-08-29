package clicker;


public class Game {
    private int bolsonarinhos = 0;
    private int multiplier = 0;
    private int clicks = 0;

    public void generateBolsonarinhos(Interface game){
        while (true) {
            bolsonarinhos += multiplier;
            game.updateLabel(this);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
            }
        }
    }
    
    public void click() {
        bolsonarinhos += 1;
        clicks += 1;

    }

    public int getClicks() {
        return clicks;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getBolsonarinhos() {
        return bolsonarinhos;
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
