package components;

import javax.swing.*;
import java.awt.*;

public abstract class ComponentTab {
	protected final JComponent baseComponent;
	public abstract JComponent asComponent();

	public ComponentTab(){
		var component = new JPanel();
		component.setLayout(new GridBagLayout());
		this.baseComponent = component;
	}


}
