package org.alejandro.ui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FWindow {

    //Set width and height of the frame
    private static final int WIDTH = 435;
    private static final int HEIGHT = 500;

    //Labels and buttons
    public final Label lSeleccion;
    public final Label lChocolate;
    public final Button bChocolate;
    public final Label lPapas;
    public final Label lCola;
    public final Label lCerveza;
    public final Label lDineroM;
    public final Label lDineroInsert;
    public final Label lDineroRest;
    public final Label lLabelDineroRest;
    public final Label tDisplay;
    public final Label tChocolate;
    public final Label tPapas;
    public final Label tCola;
    public final Label tCerveza;
    public final Label tCinco;
    public final Label tDos;
    public final Label tInfo;
    public final Label tBandeja;
    public final Button bPapas;
    public final Button bCola;
    public final Button bCerveza;
    public final Button bReset;
    public final Button bPick;
    public final Button bInsert;
    public final Button bPickRest;
    public TextField tDineroUser;

    public FWindow(int mRest, int uChocolate, int uPapas, int uCola, int uCerveza, int mCinco, int mDos) {


        final ComponentGenerator componentGenerator = new ComponentGenerator();

        /*
         * Create labels
         */

        //For the tittle
        lSeleccion = componentGenerator.generateLabel("Selección de comida", 142, 50, 150, 30);

        //For the goods
        lChocolate = componentGenerator.generateLabel("Chocolates quedan:", 30, 190, 120, 20);
        lPapas = componentGenerator.generateLabel("Papas quedan:", 230, 190, 120, 20);
        lCola = componentGenerator.generateLabel("Cola quedan:", 30, 235, 120, 20);
        lCerveza = componentGenerator.generateLabel("Cerveza quedan:", 230, 235, 120, 20);

        //For the money
        lDineroM = componentGenerator.generateLabel("Dinero maquina", 30, 280, 120, 20);
        lDineroInsert = componentGenerator.generateLabel("0", 180, 330, 30, 20);
        lDineroRest = componentGenerator.generateLabel(String.valueOf(mRest), 240, 330, 30, 20);
        lLabelDineroRest = componentGenerator.generateLabel("Resto", 275, 330, 40, 20);

        // For the counters
        tDisplay = componentGenerator.generateDisplayLabel(30, 150, 360, 30);
        tChocolate = componentGenerator.generateLabel(String.valueOf(uChocolate), 30, 210, 30, 20);
        tPapas = componentGenerator.generateLabel(String.valueOf(uPapas), 230, 210, 30, 20);
        tCola = componentGenerator.generateLabel(String.valueOf(uCola), 30, 255, 30, 20);
        tCerveza = componentGenerator.generateLabel(String.valueOf(uCerveza), 230, 255, 30, 20);
        tCinco = componentGenerator.generateLabel(String.valueOf(mCinco), 30, 300, 20, 20);
        tDos = componentGenerator.generateLabel(String.valueOf(mDos), 65, 300, 20, 20);

        //For the outgoing things
        tInfo = componentGenerator.generateLabel("", 30, 450, 360, 30);
        tBandeja = componentGenerator.generateLabel("Bandeja de salida.", 30, 410, 360, 30);

        //Money introduced by the user
        tDineroUser = new TextField("");
        tDineroUser.setBounds(30, 330, 50, 20);


        /*
         * Create buttons
         */

        //For the goods
        bChocolate = componentGenerator.generateButton("Chocolate", 30, 100, 80, 30);
        bPapas = componentGenerator.generateButton("Papas", 115, 100, 80, 30);
        bCola = componentGenerator.generateButton("Cola", 200, 100, 80, 30);
        bCerveza = componentGenerator.generateButton("Cerveza", 285, 100, 80, 30);

        //Reset button
        bReset = componentGenerator.generateButton("Reset", 280, 370, 80, 30);

        //Pick up button
        bPick = componentGenerator.generateButton("Pick!", 30, 370, 80, 30);

        //Insert coin button
        bInsert = componentGenerator.generateButton("Insert", 90, 330, 80, 30);

        //Pick up rest button
        bPickRest = componentGenerator.generateButton("Pick!", 320, 330, 80, 30);

        /*
         * Adding elements into the frame
         */

        Frame f = new Frame();

        //Labels
        f.add(lSeleccion);
        f.add(tDisplay);
        f.add(lChocolate);
        f.add(lPapas);
        f.add(lCola);
        f.add(lCerveza);
        f.add(tChocolate);
        f.add(tPapas);
        f.add(tCola);
        f.add(tCerveza);
        f.add(lDineroM);
        f.add(tCinco);
        f.add(tDos);
        f.add(tBandeja);
        f.add(tInfo);
        f.add(tDineroUser);
        f.add(lDineroInsert);
        f.add(lDineroRest);
        f.add(lLabelDineroRest);

        //buttons
        f.add(bChocolate);
        f.add(bPapas);
        f.add(bCola);
        f.add(bCerveza);
        f.add(bPick);
        f.add(bReset);
        f.add(bInsert);
        f.add(bPickRest);


        /*
         * Frame properties
         */

        //Setting Frame width and height
        f.setSize(WIDTH, HEIGHT);

        //Setting the title of Frame
        f.setTitle("Dispensador de comida");

        //Adding close function
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        //Setting the layout for the Frame
        f.setLayout(null);

        /* By default frame is not visible so
         * we are setting the visibility to true
         * to make it visible.
         */
        f.setVisible(true);

    }


}
