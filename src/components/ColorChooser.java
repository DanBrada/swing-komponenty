package components;

import javax.swing.*;

public class ColorChooser extends ComponentTab {

	@Override
	public JComponent asComponent() {
		var jColorChooser = new JColorChooser();
//		jColorChooser
		this.baseComponent.add(jColorChooser);
		return this.baseComponent;
	}
}
