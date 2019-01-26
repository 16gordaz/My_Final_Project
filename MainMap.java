import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class MainMap extends JPanel implements ActionListener, KeyListener{
    JButton game1, game2, game3, back;
    GameOne g1Panel;
    GameTwo g2Panel;
    GameThree g3Panel;
    GameOver gameOver;
    Timer tim;
    int s = 0;
    int xx = 10;
    int yy = 30;
    JButton timer, charButton, score = new JButton("Score: 0");
    Rectangle butRect;
    Options optPage;
    Image setMap;
    ImageIcon setChar;
    Options optionP;
    Rectangle r1, r2, r3, r4;
    int x;
    MainMap(Image selectedMap, ImageIcon selectedchar, Options optPage, int i)
    {
        super();
        
        setMap = selectedMap;
      
        x = i;
        
        optionP = optPage;
        charButton = new JButton();
        butRect = new Rectangle(xx, yy, 80, 80);
        charButton.setIcon(optionP.selectedchar);
        charButton.setBounds(butRect);
        charButton.setBorderPainted(false);
        setFocusable(true);
        addKeyListener(this);
        add(charButton);
        
        
        setLayout(null);
        setBackground(Color.CYAN);
        back = new JButton("Back");
        back.setOpaque(true);
        game1 = new JButton("Game 1");
        game2 = new JButton("Game 2");
        game3 = new JButton("Game 3");
        back.setBounds(15, 10, 50, 20);
        add(back);
        game1.setBounds(630, 410, 75, 30);
        add(game1);
        game1.addActionListener(this);
        game1.setOpaque(true);
        game1.setBackground(Color.black);
        game1.setForeground(Color.WHITE);
        game2.setBounds(520, 70, 75, 30); 
        add(game2);
        game2.addActionListener(this);
        game2.setOpaque(true);
        game2.setBackground(Color.black);
        game2.setForeground(Color.WHITE);
        game3.setBounds(1060, 200, 75, 30); 
        add(game3);
        game3.addActionListener(this);
        game3.setOpaque(true);
        game3.setBackground(Color.black);
        game3.setForeground(Color.WHITE);
        
        tim = new Timer(1000, this);
        timer = new JButton("Time CRG: ");
        timer.setOpaque(true);
        timer.setBackground(Color.BLACK);
        timer.setForeground(Color.white);
        timer.setBounds(1040, 10, 150, 20);
        score.setOpaque(true);
        score.setBackground(Color.BLACK);
        score.setForeground(Color.white);
        score.setBounds(1040, 30, 150, 20);
        
        g1Panel = new GameOne(optionP, timer, x, tim);
        g1Panel.back.addActionListener(this);
        g2Panel = new GameTwo(optionP, timer);
        g2Panel.back.addActionListener(this);
        g3Panel = new GameThree(optionP, timer);
        g3Panel.back.addActionListener(this);
        gameOver = new GameOver(s, this);
        
        
        add(timer);
        add(score);
        
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (optionP.m == 1)
        {
            g.drawImage(optionP.fantasy_final, 0, 0, this);
        }
        else if (optionP.m == 2)
        {
            g.drawImage(optionP.dorney_final, 0, 0, this);
        }
        else
        {
            g.drawImage(optionP.hershey_final, 0, 0, this);
        }
        if (optionP.c == 1)
        {
            charButton.setIcon(optionP.selectedchar);
        }
        else if (optionP.c == 2)
        {
            charButton.setIcon(optionP.selectedchar);
        }
        else
        {
            charButton.setIcon(optionP.selectedchar);
        }
        requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == tim)   
        {
            x = x + 1;
            timer.setText("Time: " + x);
            repaint();
        }
        if (e.getSource()==game1)
        {
            removeAll();
            add(g1Panel);
            g1Panel.setBounds(0, 0, 1200, 1200);
            if (game1.getBackground() == Color.red)
            {
                g1Panel.resetOptions();
            }
            validate();
            repaint();
        }
        if (e.getSource()==game2)
        {
            removeAll();
            add(g2Panel);
            g2Panel.setBounds(0, 0, 1200, 1200);
            if (game2.getBackground() == Color.red)
            {
                g2Panel.resetPuzzle();
            }
            g2Panel.setPuzzle();
            validate();
            repaint();
        }
        if (e.getSource()==game3)
        {
            removeAll();
            add(g3Panel);
            g3Panel.setBounds(0, 0, 1200, 1200);
            if (game3.getBackground() == Color.red)
            {
                g3Panel.resetCatchMe();
            }
            validate();
            repaint();
        }
        if (e.getSource()==g1Panel.back)
        {
            removeAll();
            add(back);
            add(score);
            game1.setBackground(Color.red);
            add(game1);
            add(game2);
            add(game3);
            add(timer);
            add(charButton);
            s = s + g1Panel.s;
            score.setText("Score: " + s);
            xx = 10;
            yy = 30;
            butRect = new Rectangle(xx, yy, 80, 80);
            charButton.setBounds(butRect);
            validate();
            repaint();
        }
        if (e.getSource()==g2Panel.back)
        {
            removeAll();
            add(score);
            add(back);
            add(game1);
            add(game2);
            game2.setBackground(Color.red);
            add(game3);
            add(timer);
            add(charButton);
            s = s + g2Panel.s;
            score.setText("Score: " + s);
            xx = 10;
            yy = 30;
            butRect = new Rectangle(xx, yy, 80, 80);
            charButton.setBounds(butRect);
            validate();
            repaint();
        }
        if (e.getSource()==g3Panel.back)
        {
            removeAll();
            add(score);
            add(back);
            add(game1);
            add(game2);
            add(game3);
            add(timer);
            add(charButton);
            s = s + g3Panel.s;
            score.setText("Score: " + s);
            xx = 10;
            yy = 30;
            butRect = new Rectangle(xx, yy, 80, 80);
            charButton.setBounds(butRect);
            game3.setBackground(Color.red);
            validate();
            repaint();
        }
        if ((game1.getBackground() == Color.red) && (game2.getBackground() == Color.red) && (game3.getBackground() == Color.red))
        {
            removeAll();
            tim.stop();
            add(gameOver);
            gameOver.setBounds(0,0,1200,1200);
            validate();
            repaint();
        }
        

        
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int kk = e.getKeyCode();
        r1 = game1.getBounds();
        r2 = game2.getBounds();
        r3 = game3.getBounds();
        r4 = charButton.getBounds();
        if (kk == e.VK_LEFT)
        {
            xx = xx - 10;
        }
        if (kk == e.VK_RIGHT)
        {
            xx = xx + 10;
        }
        if (kk == e.VK_UP)
        {
            yy = yy - 10;
        }
        if (kk == e.VK_DOWN)
        {
            yy = yy + 10;
        }
        butRect = new Rectangle(xx, yy, 80, 80);
        charButton.setBounds(butRect);
        if (r4.intersects(r1))
        {
            removeAll();
            add(g1Panel);
            g1Panel.setBounds(0, 0, 1200, 1200);
            if (game1.getBackground() == Color.red)
            {
                g1Panel.resetOptions();
            }
            validate();
            repaint();
        }
        if (r4.intersects(r2))
        {
            removeAll();
            add(g2Panel);
            g2Panel.setBounds(0, 0, 1200, 1200);
            if (game2.getBackground() == Color.red)
            {
                g2Panel.resetPuzzle();
            }
            g2Panel.setPuzzle();
            validate();
            repaint();
        }
        if(r4.intersects(r3))
        {
            removeAll();
            add(g3Panel);
            g3Panel.setBounds(0, 0, 1200, 1200);
            if (game3.getBackground() == Color.red)
            {
                g3Panel.resetCatchMe();
            }
            validate();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    
}
