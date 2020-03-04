/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.Actions;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mücahit ÇELİK
 */
public class EkranGui {
     JPanel jp = null;
     JButton urun1=null,urun2=null,urun3=null,urun4=null,urun5=null,urun6=null,urun7=null,
     urun8=null,urun9=null,urun10=null,urun11=null,urun12=null,urun13=null,urun14=null,urun15=null,
     urun16=null,urun17=null,urun18=null,urun19=null,urun20=null;
     Actions e=new Actions(this);
    ImageIcon icon=null;
     
     public EkranGui() {
        getJp().setBackground(Color.black);
        getJp().add(getUrun1()); getJp().add(getUrun2());getJp().add(getUrun3());getJp().add(getUrun4());
        getJp().add(getUrun5());getJp().add(getUrun6());getJp().add(getUrun7());getJp().add(getUrun8());
        getJp().add(getUrun9());getJp().add(getUrun10());getJp().add(getUrun11());getJp().add(getUrun12());
        getJp().add(getUrun13());getJp().add(getUrun14());getJp().add(getUrun15());getJp().add(getUrun16());
        getJp().add(getUrun17());getJp().add(getUrun18());getJp().add(getUrun19());getJp().add(getUrun20());
    }
      
    
    
    
    
    public JPanel getJp() {
        if (jp == null) {
            jp = new JPanel();                  
            jp.setBounds(20, 85, 410, 660);
            jp.setLayout(null);
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public JButton getUrun1() {
        if(urun1==null){
            icon=new ImageIcon("1.jpg");
            urun1=new JButton(icon);
            urun1.setBounds(10, 10, 90, 120);
            urun1.setToolTipText("1. Ürün Fiyatı 2 tl ");
            urun1.setBorderPainted(false);
            
            
            
            
              
            
        }
        return urun1;
    }

    public JButton getUrun2() {
        if(urun2==null){
            icon=new ImageIcon("2.jpg");
            urun2=new JButton(icon);
            urun2.setBounds(110, 10, 90, 120);
            urun2.setToolTipText("2. Ürün Fiyatı 5 tl ");
           urun2.setBorderPainted(false);
            
            
        }
        return urun2;
    }

    public JButton getUrun3() {
        if(urun3==null){
            icon=new ImageIcon("3.jpeg");
            urun3=new JButton(icon);
             urun3.setToolTipText("3. Ürün Fiyatı 3 tl ");
            urun3.setBounds(210, 10, 90, 120);
            urun3.setBorderPainted(false);
            
            
        }
        return urun3;
    }

    public JButton getUrun4() {
        if(urun4==null){
             icon=new ImageIcon("4.jpg");
            urun4=new JButton(icon);
            urun4.setBounds(310, 10, 90, 120);
             urun4.setToolTipText("4. Ürün Fiyatı 3.5 tl ");
            urun4.setBorderPainted(false);
            
            
        }
        return urun4;
    }

    public JButton getUrun5() {
        if(urun5==null){
             icon=new ImageIcon("5.jpg");
            urun5=new JButton(icon);
                
            
            urun5.setBounds(10, 140, 90, 120);
             urun5.setToolTipText("5. Ürün Fiyatı 4 tl ");
            urun5.setBorderPainted(false);
            
            
        }
        return urun5;
    }

    public JButton getUrun6() {
        if(urun6==null){ 
             icon=new ImageIcon("6.jpg");
            urun6=new JButton(icon);
           
            urun6.setBounds(110, 140, 90, 120);
             urun6.setToolTipText("6. Ürün Fiyatı 5 tl ");
            urun6.setBorderPainted(false);
            
        }
        return urun6;
    }

    public JButton getUrun7() { 
        
        if(urun7==null){ 
              icon=new ImageIcon("7.jpg");
            urun7=new JButton(icon);
            urun7.setBounds(210, 140, 90, 120);
             urun7.setToolTipText("7. Ürün Fiyatı 5 tl ");
            urun7.setBorderPainted(false);
            
        }
        return urun7;
    }

    public JButton getUrun8() {
        if(urun8==null){ 
              icon=new ImageIcon("8.jpg");
            urun8=new JButton(icon);
         
            urun8.setBounds(310, 140, 90, 120);
             urun8.setToolTipText("8. Ürün Fiyatı 3.5 tl ");
            urun8.setBorderPainted(false);
            
        }
        return urun8;
    }

    public JButton getUrun9() {
        if(urun9==null){ 
              icon=new ImageIcon("9.jpeg");
            urun9=new JButton(icon);
           
            urun9.setBounds(10, 270, 90, 120);
             urun9.setToolTipText("9. Ürün Fiyatı 2.5 tl ");
            urun9.setBorderPainted(false);
            
        }
        return urun9;
    }
    public JButton getUrun10() {
        if(urun10==null){ 
              icon=new ImageIcon("10.jpeg");
            urun10=new JButton(icon);
            
            urun10.setBounds(110, 270, 90, 120);
             urun10.setToolTipText("10. Ürün Fiyatı 6.5 tl ");
            urun10.setBorderPainted(false);
            
        }
        return urun10;
    }

    public JButton getUrun11() {
        if(urun11==null){ 
              icon=new ImageIcon("11.jpeg");
            urun11=new JButton(icon);
           
            urun11.setBounds(210, 270, 90, 120);
             urun11.setToolTipText("11. Ürün Fiyatı 5.5 tl ");
            urun11.setBorderPainted(false);
            
        }
        return urun11;
    }

    public JButton getUrun12() { //bu olmadı
        
        if(urun12==null){ 
              icon=new ImageIcon("12.jpg");
            urun12=new JButton(icon);
            urun12.setBounds(310, 270, 90, 120);
            urun12.setToolTipText("12. Ürün Fiyatı 2.75 tl ");
            urun12.setBorderPainted(false);
            
        }
        return urun12;
    }

    public JButton getUrun13() {
        if(urun13==null){ 
              icon=new ImageIcon("13.jpeg");
            urun13=new JButton(icon);
            
            urun13.setBounds(10, 400, 90, 120);
             urun13.setToolTipText("13. Ürün Fiyatı 4.75 tl ");
            urun13.setBorderPainted(false);
            
        }
        return urun13;
    }

    public JButton getUrun14() {
        if(urun14==null){ 
              icon=new ImageIcon("14.png");
            urun14=new JButton(icon);
            
            urun14.setBounds(110, 400, 90, 120);
             urun14.setToolTipText("14. Ürün Fiyatı4.75 tl ");
            urun14.setBorderPainted(false);
            
        }
        return urun14;
    }

    public JButton getUrun15() {
        if(urun15==null){ 
              icon=new ImageIcon("15.jpg");
            urun15=new JButton(icon);
           
            urun15.setBounds(210, 400, 90, 120);
             urun15.setToolTipText("15. Ürün Fiyatı 2.5 tl ");
            urun15.setBorderPainted(false);
            
        }
        return urun15;
    }

    public JButton getUrun16() {
        if(urun16==null){ 
              icon=new ImageIcon("16.jpg");
           
            urun16=new JButton(icon);
            urun16.setBounds(310,400, 90, 120);
             urun16.setToolTipText("16. Ürün Fiyatı 4.5 tl ");
            urun16.setBorderPainted(false);
            
        }
        return urun16;
    }

    public JButton getUrun17() {
        if(urun17==null){ 
              icon=new ImageIcon("17.jpg");
            
            urun17=new JButton(icon);
            urun17.setBounds(10, 530, 90, 120);
             urun17.setToolTipText("17. Ürün Fiyatı 3.5 tl ");
            urun17.setBorderPainted(false);
            
        }
        return urun17;
    }

    public JButton getUrun18() {
        if(urun18==null){ 
              icon=new ImageIcon("18.jpg");
         
            urun18=new JButton(icon);
            urun18.setBounds(110, 530, 90, 120);
             urun18.setToolTipText("18. Ürün Fiyatı 4.5 tl ");
            urun18.setBorderPainted(false);
            
        }
        return urun18;
    }

    public JButton getUrun19() {
        if(urun19==null){ 
              icon=new ImageIcon("19.jpg");
            
            urun19=new JButton(icon);
            urun19.setBounds(210, 530, 90, 120);
             urun19.setToolTipText("19. Ürün Fiyatı 4.75 tl ");
            urun19.setBorderPainted(false);
            
        }
        return urun19;
    }

    public JButton getUrun20() {
        if(urun20==null){ 
              icon=new ImageIcon("20.jpeg");
          
            urun20=new JButton(icon);
            urun20.setBounds(310, 530, 90, 120);
             urun20.setToolTipText("20. Ürün Fiyatı 5 tl ");
            urun20.setBorderPainted(false);
            
        }
        return urun20;
    }
    
    
    


    
}
