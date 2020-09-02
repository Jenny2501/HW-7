package ru.geekbrains.j_one.lesson_a.online.TicTocToe;

public class SettingsWindow extends JFrame  {
    private static final int WINDOW_WIDTH = 250;
    private static final int WINDOW_HEIGHT = 270;
    private static final int MIN_WIN_LENGTH = 4;
    private static final int MIN_FIELD_SIZE = 4;
    private static final int MAX_FIELD_SIZE = 20;
    private static final String FIELD_SIZE_PREFIX = "Field size is: ";
    private static final String WIN_LENGTH_PREFIX = "Win length is: ";

    private GameWindow gameWindow;
    private JRadioButton humVSAI;
    private JRadioButton humVShum;
    private JSlider slideWinLen;
    private JSlider slideFieldSize;

    SettingsWindow (gamewindow gamewindow){
        this.gameWindow = gameWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setLocationRelativeTo(gameWindow);
        setResizable(false);
        setTitle("Creating new game");
        setLayout(new GridLayout(9, 1));


        addGameModeControls();
        addFieldControls();
        settings = new SettingsWindow(this);

        btnStart.addActionListener(new ActionalListener()
        @Override
        public voide actionPerformed (ActionEvent e ){
            settings.setVisible(true);

        }
    });
        btnExit.addActionalListener(new ActionalListener ()

    @Override
    public voide actionPerformed (ActionEvent e ){
        System.exit(0);
        btnStartclick();

    }


        private void addGameModeControls() {
            add(new JLable("Choose game mode"));
            humVSAI = new JRadioButton ("Human vs. AI");
            humVShum = new JRadioButton ( "Human vs. Human");
            ButtonGroup gameMode = new ButtonGroup ();
            gameMode.add(humVSAI);
            gameMode.add(humVShum);
            add(humVSAI);
            add(humVShum);

        }

        private void addFieldControls(){
            JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
            JLabel lbWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);
            slideFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
            slideWinLen = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_WIN_LENGTH);
            slideWinLen.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    lbWinLength.setText(WIN_LENGTH_PREFIX + slideWinLen.getValue());
                }
            });
            private  void btnStartClick (){
                int  GameMode;
                if (humVSAI.isselected ()){
                    GameMode = Map. MODE_HVA
                } else if (humVShum. isSelected()){
                    GameMode = Map. MODE_HVH;
                } else{
                    throw new RuntimeExpection ("Unexpected GameMode");
                } int fieldSize = sladeFieldSize.getValue();
                  int  winlen = sladeWinLen.getValue();

                  gamewindow.applySettings(gameMode, fieldSize, winLen);



            slideFieldSize.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    int current = slideFieldSize.getValue();
                    lbFieldSize.setText(FIELD_SIZE_PREFIX + current);
                    slideWinLen.setMaximum(current);
                }
            });

            add(new JLabel("Choose field size"));
            add(lbFieldSize);
            add(slideFieldSize);
            add(new JLabel("Choose win length"));
            add(lbWinLength);
            add(slideWinLen);
        }
    }
}
