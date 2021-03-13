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
    int uChocolate = 2;
    int uPapas = 2;
    int uCola = 2;
    int uCerveza = 2;
    
    //Value of the items
    int pChocolate = 2;
    int pPapas = 2;
    int pCola = 5;
    int pCerveza = 5;
    
    //Set money of the machine
    int mCinco = 5;
    int mDos = 10;
    int mRest = 0;
    
    int dInsert = 0;

            
    public DispensadorDeComida(){

        FWindow fWindow=new FWindow(mRest, uChocolate, uPapas, uCola, uCerveza, mCinco, mDos);

        /*
        * Add functions to the buttons
        */

        //Money introduced
        fWindow.bInsert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                if (fWindow.tDineroUser.getText().isEmpty()) {
                    fWindow.lDineroInsert.setText(String.valueOf(dInsert));
                }
                else if (dInsert > 0) { 
                    String s1=fWindow.tDineroUser.getText();
                    int dInsert2 = Integer.parseInt(s1);
                    dInsert = dInsert + dInsert2;
                    fWindow.tDineroUser.setText("");
                }
                else {
                    String s2=fWindow.tDineroUser.getText();
                    fWindow.lDineroInsert.setText(s2);
                    fWindow.tDineroUser.setText("");
                    dInsert = Integer.parseInt(s2);
                }              
            }  
        }); 
        
        //Chocolate
        fWindow.bChocolate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (uChocolate == 0) {
                    fWindow.tDisplay.setText("El Chocolate se acabó. Seleccione otro producto");
                }
                else if (dInsert == 0 || dInsert < pChocolate) {
                    fWindow.tDisplay.setText("Dinero insuficiente.");
                }
                else {
                    dInsert = dInsert - pChocolate;
                    uChocolate --;
                    fWindow.tDisplay.setText("Chocolate seleccionado.");
                    fWindow.tInfo.setText("Chocolate");
                }
                fWindow.tChocolate.setText(String.valueOf(uChocolate));
                fWindow.lDineroInsert.setText(String.valueOf(dInsert));
            }
        });
        
        //Papas
        fWindow.bPapas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (uPapas == 0) {
                    fWindow.tDisplay.setText("Las Papas se acabaron. Seleccione otro producto");
                }
                else {
                    uPapas --;
                    fWindow.tDisplay.setText("Papas seleccionado.");
                    fWindow.tInfo.setText("Papas");
                }
                fWindow.tCola.setText(String.valueOf(uPapas));
            }
        });

        //Cola
        fWindow.bCola.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){ 
                if (uCola == 0) {
                    fWindow.tDisplay.setText("La Cola se acabó. Seleccione otro producto");
                }
                else {
                    uCola --;
                    fWindow.tDisplay.setText("Cola seleccionado.");
                    fWindow.tInfo.setText("Cola");
                }
                fWindow.tCola.setText(String.valueOf(uCola));
            }  
        }); 
        
        //Cerveza
        fWindow.bCerveza.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (uCerveza == 0) {
                    fWindow.tDisplay.setText("La Cerveza se acabó... y el mundo también. Seleccione otra cosa.");
                }
                else {
                    uCerveza --;
                    fWindow.tDisplay.setText("Cerveza seleccionado.");
                    fWindow.tInfo.setText("Cerveza");
                }
                fWindow.tCerveza.setText(String.valueOf(uCerveza));
            }  
        }); 
        
        //Pick up
        fWindow.bPick.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fWindow.tInfo.setText("");
                fWindow.tDisplay.setText("");
            }  
        }); 
                
        //Pick up rest
        fWindow.bPickRest.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mRest = 0;
                fWindow.lDineroRest.setText(String.valueOf(mRest));
            }  
        }); 
        
        //Reset
        fWindow.bReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fWindow.tInfo.setText("");
                fWindow.tDisplay.setText("");
                uChocolate = 2;
                uPapas = 2;
                uCola = 2;
                uCerveza = 2;
                fWindow.tChocolate.setText(String.valueOf(uChocolate));
                fWindow.tPapas.setText(String.valueOf(uPapas));
                fWindow.tCola.setText(String.valueOf(uCola));
                fWindow.tCerveza.setText(String.valueOf(uCerveza));
            }  
        }); 

    }




    public static void main(String[] args) {
    
        new DispensadorDeComida();  
    
    }
}
