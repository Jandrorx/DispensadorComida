package org.alejandro.ui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FWindow {

    //Set width and height of the frame
    private static final int WIDTH = 435;
    private static final int HEIGHT = 500;

    //Labels and buttons
    public final Label LABEL_SELECCION;
    public final Label LABEL_CHOCOLATE;
    public final Button BOTON_CHOCOLATE;
    public final Label LABEL_PAPAS;
    public final Label LABEL_COLA;
    public final Label LABEL_CERVEZA;
    public final Label LABEL_DINERO_MAQUINA;
    public final Label LABEL_DINERO_INSERTADO;
//    public final Label lDineroRest;
//    public final Label lLabelDineroRest;
    public final Label DISPLAY;
    public final Label COUNTER_CHOCOLATE;
    public final Label COUNTER_PAPAS;
    public final Label COUNTER_COLA;
    public final Label COUNTER_CERVEZA;
    public final Label COUNTER_MONEDAS_CINCO;
    public final Label COUNTER_MONEDAS_DOS;
    public final Label LABEL_INFO;
    public final Label BANDEJA_SALIDA;
    public final Button BOTON_PAPAS;
    public final Button BOTON_COLA;
    public final Button BOTON_CERVEZA;
    public final Button BOTON_RESET;
    public final Button BOTON_PICK;
    public final Button BOTON_INSERT_DINERO;
    public final Button BOTON_PICK_RESTO_DINERO;
    public TextField DINERO_USUARIO;

    public FWindow(int uChocolate, int uPapas, int uCola, int uCerveza, int mCinco, int mDos) {


        final ComponentGenerator componentGenerator = new ComponentGenerator();

        /*
         * Create labels
         */

        //For the tittle
        LABEL_SELECCION = componentGenerator.generateLabel("Selección de comida", 142, 50, 150, 30);

        //For the goods
        LABEL_CHOCOLATE = componentGenerator.generateLabel("Chocolates quedan:", 30, 190, 120, 20);
        LABEL_PAPAS = componentGenerator.generateLabel("Papas quedan:", 230, 190, 120, 20);
        LABEL_COLA = componentGenerator.generateLabel("Cola quedan:", 30, 235, 120, 20);
        LABEL_CERVEZA = componentGenerator.generateLabel("Cerveza quedan:", 230, 235, 120, 20);

        //For the money
        LABEL_DINERO_MAQUINA = componentGenerator.generateLabel("Dinero maquina", 30, 280, 120, 20);
        LABEL_DINERO_INSERTADO = componentGenerator.generateLabel("0", 180, 330, 30, 20);
//        lDineroRest = componentGenerator.generateLabel(String.valueOf(mRest), 240, 330, 30, 20);
//        lLabelDineroRest = componentGenerator.generateLabel("Resto", 275, 330, 40, 20);

        // For the counters
        DISPLAY = componentGenerator.generateDisplayLabel(30, 150, 360, 30);
        COUNTER_CHOCOLATE = componentGenerator.generateLabel(String.valueOf(uChocolate), 30, 210, 30, 20);
        COUNTER_PAPAS = componentGenerator.generateLabel(String.valueOf(uPapas), 230, 210, 30, 20);
        COUNTER_COLA = componentGenerator.generateLabel(String.valueOf(uCola), 30, 255, 30, 20);
        COUNTER_CERVEZA = componentGenerator.generateLabel(String.valueOf(uCerveza), 230, 255, 30, 20);
        COUNTER_MONEDAS_CINCO = componentGenerator.generateLabel(String.valueOf(mCinco), 30, 300, 20, 20);
        COUNTER_MONEDAS_DOS = componentGenerator.generateLabel(String.valueOf(mDos), 65, 300, 20, 20);

        //For the outgoing things
        LABEL_INFO = componentGenerator.generateDisplayLabel(30, 450, 360, 30);
        BANDEJA_SALIDA = componentGenerator.generateLabel("Bandeja de salida.", 30, 410, 360, 30);

        //Money introduced by the user
        DINERO_USUARIO = new TextField("");
        DINERO_USUARIO.setBounds(30, 330, 50, 20);


        /*
         * Create buttons
         */

        //For the goods
        BOTON_CHOCOLATE = componentGenerator.generateButton("Chocolate", 30, 100, 80, 30);
        BOTON_PAPAS = componentGenerator.generateButton("Papas", 115, 100, 80, 30);
        BOTON_COLA = componentGenerator.generateButton("Cola", 200, 100, 80, 30);
        BOTON_CERVEZA = componentGenerator.generateButton("Cerveza", 285, 100, 80, 30);

        //Reset button
        BOTON_RESET = componentGenerator.generateButton("Reset", 280, 370, 80, 30);

        //Pick up button
        BOTON_PICK = componentGenerator.generateButton("Pick!", 30, 370, 80, 30);

        //Insert coin button
        BOTON_INSERT_DINERO = componentGenerator.generateButton("Insert", 90, 330, 80, 30);

        //Pick up rest button
        BOTON_PICK_RESTO_DINERO = componentGenerator.generateButton("Pick!", 320, 330, 80, 30);

        /*
         * Adding elements into the frame
         */

        Frame f = new Frame();

        //Labels
        f.add(LABEL_SELECCION);
        f.add(DISPLAY);
        f.add(LABEL_CHOCOLATE);
        f.add(LABEL_PAPAS);
        f.add(LABEL_COLA);
        f.add(LABEL_CERVEZA);
        f.add(COUNTER_CHOCOLATE);
        f.add(COUNTER_PAPAS);
        f.add(COUNTER_COLA);
        f.add(COUNTER_CERVEZA);
        f.add(LABEL_DINERO_MAQUINA);
        f.add(COUNTER_MONEDAS_CINCO);
        f.add(COUNTER_MONEDAS_DOS);
        f.add(BANDEJA_SALIDA);
        f.add(LABEL_INFO);
        f.add(DINERO_USUARIO);
        f.add(LABEL_DINERO_INSERTADO);
//        f.add(lDineroRest);
//        f.add(lLabelDineroRest);

        //buttons
        f.add(BOTON_CHOCOLATE);
        f.add(BOTON_PAPAS);
        f.add(BOTON_COLA);
        f.add(BOTON_CERVEZA);
        f.add(BOTON_PICK);
        f.add(BOTON_RESET);
        f.add(BOTON_INSERT_DINERO);
        f.add(BOTON_PICK_RESTO_DINERO);


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
