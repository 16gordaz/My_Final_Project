import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class GameTwo extends JPanel implements ActionListener, KeyListener{
    
    JButton back, p1, p2, p3, p4, p5, p6;
    JLabel header, message;
    Options whatMap;
    int piece, setx, sety, setw, seth, s = 0,cp1f= 0, cp2f = 0, cp3f = 0, cp4f = 0, cp5f =0, cp6f = 0;
    ImageIcon white;
    Rectangle rect;
    JButton time, Score;
    
   
    GameTwo(Options optionP, JButton timer)
    {
        super();
        message = new JLabel();
        message.setBounds(200, 10, 600, 20);
        Score = new JButton("Score: ");
        Score.setOpaque(true);
        Score.setBackground(Color.black);
        Score.setForeground(Color.white);
        Score.setBounds(1040, 10, 150, 20);
        add(Score);
        whatMap = optionP;
        setBackground(Color.GRAY);
        setLayout(null);
        back = new JButton("Back");
        back.setOpaque(true);
        back.setBounds(10,10,50,20);
        add(back);
        add(message);
        
        p1 = new JButton();
        p1.setOpaque(true);
        p1.setBackground(Color.white);
        p1.addActionListener(this);
        p2 = new JButton();
        p2.setOpaque(true);
        p2.setBackground(Color.blue);
        p2.addActionListener(this);
        p3 = new JButton();
        p3.setOpaque(true);
        p3.setBackground(Color.red);
        p3.addActionListener(this);
        p4 = new JButton();
        p4.setOpaque(true);
        p4.setBackground(Color.yellow);
        p4.addActionListener(this);
        p5 = new JButton();
        p5.setOpaque(true);
        p5.setBackground(Color.green);
        p5.addActionListener(this);
        p6 = new JButton();
        p6.setOpaque(true);
        p6.setBackground(Color.pink);
        p6.addActionListener(this);
        
        
        p1.setBounds(800, 200, 332, 225);
        p2.setBounds(850, 350, 332, 223);
        p3.setBounds(300, 340, 278, 223);
        p4.setBounds(50, 75, 278, 225);
        p5.setBounds(600, 45, 365, 223);
        p6.setBounds(750, 100, 365, 225);
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        
        addKeyListener(this);
        setFocusable(true);
        
        white = new ImageIcon("white.jpg");
        p1.setIcon(white);
    }
    public void resetPuzzle() 
    {
        s = 0;
        Score.setText("Score: " + s);
        p1.setBounds(800, 200, 332, 225);
        p2.setBounds(850, 350, 332, 223);
        p3.setBounds(300, 340, 278, 223);
        p4.setBounds(50, 75, 278, 225);
        p5.setBounds(600, 45, 365, 223);
        p6.setBounds(750, 100, 365, 225);
        cp1f= 0; 
        cp2f = 0; 
        cp3f = 0; 
        cp4f = 0; 
        cp5f =0; 
        cp6f = 0;
    }

    
    public void setPuzzle()
    {
        if (whatMap.m == 1)
        {
            p1.setIcon(new ImageIcon("FantasyPiece1.jpg"));
            p2.setIcon(new ImageIcon("FantasyPiece2.jpg"));
            p3.setIcon(new ImageIcon("FantasyPiece3.jpg"));
            p4.setIcon(new ImageIcon("FantasyPiece4.jpg"));
            p5.setIcon(new ImageIcon("FantasyPiece5.jpg"));
            p6.setIcon(new ImageIcon("FantasyPiece6.jpg"));
        }
        if (whatMap.m == 2)
        {
            p1.setIcon(new ImageIcon("DorneyPiece1.jpg"));
            p2.setIcon(new ImageIcon("DorneyPiece2.jpg"));
            p3.setIcon(new ImageIcon("DorneyPiece3.jpg"));
            p4.setIcon(new ImageIcon("DorneyPiece4.jpg"));
            p5.setIcon(new ImageIcon("DorneyPiece5.jpg"));
            p6.setIcon(new ImageIcon("DorneyPiece6.jpg"));
        }
        if (whatMap.m == 3)
        {
            p1.setIcon(new ImageIcon("HersheyPiece1.jpg"));
            p2.setIcon(new ImageIcon("HersheyPiece2.jpg"));
            p3.setIcon(new ImageIcon("HersheyPiece3.jpg"));
            p4.setIcon(new ImageIcon("HersheyPiece4.jpg"));
            p5.setIcon(new ImageIcon("HersheyPiece5.jpg"));
            p6.setIcon(new ImageIcon("HersheyPiece6.jpg"));
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(white.getImage(), 100, 75, 970, 448, this);
        Font f1 = new Font("Lucida", Font.BOLD, 14);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Press the arrow keys to move the pieces", 10, 550);
        Font f2 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f2);
        g.setColor(Color.WHITE);
        g.drawString("PUZZLE", 550, 30);
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int kk = e.getKeyCode();
        if (kk == e.VK_RIGHT)
        {
            setx = setx + 5;
        }
        if (kk == e.VK_LEFT)
        {
            setx = setx - 5;
        }
        if (kk == e.VK_UP)
        {
            sety = sety - 5;
        }
        if (kk == e.VK_DOWN)
        {
            sety = sety + 5;
        }
        rect = new Rectangle(setx, sety, setw, seth);
        if (piece == 1)
        {
            p1.setBounds(rect);
        }
        if (piece == 2)
        {
            p2.setBounds(rect);
        }
        if (piece == 3)
        {
            p3.setBounds(rect);
        }
        if (piece == 4)
        {
            p4.setBounds(rect);
        }
        if (piece == 5)
        {
            p5.setBounds(rect);
        }
        if (piece == 6)
        {
            p6.setBounds(rect);
        }
        if ((p1.getX() >= 97 && p1.getX() <= 103 && p1.getY() >= 72 && p1.getY() <= 78) && (cp1f == 0))
        {
           s = s + 1;
           cp1f = 1;
        }
        if ((p2.getX() >= 97 && p2.getX() <= 103 && p2.getY() >= 297 && p2.getY() <= 303) && (cp2f ==0))
        {
           s = s + 1;
           cp2f = 1;
        } 
            
        if ((p3.getX() >= 427 && p3.getX() <= 433 && p3.getY() >= 72 && p3.getY() <= 78) && (cp3f ==0))
        {
           s = s + 1;
           cp3f = 1;
        } 
            
        if ((p4.getX() >= 427 && p4.getX() <= 433 && p4.getY() >= 297 && p4.getY() <= 303) && (cp4f ==0))
        {
           s = s + 1;
           cp4f = 1;
        }         
        
        if ((p5.getX() >= 702 && p5.getX() <= 708 && p5.getY() >= 72 && p5.getY() <= 78) && (cp5f ==0))
        {
           s = s + 1;
           cp5f = 1;
        } 
        
        if ((p6.getX() >= 702 && p6.getX() <= 708 && p6.getY() >= 297 && p6.getY() <= 303) && (cp6f ==0))
        {
           s = s + 1;
           cp6f = 1;
        }
        Score.setText("Score; " + s);
        
        if ((p1.getX() >= 97 && p1.getX() <= 103 && p1.getY() >= 72 && p1.getY() <= 78) && 
           (p2.getX() >= 97 && p2.getX() <= 103 && p2.getY() >= 297 && p2.getY() <= 303) &&
           (p3.getX() >= 427 && p3.getX() <= 433 && p3.getY() >= 72 && p3.getY() <= 78) &&
           (p4.getX() >= 427 && p4.getX() <= 433 && p4.getY() >= 297 && p4.getY() <= 303) &&
           (p5.getX() >= 702 && p5.getX() <= 708 && p5.getY() >= 72 && p5.getY() <= 78) &&
           (p6.getX() >= 702 && p6.getX() <= 708 && p6.getY() >= 297 && p6.getY() <= 303))
        {
            message.setText("Congrats! You have completed the puzzle!");
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == p1)
        {
            piece = 1;
            setx = p1.getX();
            sety = p1.getY();
            setw = p1.getWidth();
            seth = p1.getHeight();
            
        }
        if (e.getSource() == p2)
        {
            piece = 2;
            setx = p2.getX();
            sety = p2.getY();
            setw = p2.getWidth();
            seth = p2.getHeight();
            
        }
        if (e.getSource() == p3)
        {
            piece = 3;
            setx = p3.getX();
            sety = p3.getY();
            setw = p3.getWidth();
            seth = p3.getHeight();
            
        }
        if (e.getSource() == p4)
        {
            piece = 4;
            setx = p4.getX();
            sety = p4.getY();
            setw = p4.getWidth();
            seth = p4.getHeight();
            
        }
        if (e.getSource() == p5)
        {
            piece = 5;
            setx = p5.getX();
            sety = p5.getY();
            setw = p5.getWidth();
            seth = p5.getHeight();
            
        }
        if (e.getSource() == p6)
        {
            piece = 6;
            setx = p6.getX();
            sety = p6.getY();
            setw = p6.getWidth();
            seth = p6.getHeight();
            
        }
        
    }
    
    
    
    
}
