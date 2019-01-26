import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ControlPanel extends JPanel implements ActionListener{
    
    JButton creds, rules, opts, map;
    Credits credPage;
    Instructions rulePage;
    Options optPage;
    MainMap mapPage;
    int m = 0;
    int c = 0;
    int i = 0;
    ImageIcon front;
    Image front1;
    
    ControlPanel()
    {
        super();
        setLayout(null);
        setBackground(Color.red);
        
        creds = new JButton("Credits");
        creds.setOpaque(true);
        creds.addActionListener(this);
        rules = new JButton("Instructions");
        rules.setOpaque(true);
        rules.addActionListener(this);
        opts = new JButton("Options");
        opts.setOpaque(true);
        opts.addActionListener(this);
        map = new JButton("Main Map/Start");
        map.setOpaque(true);
        map.addActionListener(this);
        creds.setBounds(200, 400, 150, 75);
        add(creds);
        rules.setBounds(400, 400, 150, 75);
        add(rules);
        opts.setBounds(600, 400, 150, 75);
        add(opts);
        map.setBounds(800, 400, 150, 75);
        add(map);
        
        credPage = new Credits();
        credPage.back.addActionListener(this);
        rulePage = new Instructions();
        rulePage.back.addActionListener(this);
        optPage = new Options();
        optPage.back.addActionListener(this);
        mapPage = new MainMap(optPage.selectedMap, optPage.selectedchar, optPage, i);
        mapPage.back.addActionListener(this);

        optPage.map1.addActionListener(this);
        optPage.map2.addActionListener(this);
        optPage.map3.addActionListener(this);
        optPage.char1.addActionListener(this);
        optPage.char2.addActionListener(this);
        optPage.char3.addActionListener(this);
        
        front = new ImageIcon("FrontPage.jpg");
        front1 = front.getImage();
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(front1, 0, 0, this);
        Font f1 = new Font("Lucida", Font.BOLD, 30);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Tour Through Amazing Parks", 450, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==creds)
        {
            removeAll();
            add(credPage);
            credPage.setBounds(0, 0, 1200, 1200);
            validate();
            repaint();
        }
        if (e.getSource()==rules)
        {
            removeAll();
            add(rulePage);
            rulePage.setBounds(0, 0, 1200, 1200);
            validate();
            repaint();
        }
        if (e.getSource()==opts)
        {
            removeAll();
            add(optPage);
            optPage.setBounds(0, 0, 1200, 1200);
            validate();
            repaint();
        }
        if (e.getSource()==map)
        {
            removeAll();
            mapPage.tim.start();
            add(mapPage);
            mapPage.setBounds(0, 0, 1200, 1200);
            validate();
            repaint();
        }
        if (e.getSource()==credPage.back)
        {
            removeAll();
            creds.setBounds(200, 400, 150, 75);
            add(creds);
            rules.setBounds(400, 400, 150, 75);
            add(rules);
            opts.setBounds(600, 400, 150, 75);
            add(opts);
            map.setBounds(800, 400, 150, 75);
            add(map);
            validate();
            repaint();
        }
        if (e.getSource() == rulePage.back)
        {
            removeAll();
            creds.setBounds(200, 400, 150, 75);
            add(creds);
            rules.setBounds(400, 400, 150, 75);
            add(rules);
            opts.setBounds(600, 400, 150, 75);
            add(opts);
            map.setBounds(800, 400, 150, 75);
            add(map);
            validate();
            repaint();
        }
        if (e.getSource()==optPage.back)
        {
            removeAll();
            creds.setBounds(200, 400, 150, 75);
            add(creds);
            rules.setBounds(400, 400, 150, 75);
            add(rules);
            opts.setBounds(600, 400, 150, 75);
            add(opts);
            map.setBounds(800, 400, 150, 75);
            add(map);
            validate();
            repaint();
        }
        if (e.getSource() == mapPage.back)
        {
            removeAll();
            creds.setBounds(200, 400, 150, 75);
            add(creds);
            rules.setBounds(400, 400, 150, 75);
            add(rules);
            opts.setBounds(600, 400, 150, 75);
            add(opts);
            map.setBounds(800, 400, 150, 75);
            add(map);
            validate();
            repaint();
        }

    }
    
}
