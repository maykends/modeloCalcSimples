import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class Calc extends JFrame{
	
	public Calc() throws Exception{
		super("Calculadora");
		
		//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 400);
		setLocation(400, 200);
		
		setLayout(new BorderLayout());
		
		TextPainel textPainel = new TextPainel();
		add(BorderLayout.NORTH, textPainel);
		
		JPanel digitaPainel = new JPanel();
		digitaPainel.setLayout(new BorderLayout());
		digitaPainel.add(BorderLayout.CENTER, new NumbersPanel(textPainel.getTxtNumber()));
		digitaPainel.add(BorderLayout.EAST, new OperationsPainel(textPainel.getTxtNumber()));
		
		add(BorderLayout.CENTER, digitaPainel);
		
		setVisible(true);
	}

	public static void main(String[] args) throws Exception{
		new Calc();
	}
}
