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
//    int uChocolate = 2;
    int PAPAS_INICIAL = 2;
    int COLA_INICIAL = 2;
    int CERVEZA_INICIAL = 2;
    
    //Value of the items
//    int pChocolate = 2;
    int PRECIO_PAPAS = 2;
    int PRECIO_COLA = 5;
    int PRECIO_CERVEZA = 5;
    
    //Set money of the machine
    int MONEDAS_CINCO = 5;
    int MONEDAS_DOS = 10;
    
    int DINERO_INSERTADO = 0;

    public static class chocolate {

        int CHOCOLATE_INICIAL = 2;
        int PRECIO_CHOCOLATE = 2;
        int ACTUAL_CHOCOLATE = CHOCOLATE_INICIAL;

    }


    public DispensadorDeComida(){

        chocolate chocolate = new chocolate();
        FWindow fWindow=new FWindow(chocolate.ACTUAL_CHOCOLATE, PAPAS_INICIAL, COLA_INICIAL, CERVEZA_INICIAL, MONEDAS_CINCO, MONEDAS_DOS);
        /*
        * Add functions to the buttons
        */

        //Money introduced
        fWindow.BOTON_INSERT_DINERO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                if (fWindow.DINERO_USUARIO.getText().isEmpty()) {
                    fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(DINERO_INSERTADO));
                }
                else if (DINERO_INSERTADO > 0) {
                    String s1=fWindow.DINERO_USUARIO.getText();
                    int dInsert2 = Integer.parseInt(s1);
                    DINERO_INSERTADO = DINERO_INSERTADO + dInsert2;
                    fWindow.DINERO_USUARIO.setText("");
                }
                else {
                    String s2=fWindow.DINERO_USUARIO.getText();
                    fWindow.LABEL_DINERO_INSERTADO.setText(s2);
                    fWindow.DINERO_USUARIO.setText("");
                    DINERO_INSERTADO = Integer.parseInt(s2);
                }              
            }  
        }); 
        
        //Chocolate
        fWindow.BOTON_CHOCOLATE.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (chocolate.ACTUAL_CHOCOLATE == 0) {
                    fWindow.DISPLAY.setText("El Chocolate se acabó. Seleccione otro producto");
                }
                else if (DINERO_INSERTADO == 0 || DINERO_INSERTADO < chocolate.PRECIO_CHOCOLATE) {
                    fWindow.DISPLAY.setText("Dinero insuficiente.");
                }
                else {
                    MONEDAS_DOS = MONEDAS_DOS + 2;
                    DINERO_INSERTADO = DINERO_INSERTADO - chocolate.PRECIO_CHOCOLATE;
                    chocolate.ACTUAL_CHOCOLATE --;
                    fWindow.DISPLAY.setText("Chocolate seleccionado.");
                    fWindow.LABEL_INFO.setText("Chocolate");

                }
                fWindow.COUNTER_CHOCOLATE.setText(String.valueOf(chocolate.ACTUAL_CHOCOLATE));
                fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(DINERO_INSERTADO));
                fWindow.COUNTER_MONEDAS_DOS.setText(String.valueOf(MONEDAS_DOS));
            }
        });
        
        //Papas
        fWindow.BOTON_PAPAS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (PAPAS_INICIAL == 0) {
                    fWindow.DISPLAY.setText("Las Papas se acabaron. Seleccione otro producto");
                }
                else {
                    PAPAS_INICIAL--;
                    fWindow.DISPLAY.setText("Papas seleccionado.");
                    fWindow.LABEL_INFO.setText("Papas");
                }
                fWindow.COUNTER_COLA.setText(String.valueOf(PAPAS_INICIAL));
            }
        });

        //Cola
        fWindow.BOTON_COLA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                if (COLA_INICIAL == 0) {
                    fWindow.DISPLAY.setText("La Cola se acabó. Seleccione otro producto");
                }
                else {
                    COLA_INICIAL--;
                    fWindow.DISPLAY.setText("Cola seleccionado.");
                    fWindow.LABEL_INFO.setText("Cola");
                }
                fWindow.COUNTER_COLA.setText(String.valueOf(COLA_INICIAL));
            }  
        }); 
        
        //Cerveza
        fWindow.BOTON_CERVEZA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (CERVEZA_INICIAL == 0) {
                    fWindow.DISPLAY.setText("La Cerveza se acabó... y el mundo también. Seleccione otra cosa.");
                }
                else {
                    CERVEZA_INICIAL--;
                    fWindow.DISPLAY.setText("Cerveza seleccionado.");
                    fWindow.LABEL_INFO.setText("Cerveza");
                }
                fWindow.COUNTER_CERVEZA.setText(String.valueOf(CERVEZA_INICIAL));
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
                DINERO_INSERTADO = 0;
                fWindow.LABEL_DINERO_INSERTADO.setText(String.valueOf(DINERO_INSERTADO));
            }  
        }); 
        
        //Reset
        fWindow.BOTON_RESET.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fWindow.LABEL_INFO.setText("");
                fWindow.DISPLAY.setText("");
                chocolate.ACTUAL_CHOCOLATE = chocolate.CHOCOLATE_INICIAL;
                PAPAS_INICIAL = 2;
                COLA_INICIAL = 2;
                CERVEZA_INICIAL = 2;
                fWindow.COUNTER_CHOCOLATE.setText(String.valueOf(chocolate.ACTUAL_CHOCOLATE));
                fWindow.COUNTER_PAPAS.setText(String.valueOf(PAPAS_INICIAL));
                fWindow.COUNTER_COLA.setText(String.valueOf(COLA_INICIAL));
                fWindow.COUNTER_CERVEZA.setText(String.valueOf(CERVEZA_INICIAL));
            }  
        }); 

    }




    public static void main(String[] args) {
    
        new DispensadorDeComida();  
    
    }
}
