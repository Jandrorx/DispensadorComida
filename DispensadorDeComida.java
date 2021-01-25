/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadordecomida;


import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jandro
 */


public class DispensadorDeComida extends Frame {
    
    //Set items in the machine
    int chocolate = 2;
    int papas = 2;
    int cola = 2;
    int cerveza = 2;
        
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
        
        //Chocolate
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
        
        //Chocolate
        Label lChocolate;
        lChocolate= new Label("Chocolates quedan:");
        lChocolate.setBounds(30,190,120,30);
        
        //Papas
        Label lPapas;
        lPapas= new Label("Papas quedan:");
        lPapas.setBounds(230,190,120,30);
        
        //Cola
        Label lCola;
        lCola= new Label("Colas quedan:");
        lCola.setBounds(30,270,120,30);
        
        //Cerveza
        Label lCerveza;
        lCerveza= new Label("Cervezas quedan:");
        lCerveza.setBounds(230,270,120,30);
        
        /*
        * Create text fields for the counters
        */
        
        Label tDisplay, tChocolate, tPapas, tCola, tCerveza, tInfo, tBandeja; 
        
        //Display        
        tDisplay=new Label("");
        tDisplay.setBounds(30,150,360,30);
        tDisplay.setBackground(Color.GRAY);
        tDisplay.setForeground(Color.white);
        
        //Chocolate
        tChocolate=new Label(String.valueOf(chocolate));
        tChocolate.setBounds(30,230,30,30);
        
        //Papas
        tPapas=new Label(String.valueOf(papas));
        tPapas.setBounds(230,230,30,30);
        
        //Cola
        tCola=new Label(String.valueOf(cola));
        tCola.setBounds(30,310,30,30);
        
        //Cerveza
        tCerveza=new Label(String.valueOf(cerveza));
        tCerveza.setBounds(230,310,30,30);
        
        //Label bandeja        
        tBandeja=new Label("Bandeja de salida.");
        tBandeja.setBounds(30,410,360,30);
        
        //Info bandeja
        tInfo=new Label();
        tInfo.setBounds(30,450,360,30);
                
        /*
        * Add functions to the buttons
        */
        
        //Chocolate
        bChocolate.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){                
                if (chocolate == 0) {
                    tDisplay.setText("El chocolate se acabó. Seleccione otro producto");
                    chocolate = 0;
                }
                else { 
                    chocolate --;
                    tDisplay.setText("Chocolate seleccionado.");
                    tInfo.setText("Chocolate");                    
                }     
                tChocolate.setText(String.valueOf(chocolate));            
            }  
        }); 
        
        //Papas
        bPapas.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if (papas == 0) {
                    tDisplay.setText("Las papas se acabaron. Seleccione otro producto");
                    papas = 0;
                }
                else { 
                    papas --;
                    tDisplay.setText("Papas seleccionado.");  
                    tInfo.setText("Papas");                  
                }
                tPapas.setText(String.valueOf(papas));
            }  
        });
        
        //Cola
        bCola.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                if (cola == 0) {
                    tDisplay.setText("La cola se acabó. Seleccione otro producto");
                    cola = 0;
                }
                else {
                    cola --; 
                    tDisplay.setText("Cola seleccionado."); 
                    tInfo.setText("Cola");                  
                }
                tCola.setText(String.valueOf(cola));
            }  
        }); 
        
        //Cerveza
        bCerveza.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                if (cerveza == 0) {
                    tDisplay.setText("La cerveza se acabó... y el mundo también. Seleccione otra cosa.");
                    cerveza = 0;
                }
                else {
                    cerveza --;  
                    tDisplay.setText("Cerveza seleccionado."); 
                    tInfo.setText("Cerveza");                  
                }
                tCerveza.setText(String.valueOf(cerveza));
            }  
        }); 
        
        //Pick up
        bPick.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                tInfo.setText("");
                tDisplay.setText("");
            }  
        }); 
        
        //Reset
        bReset.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                tInfo.setText("");
                tDisplay.setText("");
                chocolate = 2;
                papas = 2;
                cola = 2;
                cerveza = 2;
                tChocolate.setText(String.valueOf(chocolate));
                tPapas.setText(String.valueOf(papas));
                tCola.setText(String.valueOf(cola));
                tCerveza.setText(String.valueOf(cerveza));
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
        add(tBandeja);
        add(tInfo);
        
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
