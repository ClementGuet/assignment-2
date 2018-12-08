package ee402;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel pan;
	private JLabel title;
	private JButton Client1On;
	private JButton Client1Off;
	private JButton Client2On;
	private JButton Client2Off;
	private JButton Client3On;
	private JButton Client3Off;
	private JButton Client4On;
	private JButton Client4Off;
	private JButton Client5On;
	private JButton Client5Off;
	private JButton MeanTemp;
	
	public  GUI(){
		this.setTitle("Temperatures");
		this.setSize(800, 640);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//Initiating our panel and our layout
	pan = new JPanel();
	pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS));
	pan.setBackground(Color.lightGray);
	
	title = new JLabel("Temperatures");
	Client1On = new JButton("Client 1 ON");
	Client1Off = new JButton("Client 1 OFF");
	Client2On = new JButton("Client 2 ON");
	Client2Off = new JButton("Client 2 OFF");
	Client3On = new JButton("Client 3 ON");
	Client3Off = new JButton("Client 3 OFF");
	Client4On = new JButton("Client 4 ON");
	Client4Off = new JButton("Client 4 OFF");
	Client5On = new JButton("Client 5 ON");
	Client5Off = new JButton("Client 5 OFF");
	MeanTemp = new JButton("Average temperature");
	
	Client1On.setPreferredSize(new Dimension(100, 50));
	Client1On.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client1Off.setPreferredSize(new Dimension(500, 100));
	Client1Off.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client2On.setPreferredSize(new Dimension(500, 100));
	Client2On.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client2Off.setPreferredSize(new Dimension(500, 100));
	Client2Off.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client3On.setPreferredSize(new Dimension(500, 100));
	Client3On.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client3Off.setPreferredSize(new Dimension(500, 100));
	Client3Off.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client4On.setPreferredSize(new Dimension(500, 100));
	Client4On.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client4Off.setPreferredSize(new Dimension(500, 100));
	Client4Off.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client5On.setPreferredSize(new Dimension(500, 100));
	Client5On.setAlignmentX(Component.RIGHT_ALIGNMENT);
	Client5Off.setPreferredSize(new Dimension(500, 100));
	Client5Off.setAlignmentX(Component.RIGHT_ALIGNMENT);
	MeanTemp.setPreferredSize(new Dimension(500, 100));
	MeanTemp.setAlignmentX(Component.RIGHT_ALIGNMENT);
	
	pan.add(title);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client1On);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client1Off);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client2On);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client2Off);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client3On);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client3Off);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client4On);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client4Off);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client5On);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(Client5Off);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	pan.add(MeanTemp);
	pan.add(Box.createRigidArea(new Dimension(50, 50)));
	
	pan.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

	this.setContentPane(pan);
	this.setVisible(true);

}
}


