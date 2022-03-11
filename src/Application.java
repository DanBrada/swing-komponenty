import components.ColorChooser;
import components.ComboBox;

import javax.swing.*;

public class Application {
	public static void main(String[] args) {
		var frame = new JFrame("Komponenty");
		var pane = new JTabbedPane(JTabbedPane.RIGHT);
		pane.addTab("JcolorChooser", new ColorChooser().asComponent());
		pane.addTab("JComboBox", new ComboBox().asComponent());


		frame.add(pane);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
	}
}
