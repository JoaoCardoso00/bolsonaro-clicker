package clicker;

public class index {
    public static void main(String[] args) {
        Interface ui = new Interface("Bolsonaro Clicker v17");
        Game jogo = new Game();

        ui.createFrame(jogo);
        ui.frame.repaint();
        jogo.generateBolsonarinhos(ui);

        System.out.println(ui.getNumUpgrades());


    }
}
