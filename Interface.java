package clicker;
import java.awt.*;
import javax.swing.*;

public class Interface extends Game {
    public JFrame frame;
    private JPanel panel;
    private JTextField  title;
    private JTextField  subtitle;
    private JTextField  counter_bolsonarinhos;
    private JTextField  counter_multiplier;
    private JTextArea  counter_upgrades;
    private JButton click_target;
    private JButton cloroquinaB;
    private JButton propinaB;
    private JButton patadasB;
    private JButton nepotismoB;
    public Color DARK_GREEN;
    public String name;
    public int num_upgrades = 4;

    Upgrade cloroquina = new Upgrade(1, 0, "cloroquina", "remedinho po covid :)", 50);
    Upgrade propina = new Upgrade(2, 0, "propina", "proteja seu filho :)", 150);
    Upgrade patadas = new Upgrade(3, 0, "patada na entrevista", "vao ficar de mimimi ate quando", 250);
    Upgrade nepotismo = new Upgrade(5, 0, "nepotismo", "venha meu filho s2:)", 450);


    public int getNumUpgrades(){
        return num_upgrades;
    }

    public Interface(String name) {
        this.name = name;
    }


    void createFrame(Game jogo, Conquistas conq) {
        frame = new JFrame(name);
        panel = new JPanel(null);
        frame.setSize(1280, 920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icone = new ImageIcon("clicker/img/main/brasil.png");
        frame.setIconImage(icone.getImage());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        createLabels(jogo);
        createButtons(jogo, conq);
        addComp();

    }
    void createButtons(Game jogo, Conquistas conq) {

        click_target = new JButton();
        ImageIcon bolsonaro = new ImageIcon("clicker/img/skins/bolsonarinho.jpg");
        click_target.setBounds(0, 300, 640, 620);
        click_target.setIcon(bolsonaro);
        click_target.addActionListener(e -> {
            jogo.click(conq);
            updateLabel(jogo);
        });

        cloroquinaB = new JButton("<html>&nbsp;&nbsp;Cloroquinas<br/>&nbsp;&nbsp;Custo:" + cloroquina.getCost() + "</html>");
        cloroquinaB.setIcon(new ImageIcon("clicker/img/main/cloroquina.png"));
        cloroquinaB.setBounds(713, 330, 500, 100);
        cloroquinaB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        cloroquinaB.addActionListener(e -> {
            jogo.buyUpgrade(cloroquina, conq);
            updateLabel(jogo);
        });
        propinaB = new JButton("<html>&nbsp;&nbsp;Propinas<br/>&nbsp;&nbsp;Custo:" + propina.getCost() + "</html>");
        propinaB.setIcon(new ImageIcon("clicker/img/main/propina.png"));
        propinaB.setBounds(713, 470, 500, 100);
        propinaB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        propinaB.addActionListener(e -> {
            jogo.buyUpgrade(propina, conq);
            updateLabel(jogo);
        });
        patadasB = new JButton("<html>&nbsp;&nbsp;Patadas<br/>&nbsp;&nbsp;Custo:" + patadas.getCost() + "</html>");
        patadasB.setIcon(new ImageIcon("clicker/img/main/patadas.png"));
        patadasB.setBounds(713, 610, 500, 100);
        patadasB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        patadasB.addActionListener(e -> {
            jogo.buyUpgrade(patadas, conq);
            updateLabel(jogo);
        });
        nepotismoB = new JButton("<html>&nbsp;&nbsp;Nepotismo<br/>&nbsp;&nbsp;Custo:" + nepotismo.getCost() + "</html>");
        nepotismoB.setIcon(new ImageIcon("clicker/img/main/nepotismo.png"));
        nepotismoB.setBounds(713, 750, 500, 100);
        nepotismoB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        nepotismoB.addActionListener(e -> {
            jogo.buyUpgrade(nepotismo, conq);
            updateLabel(jogo);
        });
    }

    void createLabels(Game jogo) {
        DARK_GREEN = new Color(0,156,59);
        counter_bolsonarinhos = new JTextField (jogo.getBolsonarinhos() + " bolsonarinhos");
        counter_bolsonarinhos.setBorder(BorderFactory.createEmptyBorder());
        counter_bolsonarinhos.setEditable(false);
        counter_bolsonarinhos.setFocusable(false);
        counter_bolsonarinhos.setBounds(50, 150, 500, 50);
        counter_bolsonarinhos.setFont(new Font(Font.SERIF, Font.BOLD, 50));

        counter_multiplier = new JTextField (jogo.getMultiplier() + " bolsonarinhos por segundo");
        counter_multiplier.setBorder(BorderFactory.createEmptyBorder());
        counter_multiplier.setEditable(false);
        counter_multiplier.setFocusable(false);
        counter_multiplier.setBounds(50, 200, 500, 30);
        counter_multiplier.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
        
        counter_upgrades = new JTextArea ("Cloroquinas: " + cloroquina.quantity + "\nPropinas: " + propina.quantity + "\nPatadas: " + patadas.quantity + "\nNepotismos: " + nepotismo.quantity);
        counter_upgrades.setBounds(713, 120, 500, 130);
        counter_upgrades.setBackground(new Color(238, 238, 238));
        counter_upgrades.setEditable(false);
        counter_upgrades.setFocusable(false);
        counter_upgrades.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        title = new JTextField();
        title.setBorder(BorderFactory.createEmptyBorder());
        title.setText("O jogo do pai do Brasil");
        title.setEditable(false);
        title.setFocusable(false);
        title.setBounds(340, 20, 700, 60);
        title.setForeground(DARK_GREEN);
        title.setFont(new Font(Font.DIALOG, Font.BOLD, 50));

        subtitle = new JTextField();
        subtitle.setBorder(BorderFactory.createEmptyBorder());
        subtitle.setText("ou não");
        subtitle.setEditable(false);
        subtitle.setFocusable(false);
        subtitle.setBounds(620, 75, 100, 20);
        subtitle.setForeground(DARK_GREEN);
        subtitle.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
    }

    void updateLabel(Game jogo) {
        counter_bolsonarinhos.setText(jogo.getBolsonarinhos() + " bolsonarinhos");
        counter_multiplier.setText(jogo.getMultiplier() + " bolsonarinhos por segundo");
        counter_upgrades.setText("Cloroquinas: " + cloroquina.quantity + "\nPropinas: " + propina.quantity + "\nPatadas: " + patadas.quantity + "\nNepotismos: " + nepotismo.quantity);
        cloroquinaB.setText("<html>&nbsp;&nbsp;Cloroquinas<br/>&nbsp;&nbsp;Custo:" + cloroquina.getCost() + "</html>");
        nepotismoB.setText("<html>&nbsp;&nbsp;Nepotismo<br/>&nbsp;&nbsp;Custo:" + nepotismo.getCost() + "</html>");
        patadasB.setText("<html>&nbsp;&nbsp;Patadas<br/>&nbsp;&nbsp;Custo:" + patadas.getCost() + "</html>");
        propinaB.setText("<html>&nbsp;&nbsp;Propinas<br/>&nbsp;&nbsp;Custo:" + propina.getCost() + "</html>");


    }

    void addComp() {
        Component[] comps = {click_target,  counter_bolsonarinhos, counter_multiplier, title, subtitle, counter_upgrades, cloroquinaB, propinaB, patadasB, nepotismoB};
        for(int i = 0; i < comps.length; i++) {
            panel.add(comps[i]);
        }
    }

    
}