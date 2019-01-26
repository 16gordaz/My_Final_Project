import java.awt.*;
import javax.swing.*;
public class GameOver extends JPanel{
    
    JLabel theEnd;
    int endScore;
    MainMap ScoreGames;
    ImageIcon fireWorks;
    
    GameOver(int s, MainMap MainMap)
    {
        super();
        setLayout(null);
        setBackground(Color.BLACK);
        endScore = s;
        ScoreGames = MainMap;
        fireWorks = new ImageIcon("Fireworks.jpg");

        
        
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fireWorks.getImage(), 0, 0, this); 
        Font f1 = new Font("Lucida", Font.BOLD, 20);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("CONGRATS! YOU'VE COMPLETED THE GAME!", 370, 220);
        g.drawString("You're final score is: " + ScoreGames.s, 470, 270);
        g.drawString("Your final time was: " + ScoreGames.x, 470, 320);
    }
    
}
