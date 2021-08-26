package clicker;

import java.awt.*;
import javax.swing.*;


public class Interface extends Game {
    JFrame frame;
    JPanel panel;
    JTextField  counter_bolsonarinhos;
    JTextArea  counter_upgrades;
    JButton click_target;
    JButton cloroquinaB;
    JButton propinaB;
    JButton patadasB;
    JButton nepotismoB;

    Upgrade cloroquina = new Upgrade(1.0, 0, "cloroquina", "remedinho po covid :)", 60);
    Upgrade propina = new Upgrade(2.0, 0, "propina", "proteja seu filho :)", 125);
    Upgrade patada_entrevista = new Upgrade(3.0, 0, "patada na entrevista", "vao ficar de mimimi ate quando", 250);
    Upgrade nepotismo = new Upgrade(5.0, 0, "nepotismo", "venha meu filho s2:)", 500);


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

        cloroquinaB = new JButton("Cloroquinas");
        cloroquinaB.setBounds(713, 330, 500, 100);
        cloroquinaB.addActionListener(e -> {
            jogo.buyUpgrade(cloroquina);
            updateLabel(jogo);
        });
        propinaB = new JButton("Propinas");
        propinaB.setBounds(713, 470, 500, 100);
        propinaB.addActionListener(e -> {
            jogo.buyUpgrade(propina);
            updateLabel(jogo);
        });
        patadasB = new JButton("Patadas em Entrevista");
        patadasB.setBounds(713, 610, 500, 100);
        patadasB.addActionListener(e -> {
            jogo.buyUpgrade(patada_entrevista);
            updateLabel(jogo);
        });
        nepotismoB = new JButton("Nepotismo");
        nepotismoB.setBounds(713, 750, 500, 100);
        nepotismoB.addActionListener(e -> {
            jogo.buyUpgrade(nepotismo);
            updateLabel(jogo);
        });
    }

    void createLabels(Game jogo) {
        counter_bolsonarinhos = new JTextField (jogo.getBolsonarinhos() + " bolsonarinhos");
        counter_bolsonarinhos.setEditable(false);
        counter_bolsonarinhos.setFocusable(false);
        counter_bolsonarinhos.setBounds(50, 150, 500, 50);
        counter_bolsonarinhos.setFont(new Font(Font.SERIF, Font.BOLD, 50));
        
        counter_upgrades = new JTextArea ("Cloroquinas: " + cloroquina.quantity + "\nPropinas: " + propina.quantity + "\nPatadas: " + patada_entrevista.quantity + "\nNepotismos: " + nepotismo.quantity);
        counter_upgrades.setBounds(713, 120, 500, 130);
        counter_upgrades.setBackground(new Color(238, 238, 238));
        counter_upgrades.setEditable(false);
        counter_upgrades.setFocusable(false);
        counter_upgrades.setFont(new Font(Font.SERIF, Font.BOLD, 25));


    }
    void updateLabel(Game jogo) {
        counter_bolsonarinhos.setText(jogo.getBolsonarinhos() + " bolsonarinhos");
        counter_upgrades.setText("Cloroquinas: " + cloroquina.quantity + "\nPropinas: " + propina.quantity + "\nPatadas: " + patada_entrevista.quantity + "\nNepotismos: " + nepotismo.quantity);

    }
    void addComp() {
        panel.add(click_target);
        panel.add(counter_upgrades);
        panel.add(counter_bolsonarinhos);
        panel.add(cloroquinaB);
        panel.add(propinaB);
        panel.add(patadasB);
        panel.add(nepotismoB);
        
    }
}