import java.awt.*;
import javax.swing.*;

public class LoginPage extends JFrame {

    public LoginPage() {
        super("Ekran logowania");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        setLayout(new BorderLayout(10, 10));

        JPanel panelGlowny = new JPanel();
        panelGlowny.setLayout(new GridLayout(2, 2, 10, 10));


        panelGlowny.add(new JLabel("Użytkownik:"));
        JTextField poleUzytkownika = new JTextField(15);
        panelGlowny.add(poleUzytkownika);

        panelGlowny.add(new JLabel("Hasło:"));
        JPasswordField poleHasla = new JPasswordField(15);
        panelGlowny.add(poleHasla);


        JPanel panelPrzyciski = new JPanel();
        panelPrzyciski.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton przyciskZaloguj = new JButton("Zaloguj");
        JButton przyciskAnuluj = new JButton("Anuluj");

        panelPrzyciski.add(przyciskZaloguj);
        panelPrzyciski.add(przyciskAnuluj);


        add(panelGlowny, BorderLayout.CENTER);
        add(panelPrzyciski, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginPage());
    }
}
