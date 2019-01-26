import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class GameThree extends JPanel implements KeyListener, ActionListener{
    
    Options whatMap;
    JButton Score, back, charButton, gameOver; 
    int x = 500, y = 300, d = 50, s = 0, xSpeed = -1, ySpeed = -2, delay = 8;
    Boolean running = false;
    Timer tim;
    int paddlex = 200, paddleh = 8, paddley = 460,  paddlew = 200; 
    double panelWidth; 
    ImageIcon backGround;
 
    
    GameThree(Options optionP, JButton timer)
    {
        super();
        whatMap = optionP; 
        
        charButton = new JButton(); 
        charButton.setBorderPainted(false); 
        add(charButton); 
                
        setLayout(null);
        Score = new JButton("Score: "+s);
        Score.setOpaque(true);
        Score.setBackground(Color.black);
        Score.setForeground(Color.white);
        Score.setBounds(950, 10, 150, 20);
        add(Score);
        setBackground(Color.WHITE);
        back = new JButton("back");
        back.setOpaque(true);
        back.setBounds(10,10,50,20);
        add(back);
        gameOver = new JButton();
        gameOver.setBounds(450,150, 400,200);
        gameOver.setOpaque(true);
        gameOver.setBackground(Color.BLUE);
        
        x = (int) (Math.random() * 1100); 
        y = (int) (Math.random() * 10); 
                
        tim = new Timer(delay, this);
        
        backGround = new ImageIcon("Game3_background1.jpg");
        
        addKeyListener(this);
        
    }
    
    public void resetCatchMe()
    {
        s = 0;
        Score.setText("Score: "+s);
        x = (int) (Math.random() * 1100); 
        y = (int) (Math.random() * 10); 
        d = 50;
        xSpeed = -1; 
        ySpeed = -2;
        paddlex = 200;
        paddleh = 8;
        paddlew = 200;
        remove(gameOver);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(backGround.getImage(), 0, 0, this);        
        if (whatMap.m == 1)
        {
        //ball
        g.setColor(Color.red);
        g.fillOval(x, y, d, d);
        
        //paddle
        g.setColor(Color.red);
        g.fillRect(paddlex, paddley, paddlew, paddleh);
        }
        if (whatMap.m == 2)
        {
        //ball
        g.setColor(Color.green);
        g.fillOval(x, y, d, d);
        
        //paddle
        g.setColor(Color.green);
        g.fillRect(paddlex, paddley, paddlew, paddleh);
        }
        if (whatMap.m == 3)
        {
        //ball
        g.setColor(Color.yellow);
        g.fillOval(x, y, d, d);
        
        //paddle
        g.setColor(Color.yellow);
        g.fillRect(paddlex, paddley, paddlew, paddleh);
        }
        
        
        Font f1 = new Font("Lucida", Font.BOLD, 14);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Press Spacebar to start the game", 10, 520); 
        
        Font f2 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f2);
        g.setColor(Color.WHITE);
        g.drawString("CATCH ME!", 550, 30); 
        
        charButton.setIcon(whatMap.selectedchar);
        charButton.setBounds(paddlex+50, 470,100,80);
        
        
        
        
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_SPACE)
        {
            running = true;
            tim.start();
        }
        if (e.getKeyCode() == e.VK_RIGHT)
        {
            if (paddlex >= 1000)
            {
                paddlex = 1000; 
            }
            else
            {
                paddlex = paddlex + 20;
            }
        }
        if (e.getKeyCode() == e.VK_LEFT)
        {
            if (paddlex<=0)
            {
                paddlex = 0;
            }
            else
            {
                paddlex = paddlex - 20;
            }
        }
        repaint();
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (running == true)
        {
            if (new Rectangle(x, y, d, d).intersects(new Rectangle(paddlex, paddley, paddlew, paddleh)))
            {
                ySpeed = -(ySpeed);
                s = s + 1;
                Score.setText("Score: "+s);
            }
            x = x + xSpeed;
            y = y + ySpeed;
            if (x<0)
            {
                xSpeed = -(xSpeed);
            }
            if (y<0)
            {
                ySpeed = -(ySpeed);
            }
            if (x>1150)
            {
                xSpeed = -(xSpeed);
            }
            if (y>550)
            {
                tim.stop();
                running = false;
                gameOver.setText("Game Over! Score: "+s);
                add(gameOver);
         
            }   
        }
        repaint();
        if (e.getSource() == back)
        {
            tim.stop();
            running = false;
        }
        
    }
}