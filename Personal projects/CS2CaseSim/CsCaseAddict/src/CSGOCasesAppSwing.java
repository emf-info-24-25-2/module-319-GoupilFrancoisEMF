import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class CSGOCasesAppSwing {

    private static ArrayList<Case> cases = new ArrayList<>();
    private static ArrayList<Item> inventory = new ArrayList<>();
    private static ArrayList<String> history = new ArrayList<>();
    private static JTextArea resultText;
    private static JComboBox<String> caseComboBox;
    private static JComboBox<String> historyComboBox;
    private static JTextArea historyTextArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CSGOCasesAppSwing::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        initializeCases();

        // Créer la fenêtre principale
        JFrame frame = new JFrame("CS:GO Case Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700); // Taille ajustée pour plus d'espace
        frame.setLayout(new BorderLayout(10, 10));

        // Créer un panneau pour l'en-tête
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("CS:GO Case Simulator", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(34, 34, 34));
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        frame.add(headerPanel, BorderLayout.NORTH);

        // Panneau principal avec grille
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espace autour des éléments

        // Sélection de la caisse
        caseComboBox = new JComboBox<>();
        for (Case c : cases) {
            caseComboBox.addItem(c.getName() + " - Prix: " + c.getPrice() + "$");
        }
        JLabel caseLabel = new JLabel("Sélectionnez une Caisse:");
        caseLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        caseLabel.setForeground(Color.DARK_GRAY);
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(caseLabel, gbc);
        gbc.gridx = 1;
        mainPanel.add(caseComboBox, gbc);

        // Historique des skins
        historyComboBox = new JComboBox<>();
        historyComboBox.addItem("Historique des skins reçus");
        JLabel historyLabel = new JLabel("Historique des Skins:");
        historyLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        historyLabel.setForeground(Color.DARK_GRAY);
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(historyLabel, gbc);
        gbc.gridx = 1;
        mainPanel.add(historyComboBox, gbc);

        // Bouton pour ouvrir la caisse
        JButton openCaseButton = new JButton("Ouvrir la Caisse");
        openCaseButton.setFont(new Font("Arial", Font.BOLD, 16));
        openCaseButton.setBackground(new Color(66, 133, 244));
        openCaseButton.setForeground(Color.WHITE);
        openCaseButton.addActionListener(e -> openSelectedCase());
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(openCaseButton, gbc);

        // Affichage du résultat
        resultText = new JTextArea(5, 50);
        resultText.setFont(new Font("Arial", Font.PLAIN, 14));
        resultText.setEditable(false);
        JScrollPane resultScroll = new JScrollPane(resultText);
        resultScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(resultScroll, gbc);

        // Panneau pour l'historique des skins reçus
        historyTextArea = new JTextArea(10, 50);
        historyTextArea.setEditable(false);
        historyTextArea.setLineWrap(true);
        historyTextArea.setWrapStyleWord(true);
        JScrollPane historyScrollPane = new JScrollPane(historyTextArea);
        historyScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        mainPanel.add(historyScrollPane, gbc);

        // Affichage de l'inventaire avec un bouton
        JButton viewInventoryButton = new JButton("Voir l'inventaire");
        viewInventoryButton.setFont(new Font("Arial", Font.BOLD, 16));
        viewInventoryButton.setBackground(new Color(34, 34, 34));
        viewInventoryButton.setForeground(Color.WHITE);
        viewInventoryButton.addActionListener(e -> showInventory());
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(viewInventoryButton, gbc);

        // Ajouter le panneau principal à la fenêtre
        frame.add(mainPanel, BorderLayout.CENTER);

        // Créer un menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        menu.setForeground(Color.DARK_GRAY);
        JMenuItem viewInventoryMenuItem = new JMenuItem("Voir l'inventaire");
        viewInventoryMenuItem.addActionListener(e -> showInventory());
        menu.add(viewInventoryMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Afficher la fenêtre
        frame.setVisible(true);
    }

    // Initialiser les caisses
    private static void initializeCases() {
        // Exemples de caisses populaires avec tous les skins spécifiques
        Case brokenFangCase = new Case("Operation Broken Fang Case", 150);
        brokenFangCase.addItem(new Item("M4A1-S | Printstream", "Covert", 0.0001));
        brokenFangCase.addItem(new Item("AWP | Gungnir", "Covert", 0.0002));
        brokenFangCase.addItem(new Item("AK-47 | Ice Cold", "Classified", 0.001));
        brokenFangCase.addItem(new Item("USP-S | Flashback", "Classified", 0.0015));
        brokenFangCase.addItem(new Item("P90 | Death by Kitty", "Restricted", 0.005));
        brokenFangCase.addItem(new Item("MP5-SD | Phosphor", "Restricted", 0.006));
        brokenFangCase.addItem(new Item("MAG-7 | Jackpot", "Mil-Spec", 0.008));
        brokenFangCase.addItem(new Item("R8 Revolver | Skull Crusher", "Mil-Spec", 0.015));
        brokenFangCase.addItem(new Item("5.7 | Monkey Business", "Mil-Spec", 0.02));
        cases.add(brokenFangCase);

        // Ajouter d'autres caisses (hydra, spectrum, etc.)
        Case hydraCase = new Case("Hydra Case", 120);
        hydraCase.addItem(new Item("M4A4 | Bullet Rain", "Covert", 0.0002));
        hydraCase.addItem(new Item("AWP | Pit Viper", "Covert", 0.0003));
        hydraCase.addItem(new Item("AK-47 | Frontside Misty", "Classified", 0.0008));
        hydraCase.addItem(new Item("M4A1-S | Hot Rod", "Classified", 0.001));
        hydraCase.addItem(new Item("CZ75-Auto | Red Astor", "Restricted", 0.006));
        hydraCase.addItem(new Item("MP7 | Urban Hazard", "Restricted", 0.007));
        hydraCase.addItem(new Item("UMP-45 | Momentum", "Mil-Spec", 0.01));
        hydraCase.addItem(new Item("M249 | Exoskeleton", "Mil-Spec", 0.012));
        hydraCase.addItem(new Item("Galil AR | Chatterbox", "Mil-Spec", 0.015));
        cases.add(hydraCase);
    }

    // Ouvrir la caisse sélectionnée et ajouter l'item reçu
    private static void openSelectedCase() {
        String selectedCaseName = (String) caseComboBox.getSelectedItem();
        if (selectedCaseName != null) {
            String caseName = selectedCaseName.split(" -")[0];
            Case selectedCase = findCaseByName(caseName);

            if (selectedCase != null) {
                Item item = selectedCase.openCase();

                // Si la caisse est vide, donner le skin avec la valeur la plus basse
                if (item == null) {
                    // Trouver l'item avec le taux de drop le plus bas
                    item = selectedCase.getItems().stream()
                            .min((i1, i2) -> Double.compare(i1.getDropRate(), i2.getDropRate())) // Ici on cherche celui
                                                                                                 // avec la plus basse
                                                                                                 // valeur
                            .orElse(null);
                }

                // Ajouter l'item à l'inventaire et à l'historique
                if (item != null) {
                    inventory.add(item);
                    history.add("Vous avez ouvert la caisse " + caseName + " et reçu le skin: " + item.getName());
                    updateHistoryTextArea();
                    resultText.setText("Vous avez reçu le skin: " + item.getName() + " (" + item.getRarity() + ")");
                }
            } else {
                resultText.setText("Caisse non trouvée.");
            }
        }
    }

    // Trouver une caisse par son nom
    private static Case findCaseByName(String name) {
        for (Case c : cases) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    // Mettre à jour l'affichage de l'historique
    private static void updateHistoryTextArea() {
        historyTextArea.setText("");
        for (String item : history) {
            historyTextArea.append(item + "\n");
        }
    }

    // Afficher l'inventaire
    private static void showInventory() {
        StringBuilder inventoryText = new StringBuilder();
        for (Item item : inventory) {
            inventoryText.append(item.getName()).append(" (").append(item.getRarity()).append(")\n");
        }
        JOptionPane.showMessageDialog(null, inventoryText.toString(), "Votre Inventaire",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

class Case {
    private String name;
    private double price;
    private ArrayList<Item> items = new ArrayList<>();

    public Case(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item openCase() {
        Random rand = new Random();
        double roll = rand.nextDouble();
        double cumulativeProbability = 0.0;
        for (Item item : items) {
            cumulativeProbability += item.getDropRate();
            if (roll <= cumulativeProbability) {
                return item;
            }
        }
        return null; // Aucun item trouvé, la caisse est vide
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}

class Item {
    private String name;
    private String rarity;
    private double dropRate;

    public Item(String name, String rarity, double dropRate) {
        this.name = name;
        this.rarity = rarity;
        this.dropRate = dropRate;
    }

    public String getName() {
        return name;
    }

    public String getRarity() {
        return rarity;
    }

    public double getDropRate() {
        return dropRate;
    }
}
