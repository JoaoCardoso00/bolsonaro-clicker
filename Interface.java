package clicker;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Interface extends Game{
    JFrame frame;
    JPanel header;
    JPanel body1;
    JPanel body2;

    Upgrade cloroquina = new Upgrade(0.1, 0, "cloroquina", "remedinho po covid :)", 100);
    Upgrade propina = new Upgrade(0.2, 0, "propina", "proteja seu filho :)", 300);
    Upgrade patada_entrevista = new Upgrade(0.3, 0, "patada na entrevista", "vao ficar de mimimi ate quando", 1000);
    Upgrade nepotismo = new Upgrade(0.5, 0, "nepotismo", "venha meu filho s2:)", 1500);

    public void createFrame(String s){
        frame = new JFrame(s);

        frame.setSize(1280, 920);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setVisible(true);
        frame.repaint();
        createPanel();
        createButtons();
    }
    void createPanel() {
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
    void createButtons() {

        //Image bolsonaro = ImageIO.read(getClass().getResource("bolsonaro.jpg"));
        //JButton click_target = new JButton();
        // click_target.setBounds(0, 300, 640, 620);

        //JButton click_target = new JButton();
        //Image bolsonaro = ImageIO.read(getClass().getResource("bolsonarinho.jpg"));
        //click_target.setBounds(0, 0, 640, 620);
        //click_target.setIcon(new ImageIcon(bolsonaro));

        //JLabel click_target = new JLabel(new ImageIcon("bolsonarinho.jpg"));

        JButton cloroquinaB = new JButton("Cloquinas");
        cloroquinaB.setBounds(713, 330, 500, 100);
        cloroquinaB.addActionListener(e -> {
            buyUpgrade(cloroquina);
        });
        JButton nepotismoB = new JButton("Nepotismo");
        nepotismoB.setBounds(713, 470, 500, 100);
        nepotismoB.addActionListener(e -> {
            buyUpgrade(nepotismo);
        });
        JButton propinaB = new JButton("Propinas");
        propinaB.setBounds(713, 610, 500, 100);
        propinaB.addActionListener(e -> {
            buyUpgrade(propina);
        });
        JButton patadasB = new JButton("Patadas em Entrevista");
        patadasB.setBounds(713, 750, 500, 100);
        patadasB.addActionListener(e -> {
            buyUpgrade(patada_entrevista);
        });
        
        //body1.add(click_target);
        body2.add(nepotismoB); 
        body2.add(cloroquinaB);
        body2.add(propinaB);
        body2.add(patadasB);
    }
}