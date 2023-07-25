import com.google.gson.Gson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckoutViewController {

    private JTable itemsTable;
    private JPanel mainPanel;
    private JButton addItemButton;
    private JButton finishAndPayButton;
    private JLabel totalLabel;
    private JLabel productIDLabel;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel quantityLabel;
    private JLabel costLabel;

    public Client client;

    public CheckoutViewController(Client client) {
        this.client = client;
    }

    public JPanel getMainPanel() { return mainPanel; }
}
