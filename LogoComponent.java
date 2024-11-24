import javax.swing.*;
import java.awt.*;

public class LogoComponent extends JLabel {
    public LogoComponent() {
        // Load and scale the image
        ImageIcon logoIcon = new ImageIcon(new ImageIcon(ClassLoader.getSystemResource("Assets/Borcelle.png"))
                .getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));

        // Set the image icon on the label
        setIcon(logoIcon);

        // Optional: Adjust size and other properties if needed
        setBounds(400, 60, 250, 250); // Adjust this based on your layout needs
    }

}
