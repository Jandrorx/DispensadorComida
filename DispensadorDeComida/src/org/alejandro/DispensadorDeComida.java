/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alejandro;


import org.alejandro.ui.FWindow;


import java.awt.event.*;

/**
 *
 * @author Jandro
 */

public class DispensadorDeComida {

    //Set items in the machine
    int papasInicial = 2;
    int colaInicial = 2;
    int cervezaInicial = 2;
    
    //Value of the items
    int precioPapas = 2;
    int precioCola = 5;
    int precioCerveza = 5;
    
    //Set money of the machine
    int monedasCinco = 5;
    int monedasDos = 10;
    
    int dineroInsertado = 0;



    public DispensadorDeComida(){

        Chocolate chocolate = new Chocolate();
        Papas papas = new Papas();
        FWindow fWindow=new FWindow(chocolate.actualChocolate, papasInicial, colaInicial, cervezaInicial, monedasCinco, monedasDos);
        /*
        * Add functions to the buttons
        */

        //Money introduced
        fWindow.BOTON_INSERT_DINERO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String dInsert = fWindow.DINERO_USUARIO.getText();
                if (fWindow.DINERO_USUARIO.getText().isEmpty()) {
//                    fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(DINERO_INSERTADO));
                    fWindow.DISPLAY.setText("Inserta dinero.");

                }
                else {
                    fWindow.DISPLAY.setText("");
                    int DINERO_INSERTADO_USUARIO = Integer.parseInt(dInsert);
                    dineroInsertado = dineroInsertado + DINERO_INSERTADO_USUARIO;
                    fWindow.DINERO_USUARIO.setText("");
                    String s1 = String.valueOf(dineroInsertado);
                    fWindow.LABEL_DINERO_INSERTADO.setText(s1);
                }
            }  
        }); 
        
        //Chocolate
        fWindow.BOTON_CHOCOLATE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                extracted(chocolate, fWindow);
            }
        });
        
        //Papas
        fWindow.BOTON_PAPAS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (papasInicial == 0) {
                    fWindow.DISPLAY.setText("Las Papas se acabaron. Seleccione otro producto");
                }
                else {
                    papasInicial--;
                    fWindow.DISPLAY.setText("Papas seleccionado.");
                    fWindow.LABEL_INFO.setText("Papas");
                }
                fWindow.COUNTER_COLA.setText(String.valueOf(papasInicial));
            }
        });

        //Cola
        fWindow.BOTON_COLA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                if (colaInicial == 0) {
                    fWindow.DISPLAY.setText("La Cola se acabó. Seleccione otro producto");
                }
                else {
                    colaInicial--;
                    fWindow.DISPLAY.setText("Cola seleccionado.");
                    fWindow.LABEL_INFO.setText("Cola");
                }
                fWindow.COUNTER_COLA.setText(String.valueOf(colaInicial));
            }  
        }); 
        
        //Cerveza
        fWindow.BOTON_CERVEZA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (cervezaInicial == 0) {
                    fWindow.DISPLAY.setText("La Cerveza se acabó... y el mundo también. Seleccione otra cosa.");
                }
                else {
                    cervezaInicial--;
                    fWindow.DISPLAY.setText("Cerveza seleccionado.");
                    fWindow.LABEL_INFO.setText("Cerveza");
                }
                fWindow.COUNTER_CERVEZA.setText(String.valueOf(cervezaInicial));
            }  
        }); 
        
        //Pick up
        fWindow.BOTON_PICK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fWindow.LABEL_INFO.setText("");
                fWindow.DISPLAY.setText("");
            }  
        }); 
                
        //Pick up rest
        fWindow.BOTON_PICK_RESTO_DINERO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dineroInsertado = 0;
                fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(dineroInsertado));
            }  
        }); 
        
        //Reset
        fWindow.BOTON_RESET.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fWindow.LABEL_INFO.setText("");
                fWindow.DISPLAY.setText("");
                chocolate.actualChocolate = chocolate.chocolateInicial;
                papasInicial = 2;
                colaInicial = 2;
                cervezaInicial = 2;
                fWindow.COUNTER_CHOCOLATE.setText(String.valueOf(chocolate.actualChocolate));
                fWindow.COUNTER_PAPAS.setText(String.valueOf(papasInicial));
                fWindow.COUNTER_COLA.setText(String.valueOf(colaInicial));
                fWindow.COUNTER_CERVEZA.setText(String.valueOf(cervezaInicial));
            }  
        }); 

    }

    private void extracted(Chocolate chocolate, FWindow fWindow) {
        if (chocolate.actualChocolate == 0) {
            fWindow.DISPLAY.setText("El Chocolate se acabó. Seleccione otro producto");
        }
        else if (dineroInsertado == 0 || dineroInsertado < chocolate.precioChocolate) {
            fWindow.DISPLAY.setText("Dinero insuficiente.");
        }
        else {
            monedasDos = monedasDos + 2;
            dineroInsertado = dineroInsertado - chocolate.precioChocolate;
            chocolate.actualChocolate--;
            fWindow.DISPLAY.setText("Chocolate seleccionado.");
            fWindow.LABEL_INFO.setText("Chocolate");

        }
        fWindow.COUNTER_CHOCOLATE.setText(String.valueOf(chocolate.actualChocolate));
        fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(dineroInsertado));
        fWindow.COUNTER_MONEDAS_DOS.setText(String.valueOf(monedasDos));
    }


    public static void main(String[] args) {
    
        new DispensadorDeComida();  
    
    }
}
