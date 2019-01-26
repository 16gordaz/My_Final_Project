import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GameOne extends JPanel implements ActionListener{
    JRadioButton a1, a2, a3, a4, a5, a6, a7, a8, a9;
    JLabel question;
    ButtonGroup group1, group2, group3;
    JButton back;
    JLabel header, tf1;
    Options whatMap;
    JButton time, Score;
    int s = 0;
    int t;
    Timer tim2;
    JButton timer;
    
    GameOne(Options optionP, JButton timer, int x, Timer tim)
    {
        super();
        whatMap = optionP;
        Score = new JButton("Score: ");
        Score.setOpaque(true);
        Score.setBackground(Color.black);
        Score.setForeground(Color.white);
        Score.setBounds(1040, 10, 150, 20);
        add(Score);
        
        
        
        timer = new JButton("Time: ");
        timer.setOpaque(true);
        timer.setBackground(Color.BLACK);
        timer.setForeground(Color.white);
        timer.setBounds(1040, 10, 150, 20);
        add(timer);
        
        setBackground(new Color(153, 153, 204));
        setLayout(null);
        header = new JLabel("This is Game 1");
        header.setBounds(10, 10, 100, 50);
        back = new JButton("back");
        back.setOpaque(true);
        back.setBounds(10, 10, 50, 20);
        add(back);
        
        question = new JLabel("How many rollercoasters does this amusement park have?");
        question.setOpaque(true);
        question.setBackground(new Color(153,153,204));
        question.setFont(new Font("Lucida", Font.PLAIN, 16));
        question.setBounds(415, 75, 600, 50);
        
        tf1 = new JLabel();
        tf1.setBounds(415, 450, 370, 100);
        add(tf1);
        
        a1 = new JRadioButton("3");
        a1.setBounds(415, 150, 370, 50);
        a2 = new JRadioButton("11");
        a2.setBounds(415, 200, 370, 50);
        a3 = new JRadioButton("7");
        a3.setBounds(415, 250, 370, 50);
        
        a4 = new JRadioButton("1907");
        a4.setBounds(415, 150, 370, 50);
        a5 = new JRadioButton("1870");
        a5.setBounds(415, 200, 370, 50);
        a6 = new JRadioButton("1961");
        a6.setBounds(415, 250, 370, 50);
        
        a7 = new JRadioButton("Kingda Ka");
        a7.setBounds(415, 150, 370, 50);
        a8 = new JRadioButton("Tower of Terror II");
        a8.setBounds(415, 200, 370, 50);
        a9 = new JRadioButton("SUPERMAN: Escape from Krypton");
        a9.setBounds(415, 250, 370, 50);
        
        group1 = new ButtonGroup();
        group2 = new ButtonGroup();
        group3 = new ButtonGroup();
        
        group1.add(a1);
        group1.add(a2);
        group1.add(a3);
        group2.add(a4);
        group2.add(a5);
        group2.add(a6);
        group3.add(a7);
        group3.add(a8);
        group3.add(a9);
            
        add(question);
        add(a1);
        add(a2);
        add(a3);
        add(tf1);
        
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        
        
    }
    public void resetOptions()
    {
        s = 0;
        Score.setText("Score: " + s);
        question.setText("How many rollercoasters does this amusement park have?");
        remove(a4);
        remove(a5);
        remove(a6);
        remove(a7);
        remove(a8);
        remove(a9);
        group1.clearSelection();
        group2.clearSelection();
        group3.clearSelection();
        add(a1);
        add(a2);
        add(a3);
        tf1.setText(" ");
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Font f2 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f2);
        g.setColor(Color.WHITE);
        g.drawString("TRIVIA", 550, 30); 
        Font f1 = new Font("Lucida", Font.BOLD, 14);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Choose an answer", 10, 520); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if (e.getSource() == tim2)   
        {
            t = t + 1;
            timer.setText("Time: " + t);
            repaint();
        }
        
        if (whatMap.m == 1)
        {
            if (obj == a1)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("When did this park first open its doors?");
                remove(a1);
                remove(a2);
                remove(a3);
                add(a4);
                add(a5);
                add(a6);
            }
            if (obj == a6)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("What is the tallest rollercoaster in the world?");
                remove(a4);
                remove(a5);
                remove(a6);
                add(a7);
                add(a8);
                add(a9);
            }
            if (obj == a7)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
            }
            if (obj == a2 || obj == a3 || obj == a4 || obj == a5 || obj == a8 || obj ==a9)
            {
                tf1.setText("Wrong! Try Again!");
            }
        }
        if (whatMap.m == 2)
        {
            if (obj == a3)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("When did this park first open its doors?");
                remove(a1);
                remove(a2);
                remove(a3);
                add(a4);
                add(a5);
                add(a6);
            }
            if (obj == a5)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("What is the tallest rollercoaster in the world?");
                remove(a4);
                remove(a5);
                remove(a6);
                add(a7);
                add(a8);
                add(a9);
            }
            if (obj == a7)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
            }
            if (obj == a1 || obj == a2 || obj == a4 || obj == a6 || obj == a8 || obj == a9)
            {
                tf1.setText("Wrong! Try Again!");
            }
                
        }
        if (whatMap.m == 3)
        {
            if (obj == a2)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("When did this park first open its doors?");
                remove(a1);
                remove(a2);
                remove(a3);
                add(a4);
                add(a5);
                add(a6);
            }
            if (obj == a4)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
                question.setText("What is the tallest rollercoaster in the world?");
                remove(a4);
                remove(a5);
                remove(a6);
                add(a7);
                add(a8);
                add(a9);
            }
            if (obj == a7)
            {
                tf1.setText("You are correct!");
                s = s+1;
                Score.setText("Score: " + s);
            }
            if(obj == a1 || obj == a3 || obj == a5 || obj == a6 || obj == a8 || obj == a9)
            {
                tf1.setText("Wrong! Try Again!");
            }
                
        }
    }
}
