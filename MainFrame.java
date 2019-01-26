import java.awt.*;
import javax.swing.*;
public class MainFrame extends JFrame{
    
    ControlPanel p1;
    
    MainFrame()
    {
        super("Final Project");
        
        p1 = new ControlPanel();
        setupUIManager();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p1, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200,600);
        setVisible(true);
    }

    private void setupUIManager() {
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
