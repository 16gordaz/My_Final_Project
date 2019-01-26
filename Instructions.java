import java.awt.*;
import javax.swing.*;
public class Instructions extends JPanel{
    
    JButton back;
    
    Instructions()
    {
        super();
        setBackground(new Color(176,196,222));
        setLayout(null);
        back = new JButton("Back");
        back.setOpaque(true);
        back.setBounds(10, 10, 50, 20);
        add(back);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Font f1 = new Font("Lucida", Font.BOLD, 15);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("INSTRUCTIONS", 500, 50);
        g.drawString("INTRO", 100, 100);
        g.drawString("   - Proceed to the Options Page to choose desired Map and Character or go", 100, 130);
        g.drawString("     directly to the main map", 100, 160);
        g.drawString("   - Use the arrow keys to move around the map", 100, 190);
        g.drawString("   - When your character reaches a game, you will be taken to your game", 100, 220);
        g.drawString("GAME 1 - TRIVIA", 100, 250);
        g.drawString("   - You will be asked a series of questions that have to do with the chosen park", 100, 280);
        g.drawString("   - Select the correct and receive a point. You will have as many attempts as you need", 100, 310);
        g.drawString("GAME 2 - PUZZLE", 100, 340);
        g.drawString("   - Click on the puzzle piece and move them around using the arrow keys until", 100, 370);
        g.drawString("     they are in the correct location", 100, 400);        
        g.drawString("GAME 3 - CATCH ME", 100, 430); 
        g.drawString("   - Press the space bar to start the game", 100, 460);
        g.drawString("   - Press on the arrow keys to move your paddle and hit your ball", 100, 490);       
    }
    
}
