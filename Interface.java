package clicker;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;



public class Interface extends Game {
    JFrame frame;
    JPanel panel;
    JTextField  title;
    JTextField  subtitle;
    JTextField  counter_bolsonarinhos;
    JTextField  counter_multiplier;
    JTextArea  counter_upgrades;
    JButton click_target;
    JButton cloroquinaB;
    JButton propinaB;
    JButton patadasB;
    JButton nepotismoB;
    Color DARK_GREEN;

    Upgrade cloroquina = new Upgrade(1, 0, "cloroquina", "remedinho po covid :)", 100);
    Upgrade propina = new Upgrade(2, 0, "propina", "proteja seu filho :)", 300);
    Upgrade patadas = new Upgrade(3, 0, "patada na entrevista", "vao ficar de mimimi ate quando", 500);
    Upgrade nepotismo = new Upgrade(5, 0, "nepotismo", "venha meu filho s2:)", 900);


    public void Interface() {

    }


    void createFrame(String s, Game jogo) {
        frame = new JFrame(s);
        panel = new JPanel(null);
        frame.setSize(1280, 920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icone = new ImageIcon("clicker/brasil.png");
        frame.setIconImage(icone.getImage());

        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        createLabels(jogo);
        createButtons(jogo);
        addComp();

    }
    void createButtons(Game jogo) {

        click_target = new JButton();
        ImageIcon bolsonaro = new ImageIcon("clicker/bolsonarinho.jpg");
        click_target.setBounds(0, 300, 640, 620);
        click_target.setIcon(bolsonaro);
        click_target.addActionListener(e -> {
            jogo.click();
            updateLabel(jogo);
        });

        cloroquinaB = new JButton("<html>&nbsp;&nbsp;Cloroquinas<br/>&nbsp;&nbsp;Custo:" + cloroquina.getCost() + "</html>");
        cloroquinaB.setIcon(new ImageIcon("clicker/cloroquina.png"));
        cloroquinaB.setBounds(713, 330, 500, 100);
        cloroquinaB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        cloroquinaB.addActionListener(e -> {
            jogo.buyUpgrade(cloroquina);
            updateLabel(jogo);
        });
        propinaB = new JButton("<html>&nbsp;&nbsp;Propinas<br/>&nbsp;&nbsp;Custo:" + propina.getCost() + "</html>");
        propinaB.setIcon(new ImageIcon("clicker/propina.png"));
        propinaB.setBounds(713, 470, 500, 100);
        propinaB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        propinaB.addActionListener(e -> {
            jogo.buyUpgrade(propina);
            updateLabel(jogo);
        });
        patadasB = new JButton("<html>&nbsp;&nbsp;Patadas<br/>&nbsp;&nbsp;Custo:" + patadas.getCost() + "</html>");
        patadasB.setIcon(new ImageIcon("clicker/patadas.png"));
        patadasB.setBounds(713, 610, 500, 100);
        patadasB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        patadasB.addActionListener(e -> {
            jogo.buyUpgrade(patadas);
            updateLabel(jogo);
        });
        nepotismoB = new JButton("<html>&nbsp;&nbsp;Nepotismo<br/>&nbsp;&nbsp;Custo:" + nepotismo.getCost() + "</html>");
        nepotismoB.setIcon(new ImageIcon("clicker/nepotismo.png"));
        nepotismoB.setBounds(713, 750, 500, 100);
        nepotismoB.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        nepotismoB.addActionListener(e -> {
            jogo.buyUpgrade(nepotismo);
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
        title.setText("O jogo do filho do Brasil");
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