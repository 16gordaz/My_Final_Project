import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Options extends JPanel implements ActionListener{
    
    JButton back, char1, char2, char3, map1, map2, map3;
    ImageIcon poop, monkey, santa, fantasy, dorney, hershey;
    Image poop_final, monkey_final, santa_final, fantasy_final, dorney_final, hershey_final;
    ImageIcon selectedchar;
    Image selectedMap;
    int m = 3;
    int c = 3;
    
    Options()
    {
        super();

        setBackground(new Color(95,158,160));
        setLayout(null);
        back = new JButton("Back");
        back.setOpaque(true);
        back.setBounds(10, 10, 50, 20);
        add(back);
        
        char1 = new JButton();
        char1.setBounds(250, 400, 170, 140);
        char1.setOpaque(true);
        add(char1);
        char1.addActionListener(this);
        
        char2 = new JButton();
        char2.setBounds(450, 400, 170, 140);
        char2.setOpaque(true);
        add(char2);
        char2.addActionListener(this);
        
        char3 = new JButton();
        char3.setBounds(650, 400, 170, 140);
        char3.setOpaque(true);
        add(char3);
        char3.addActionListener(this);
        
        map1 = new JButton();
        map1.setBounds(175, 50, 250, 175);
        map1.setOpaque(true);
        add(map1);
        map1.addActionListener(this);
        
        map2 = new JButton();
        map2.setBounds(450, 50, 250, 175);
        map2.setOpaque(true);
        add(map2);
        map2.addActionListener(this);
        
        map3 = new JButton();
        map3.setBounds(725, 50, 250, 175);
        map3.setOpaque(true);
        add(map3);
        map3.addActionListener(this);
        
        poop = new ImageIcon("Poop_Emoji.png");
        ImageIcon newSize = new ImageIcon(((poop).getImage().getScaledInstance(140, 120, java.awt.Image.SCALE_SMOOTH)));
        char1.setIcon(newSize);
        
        monkey = new ImageIcon("monkey_1f412.png");
        ImageIcon newSize1 = new ImageIcon(((monkey).getImage().getScaledInstance(130, 120, java.awt.Image.SCALE_SMOOTH)));
        char2.setIcon(newSize1);
        
        santa = new ImageIcon("White_Santa_Claus_Emoji_grande.png");
        santa_final = santa.getImage();
        ImageIcon newSize2 = new ImageIcon(((santa).getImage().getScaledInstance(140, 130, java.awt.Image.SCALE_SMOOTH)));
        char3.setIcon(newSize2);
        
        fantasy = new ImageIcon("fantasy_island.jpg");
        fantasy_final = fantasy.getImage();
        ImageIcon newSize3 = new ImageIcon(((fantasy).getImage().getScaledInstance(250, 175, java.awt.Image.SCALE_SMOOTH)));
        map1.setIcon(newSize3);
        
        dorney = new ImageIcon("dorney.jpg");
        dorney_final = dorney.getImage();
        ImageIcon newSize4 = new ImageIcon(((dorney).getImage().getScaledInstance(250, 175, java.awt.Image.SCALE_SMOOTH)));
        map2.setIcon(newSize4);
        
        hershey = new ImageIcon("hershey.jpg");
        hershey_final = hershey.getImage();
        ImageIcon newSize5 = new ImageIcon(((hershey).getImage().getScaledInstance(250, 175, java.awt.Image.SCALE_SMOOTH)));
        map3.setIcon(newSize5);
        
        selectedchar = santa;
        selectedMap = hershey_final;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Font f1 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Maps:", 50, 135);
        g.drawString("Characters:", 50, 475);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == char1)
        {
            selectedchar = poop;
            c = 1;
        }
        else if (e.getSource() == char2)
        {
            selectedchar = monkey;
            c = 2;
        }
        else if (e.getSource() == char3)
        {
            selectedchar = santa;
            c = 3;
        }
        if (e.getSource() == map1)
        {
            selectedMap = fantasy_final;
            m = 1;
        }
        if (e.getSource() == map2)
        {
            selectedMap = dorney_final;
            m = 2;
        }
        if (e.getSource() == map3)
        {
            selectedMap = hershey_final;
            m = 3;
        }
    }
    
}
