/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadordecomida;


import java.awt.*;
import java.awt.event.*;
//import java.util.Scanner;
/**
 *
 * @author Jandro
 */


public class DispensadorDeComida extends Frame {
    
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
    int mCinco = 2;
    int mDos = 5;
    int mRest = 0;
    
    int dInsert = 0;
    
    //Set width and height of the frame
    private static final int WIDTH = 435;
    private static final int HEIGHT = 500;
            
    DispensadorDeComida(){  

        //Label title and position
        Label lSeleccion;
        lSeleccion= new Label("Selección de comida");
        lSeleccion.setBounds(142,50,150,30);
            
        /*
        * Create buttons
        */
        
        //ChouColate
        Button bChocolate=new Button("Chocolate"); 
        bChocolate.setBounds(30,100,80,30);   
        
        //Papas button
        Button bPapas=new Button("Papas"); 
        bPapas.setBounds(115,100,80,30);  
        
        //Cola button
        Button bCola=new Button("Cola"); 
        bCola.setBounds(200,100,80,30);  
        
        //Cerveza button
        Button bCerveza=new Button("Cerveza"); 
        bCerveza.setBounds(285,100,80,30); 
        
        //Reset button
        Button bReset=new Button("Reset"); 
        bReset.setBounds(280,370,80,30); 

        //Pick up button
        Button bPick=new Button("Pick!"); 
        bPick.setBounds(30,370,80,30);         
        
        /*
        * Create labels for the goods
        */
        
        //ChouColate
        Label lChocolate;
        lChocolate= new Label("Chocolates quedan:");
        lChocolate.setBounds(30,190,120,20);
        lChocolate.setBackground(Color.GRAY);
        
        //Papas
        Label lPapas;
        lPapas= new Label("Papas quedan:");
        lPapas.setBounds(230,190,120,20);
        lPapas.setBackground(Color.GRAY);
        
        //Cola
        Label lCola;
        lCola= new Label("Colas quedan:");
        lCola.setBounds(30,235,120,20);
        lCola.setBackground(Color.GRAY);
        
        //Cerveza
        Label lCerveza;
        lCerveza= new Label("Cervezas quedan:");
        lCerveza.setBounds(230,235,120,20);
        lCerveza.setBackground(Color.GRAY);
        
        //Dinero en maquina
        Label lDineroM;
        lDineroM= new Label("Dinero maquina");
        lDineroM.setBounds(30,280,120,20);
        lDineroM.setBackground(Color.GRAY);
        
        //Money introduced by the user
        TextField tDineroUser;  
        tDineroUser=new TextField("");  
        tDineroUser.setBounds(30,330,50,20);
        
        //Insert coin button + Label 
        Button bInsert=new Button("Insert"); 
        bInsert.setBounds(90,330,80,30);   
                
        Label lDineroInsert;
        lDineroInsert= new Label("0");
        lDineroInsert.setBounds(180,330,30,20);
        lDineroInsert.setBackground(Color.GRAY);
        
        Label lDineroRest;
        lDineroRest= new Label(String.valueOf(mRest));
        lDineroRest.setBounds(240,330,30,20);
        lDineroRest.setBackground(Color.GRAY);
        
        Label lLabelDineroRest;
        lLabelDineroRest= new Label("Resto");
        lLabelDineroRest.setBounds(275,330,40,20);
        lLabelDineroRest.setBackground(Color.GRAY);
        add(lLabelDineroRest);
        
        Button bPickRest=new Button("Pick!"); 
        bPickRest.setBounds(320,330,80,30); 
        add(bPickRest);
        //Scanner myObj = new Scanner(System.in);
        //String money = myObj.nextLine();
        //tDineroUser.setText(money);
        
        /*
        * Create text fields for the counters
        */
        
        Label tDisplay, tChocolate, tPapas, tCola, tCerveza, tCinco, tDos, tInfo, tBandeja; 
        
        //Display        
        tDisplay=new Label("");
        tDisplay.setBounds(30,150,360,30);
        tDisplay.setBackground(Color.GRAY);
        tDisplay.setForeground(Color.white);
        
        //Chocolate
        tChocolate=new Label(String.valueOf(uChocolate));
        tChocolate.setBounds(30,210,30,20);
        tChocolate.setBackground(Color.GRAY);
        
        //Papas
        tPapas=new Label(String.valueOf(uPapas));
        tPapas.setBounds(230,210,30,20);
        tPapas.setBackground(Color.GRAY);
        
        //Cola
        tCola=new Label(String.valueOf(uCola));
        tCola.setBounds(30,255,30,20);
        tCola.setBackground(Color.GRAY);
        
        //Cerveza
        tCerveza=new Label(String.valueOf(uCerveza));
        tCerveza.setBounds(230,255,30,20);
        tCerveza.setBackground(Color.GRAY);
        
        //Coins 5
        tCinco=new Label(String.valueOf(mCinco));
        tCinco.setBounds(30,300,20,20);
        tCinco.setBackground(Color.GRAY);
        
        //Coins 2
        tDos=new Label(String.valueOf(mDos));
        tDos.setBounds(65,300,20,20);
        tDos.setBackground(Color.GRAY);
        
        //Label bandeja        
        tBandeja=new Label("Bandeja de salida.");
        tBandeja.setBounds(30,410,360,30);
        tBandeja.setBackground(Color.GRAY);
        
        //Info bandeja
        tInfo=new Label();
        tInfo.setBounds(30,450,360,30);
        tInfo.setBackground(Color.GRAY);
                
        /*
        * Add functions to the buttons
        */
        
        //Money introduced
        bInsert.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){                
                if (tDineroUser.getText().isEmpty()) {
                    lDineroInsert.setText(String.valueOf(dInsert));
                }
                else if (dInsert > 0) { 
                    String s1=tDineroUser.getText();
                    int dInsert2 = Integer.parseInt(s1);
                    dInsert = dInsert + dInsert2; 
                    tDineroUser.setText("");
                }
                else {
                    String s2=tDineroUser.getText();  
                    //Scanner tDineroUser = new Scanner(System.in);
                    //String money = tDineroUser.nextLine();
                    lDineroInsert.setText(s2); 
                    tDineroUser.setText("");
                    dInsert = Integer.parseInt(s2);
                }              
            }  
        }); 
        
        //ChouColate
        bChocolate.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){                
                if (uChocolate == 0) {
                    tDisplay.setText("El Chocolate se acabó. Seleccione otro producto");
                    //uChouColate = 0;
                }
                else if (dInsert == 0 || dInsert < pChocolate) { 
                    tDisplay.setText("Dinero insuficiente.");
                }
                else {
                    dInsert = dInsert - pChocolate;
                    uChocolate --;
                    tDisplay.setText("Chocolate seleccionado.");
                    tInfo.setText("Chocolate");                    
                }     
                tChocolate.setText(String.valueOf(uChocolate)); 
                lDineroInsert.setText(String.valueOf(dInsert));
            }  
        }); 
        
        //Papas
        bPapas.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if (uPapas == 0) {
                    tDisplay.setText("Las Papas se acabaron. Seleccione otro producto");
                    //uPapas = 0;
                }
                else { 
                    uPapas --;
                    tDisplay.setText("Papas seleccionado.");  
                    tInfo.setText("Papas");                  
                }
                tPapas.setText(String.valueOf(uPapas));
            }  
        });
        
        //Cola
        bCola.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if (uCola == 0) {
                    tDisplay.setText("La Cola se acabó. Seleccione otro producto");
                    //uCola = 0;
                }
                else {
                    uCola --; 
                    tDisplay.setText("Cola seleccionado."); 
                    tInfo.setText("Cola");                  
                }
                tCola.setText(String.valueOf(uCola));
            }  
        }); 
        
        //Cerveza
        bCerveza.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                if (uCerveza == 0) {
                    tDisplay.setText("La Cerveza se acabó... y el mundo también. Seleccione otra cosa.");
                    //uCerveza = 0;
                }
                else {
                    uCerveza --;  
                    tDisplay.setText("Cerveza seleccionado."); 
                    tInfo.setText("Cerveza");                  
                }
                tCerveza.setText(String.valueOf(uCerveza));
            }  
        }); 
        
        //Pick up
        bPick.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                tInfo.setText("");
                tDisplay.setText("");
            }  
        }); 
                
        //Pick up rest
        bPickRest.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                mRest = 0;
                lDineroRest.setText(String.valueOf(mRest));
            }  
        }); 
        
        //Reset
        bReset.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                tInfo.setText("");
                tDisplay.setText("");
                uChocolate = 2;
                uPapas = 2;
                uCola = 2;
                uCerveza = 2;
                tChocolate.setText(String.valueOf(uChocolate));
                tPapas.setText(String.valueOf(uPapas));
                tCola.setText(String.valueOf(uCola));
                tCerveza.setText(String.valueOf(uCerveza));
            }  
        }); 
        
        /*
        * Adding elements into the frame
        */
          
        add(lSeleccion);      
        add(bChocolate); 
        add(bPapas);
        add(bCola); 
        add(bCerveza);
        add(bPick); 
        add(bReset); 
        add(tDisplay);
        add(lChocolate);
        add(lPapas);
        add(lCola);
        add(lCerveza);
        add(tChocolate);
        add(tPapas);
        add(tCola);
        add(tCerveza);
        add(lDineroM);
        add(tCinco);
        add(tDos);
        add(tBandeja);
        add(tInfo);
        add(tDineroUser);
        add(bInsert);
        add(lDineroInsert);
        add(lDineroRest);
        
        /*
        * Frame properties
        */
        
        //Setting Frame width and height
        setSize(WIDTH,HEIGHT); 

        //Setting the title of Frame
        setTitle("Dispensador de comida"); 

        //Adding close function
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        //Setting the layout for the Frame
        setLayout(null);

        /* By default frame is not visible so 
         * we are setting the visibility to true 
         * to make it visible.
         */
        setVisible(true); 
    
    }

    

    public static void main(String[] args) {
    
        new DispensadorDeComida();  
    
    }
}
