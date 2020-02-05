package rysowanie;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        this.setTitle("Rysowanie");
        this.setBounds(250, 300, 700, 720);

        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Main().setVisible(true);
    }

    private PanelRysowiak panelDoRysowania = new PanelRysowiak();
}

class PanelRysowiak extends JPanel{
    public PanelRysowiak(){
        super();
        this.add(new JButton("Test"){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Napis", 325, 75);
        g.drawImage(new ImageIcon("giphy.gif").getImage(), 50, 80, 590,590,null);
        g.drawRect(50, 60, 590, 610);
        g.drawLine(640, 80, 50, 80);
        Graphics2D g2 = (Graphics2D)g;
        System.out.println(i++);
    }

    public static int i = 0;
}
