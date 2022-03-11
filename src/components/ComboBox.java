package components;

import javax.swing.*;

public class ComboBox extends ComponentTab{

	@Override
	public JComponent asComponent() {
		var comboBox = new JComboBox<String>();
		comboBox.addItem("Test");
		comboBox.addItem("Test2");
		comboBox.addItem("Test3");
		comboBox.addItem("Test4");
		this.baseComponent.add(comboBox);
		return this.baseComponent;
	}
}
