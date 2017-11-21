import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;

public class UserGui {

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Configuration conf;
    private HashMap<String, Champion> champion_list;
    private HashMap<String, Item> item_list;


    public UserGui(Configuration conf){
        this.conf = conf;
        StaticData static_data = new StaticData(this.conf);
        static_data.getStaticData();
        this.champion_list = static_data.getChampion_list();
        this.item_list = static_data.getItem_list();
        prepareGUI();
    }

    public void setConf(Configuration conf){
        this.conf = conf;
    }

    public static void main(Configuration conf){
        UserGui  userGui = new UserGui(conf);
        userGui.showUserInterface(conf.getApi_region_list(), conf);
    }

    private void prepareGUI(){
        mainFrame = new Frame("League of Legends Item Set Application");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showUserInterface(final HashMap<String, String> api_region_list, Configuration conf){

        headerLabel.setText("Lutfen esya setlerini edinmek istediginiz oyuncunun bilgilerini giriniz.");

        Panel panel = new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(600,600);
        GridBagLayout layout = new GridBagLayout();

        panel.setLayout(layout);
        final Choice regionChoice = new Choice();
        for(String key : api_region_list.keySet()){
            regionChoice.add(key);
        }

        final Choice championChoice = new Choice();
        for(String key : this.champion_list.keySet()) {
            championChoice.add(key);
        }

        final TextField summonerName = new TextField("Sihirdar Adı");
        final Configuration inner_conf = conf;
        Button searchButton = new Button("ARA");

        searchButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                String champion_id = champion_list.get(championChoice.getItem(championChoice.getSelectedIndex())).getId();
                String summoner_name = summonerName.getText();
                headerLabel.setText(champion_id + " " + summoner_name);
                inner_conf.setChampion_id(champion_id);
                inner_conf.setSummoner_name(summoner_name);
                inner_conf.setApi_region_server(api_region_list.get(regionChoice.getItem(regionChoice.getSelectedIndex())));
                System.out.println("--" + Arrays.deepToString(new RequestItemSet(inner_conf).getItemSetArray()));
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(regionChoice, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(championChoice, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(summonerName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(searchButton, gbc);

        controlPanel.add(panel);

        mainFrame.setVisible(true);
    }
}