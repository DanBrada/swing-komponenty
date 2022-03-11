# Swing Komponenty

Prezentace jednotlivých komponentů ve swingu


## Seznam komponentů
* [JColorChooser](./src/components/ColorChooser.java)
* [JComboBox](./src/components/ComboBox.java)


## Přispívání
1) Vytvořte si třídu pro vaší komponentu (třeba jbutton) v packagi components
```java
    package components;
   
    public class Button{
    //...
    }
```
2) Poděďťe z třídy [ComponentTab](./src/components/ComponentTab.java) a naimplementujte požadované metody
```java
    package components;
   
     public class Button extends ComponentTab{
     
        @Override
        public JComponent asComponent() {
            //...
        }
    }
   ```
3) Vytvořte Komponentu a přidejte jí do základní komponenty (poděděné)
```java
    package components;    

    public class Button extends ComponentTab{
            @Override
            public JComponent asComponent() {
                var button = new JButton("Ahoj");
                this.baseComponent.add(button);
                return this.baseComponent;
            }
    }
```
4) Přidejte jí jako záložku v aplikaci
```java
//src/Application.java
import javax.swing.*;

public class Application {
	public static void main(String[] args) {
		var frame = new JFrame("Komponenty");
		var pane = new JTabbedPane(JTabbedPane.RIGHT);
		pane.addTab("JcolorChooser", new ColorChooser().asComponent());
		pane.addTab("JComboBox", new ComboBox().asComponent());
		pane.addTab("JButton", new Button().asComponent()); //<-tady


		frame.add(pane);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
	}
}
```