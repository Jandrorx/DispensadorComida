package org.alejandro.ui;

import java.awt.*;
import java.io.Serializable;

public class ComponentGenerator implements Serializable {
    public ComponentGenerator() {
    }

    public Label generateLabel(String text, int posH, int posV, int ancho, int alto) {
        //Generic label
        Label label = new Label(text);
        label.setBounds(posH, posV, ancho, alto);
        //label.setBackground(Color.GRAY);
        return label;
    }

    public Label generateDisplayLabel(int posH, int posV, int ancho, int alto) {
        //Display
        Label tDisplay = new Label("");
        tDisplay.setBounds(posH, posV, ancho, alto);
        tDisplay.setBackground(Color.GRAY);
        tDisplay.setForeground(Color.white);
        return tDisplay;
    }

    public Button generateButton(String text, int posH, int posV, int ancho, int alto) {
        //Generic Button
        Button button = new Button(text);
        button.setBounds(posH, posV, ancho, alto);
        return button;
    }







}