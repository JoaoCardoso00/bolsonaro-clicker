package clicker;

import java.awt.*;
import javax.swing.*;

public class Interface extends Game {
    JFrame frame;
    JPanel header;
    JPanel body1;
    JPanel body2;
    JLabel counter_bolsonarinhos;
    JLabel counter_upgrades;

    Upgrade cloroquina = new Upgrade(0.1, 0, "cloroquina", "remedinho po covid :)", 100);
    Upgrade propina = new Upgrade(0.2, 0, "propina", "proteja seu filho :)", 300);
    Upgrade patada_entrevista = new Upgrade(0.3, 0, "patada na entrevista", "vao ficar de mimimi ate quando", 1000);
    Upgrade nepotismo = new Upgrade(0.5, 0, "nepotismo", "venha meu filho s2:)", 1500);

    String bonoro;

    public void Interface() {

    }


    public void createFrame(String s, Game jogo) {
        frame = new JFrame(s);

        frame.setSize(1280, 920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ImageIcon icone = new ImageIcon("clicker/brasil.png");
        frame.setIconImage(icone.getImage());

        frame.setResizable(false);
        frame.setVisible(true);
        createPanel(jogo);
        createLabels(jogo);
        createButtons(jogo);

    }

    void createPanel(Game jogo) {
        header = new JPanel();
        body1 = new JPanel();
        body2 = new JPanel();

        header.setBounds(0, 0, 1280, 300);
        body1.setBounds(0, 300, 640, 620);
        body2.setBounds(640, 300, 640, 620);

        header.setBackground(Color.red);
        body1.setBackground(Color.blue);
        body2.setBackground(Color.green);

        frame.add(header);
        frame.add(body1);
        frame.add(body2);

    }

    void createButtons(Game jogo) {

        JButton click_target = new JButton();
        ImageIcon bolsonaro = new ImageIcon("clicker/bolsonarinho.jpg");
        click_target.setBounds(0, 0, 640, 620);
        click_target.setBorderPainted(false);
        click_target.setFocusable(false);
        click_target.setIcon(bolsonaro);

        click_target.addActionListener(e -> {
            jogo.click();
            updateLabel(jogo);
        });

        JButton cloroquinaB = new JButton("Cloquinas");
        cloroquinaB.setBounds(713, 330, 500, 100);
        cloroquinaB.addActionListener(e -> {
            jogo.buyUpgrade(cloroquina);
        });

        JButton propinaB = new JButton("Propinas");
        propinaB.setBounds(713, 470, 500, 100);
        propinaB.addActionListener(e -> {
            jogo.buyUpgrade(propina);
        });
        JButton patadasB = new JButton("Patadas em Entrevista");
        patadasB.setBounds(713, 610, 500, 100);
        patadasB.addActionListener(e -> {
            jogo.buyUpgrade(patada_entrevista);
        });
        JButton nepotismoB = new JButton("Nepotismo");
        nepotismoB.setBounds(713, 750, 500, 100);
        nepotismoB.addActionListener(e -> {
            jogo.buyUpgrade(nepotismo);
        });

        body1.add(click_target);
        body2.add(nepotismoB);
        body2.add(cloroquinaB);
        body2.add(propinaB);
        body2.add(patadasB);
    }

    void createLabels(Game jogo) {
        bonoro = jogo.getBolsonarinhos() + " bolsonarinhos";

        counter_bolsonarinhos = new JLabel();

        counter_bolsonarinhos.setBounds(0, 150, 640, 300);
        counter_bolsonarinhos.setText(bonoro);
        counter_bolsonarinhos.setFont(new Font(Font.SERIF, Font.BOLD, 50));

        counter_upgrades = new JLabel();
        counter_upgrades.setBounds(300, 150, 640, 300);
        counter_upgrades.setText(bonoro);
        counter_upgrades.setFont(new Font(Font.SERIF, Font.BOLD, 50));

        header.add(counter_bolsonarinhos);
        header.add(counter_upgrades);
    }

    void updateLabel(Game jogo) {
        bonoro = jogo.getBolsonarinhos() + " bolsonarinhos";
        counter_bolsonarinhos.setText(bonoro);
        counter_upgrades.setText(bonoro);
    }
}