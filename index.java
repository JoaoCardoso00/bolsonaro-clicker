package clicker;

public class index {
    public static void main(String[] args) {
        Interface ui = new Interface();
        Game jogo = new Game();

        ui.createFrame("Bolsonaro Clicker v17", jogo);
        ui.frame.repaint();
        jogo.generateBolsonarinhos(ui);
    }
}
