/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Color;
import javax.swing.*;


public class MainGui {
    JFrame jf = null;
    JPanel jp = null;
    EkranGui eg = null;
    PanelGui pn=null;
   
    
    public MainGui() { //Constructer 
        getJp().setBackground(Color.gray);
        getJp().add(getEg().getJp());
        getJp().add(getPn().getJp());
        getJf().setVisible(true);    
    }

    
    
    

    public JFrame getJf() {
        if(jf==null){
            jf=new JFrame("İcecek Otomati.exe");
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLocation(400,100);
            jf.setSize(600,800);
            jf.setContentPane(getJp());
            jf.setResizable(false);
            
        }
        return jf;
    }
   

    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();
            jp.setLayout(null);
        }
        return jp;
    }

    public EkranGui getEg() {
        if (eg == null) {
            eg = new EkranGui();
        }
        return eg;
    }

    public PanelGui getPn() {
        if(pn==null){
            pn=new PanelGui();
        }
        return pn;
    }

    
    
    
    
}
