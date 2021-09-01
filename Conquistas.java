package clicker;

import javax.swing.*;

public class Conquistas{
    private boolean starting_game = false;
    private boolean first_bonoro = false;
    private boolean one_million_bonoro = false;
    private boolean ten_cloroquinas = false;
    private boolean ten_propinas = false;
    private boolean ten_patadas = false;
    private boolean ten_nepotismos = false;

    private String[] imgs = { "", "clicker/img/conquistas/starting_game.png", "clicker/img/conquistas/first_bonoro.png",
            "clicker/img/conquistas/one_million_bolsonarinhos.png", "clicker/img/conquistas/ten_cloroquinas.png",
            "clicker/img/conquistas/ten_propinas.png", "clicker/img/conquistas/ten_patadas.png",
            "clicker/img/conquistas/ten_nepotismos.png" };

    public Boolean[] getConquistas(){
        Boolean[] conquistas = {starting_game, first_bonoro, one_million_bonoro, ten_cloroquinas, ten_nepotismos, ten_patadas, ten_propinas};
        return conquistas; 
    }

    public void checker(Game jogo, int id){
        switch (id) {
            case 1:
                if(!starting_game){
                    starting_game = true;
                    createConqFrame(id);
                }
                break;
            case 2:
                if(!first_bonoro){
                    first_bonoro = true;
                    createConqFrame(id);
                }
                break;
            case 3:
                if(!one_million_bonoro){
                    one_million_bonoro = true;
                    createConqFrame(id);
                }
                break;
            case 4:
                if(!ten_cloroquinas){
                    ten_cloroquinas = true;
                    createConqFrame(id);
                }
                break;
            case 5:
                if(!ten_propinas){
                    ten_propinas = true;
                    createConqFrame(id);
                }
                break;
            case 6:
                if(!ten_patadas){
                    ten_patadas = true;
                    createConqFrame(id);
                }
                break;
            case 7:
                if(!ten_nepotismos){
                    ten_nepotismos = true;
                    createConqFrame(id);
                }
                break;
        }
    }
    
    public void createConqFrame(int id) {
        JFrame newFrame = new JFrame("Conquista desbloqueada");
        newFrame.setSize(445,199);

        ImageIcon icone = new ImageIcon("clicker/img/main/brasil.png");
        newFrame.setIconImage(icone.getImage());

        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);
        
        JPanel newPanel = new JPanel();
        newPanel.setBounds(0,0,429,156);
        newFrame.add(newPanel);
        
        JLabel newLabel = new JLabel(new ImageIcon(imgs[id]));
        newLabel.setBounds(0, 0, 429, 156);
        newPanel.add(newLabel);
        newFrame.setVisible(true);
        newFrame.repaint();

    }

}
