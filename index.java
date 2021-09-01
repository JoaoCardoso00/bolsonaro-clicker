package clicker;

public class index {
    public static void main(String[] args) {
        Interface ui = new Interface("Bolsonaro Clicker v17");
        Game jogo = new Game();
        Conquistas conq = new Conquistas();

        ui.createFrame(jogo, conq);
        ui.frame.repaint();
        conq.checker(jogo, 1);
        jogo.generateBolsonarinhos(ui);

        System.out.println(ui.getNumUpgrades());

    }
}
