import java.awt.*;
import javax.swing.*;

public class Credits extends JPanel{
    
    JButton back;
    ImageIcon picOfMe, avatar;
    
    
    public Credits()
    {
        super();
        setLayout(null);
        setBackground(new Color(176,196,222));
        back = new JButton("Back");
        back.setOpaque(true);
        back.setBounds(10, 10, 50, 20);
        add(back);
        
        picOfMe = new ImageIcon("IMG_3032.jpg");
        avatar = new ImageIcon("me.jpg");
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Font f1 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Name: Gaby Ordaz", 450, 120);
        g.drawString("Major(s): IST and SRA", 450, 160);
        g.drawString("Year: Junior", 450, 200);
        g.drawString("This is my avatar! --->", 450, 240);
        g.drawImage(picOfMe.getImage(), 50, 100, this);
        g.drawImage(avatar.getImage(), 800, 100, this);
        
    }
}
