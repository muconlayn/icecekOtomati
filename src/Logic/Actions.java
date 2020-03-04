/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.EkranGui;
import Gui.MainGui;
import Gui.PanelGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Mücahit ÇELİK
 */
public class Actions implements ActionListener{
      PanelGui pg=null;
      EkranGui eg=null;
      MainGui mg=null;
      ImageIcon icon=null;
      
      public Actions(MainGui mg)
      {
          this.mg=mg;
      }
      public Actions(EkranGui eg){
          this.eg=eg;
      }
      
      public Actions(PanelGui pg ){
          this.pg=pg;
      }
   
      
       public Float x;
      public String z;
      public int b;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pg.getSec()){
            String select1;
            String select2;
            select2=pg.getUrunmiktar().getText();
            b=Integer.valueOf(select2);
            select1=pg.getVerilen().getText();
            int a=Integer.valueOf(select1);
            switch(a){
                case 1 : 
                    double m1=2;
                    m1=m1*b;
                    String ü1=String.valueOf(m1);
                    pg.getUcret().setText(ü1);
                    icon=new ImageIcon("1.jpg");
                    pg.getSecilen().setIcon(icon);
                    
                     
                JOptionPane.showMessageDialog(null,"1. Ürün Seçildi.");
                break;
                case 2: 
                    double m2=5;
                    m2=m2*b;
                    String ü2=String.valueOf(m2);
                    icon=new ImageIcon("2.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü2);JOptionPane.showMessageDialog(null,"2. Ürün Seçildi."); break;
                case 3 : 
                    double m3 = 3;
                    m3=m3*b;
                    String ü3=String.valueOf(m3);
                    icon=new ImageIcon("3.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü3);JOptionPane.showMessageDialog(null,"3. Ürün Seçildi."); break;
                case 4 :
                    double m4 = 3.5;
                    m4=m4*b;
                    String ü4=String.valueOf(m4);
                    icon=new ImageIcon("4.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü4);JOptionPane.showMessageDialog(null,"4. Ürün Seçildi."); break;
                case 5 : 
                    double m5=4;
                    m5=m5*b;
                    String ü5=String.valueOf(m5);
                    icon=new ImageIcon("5.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü5);JOptionPane.showMessageDialog(null,"5. Ürün Seçildi."); break;
                case 6 : 
                    double m6 = 5;
                    m6=m6*b;
                    String ü6=String.valueOf(m6);
                    icon=new ImageIcon("6.jpg");
                   pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü6);JOptionPane.showMessageDialog(null,"6. Ürün Seçildi."); break;
                case 7 :
                    double m7= 5;
                    m7=m7*b;
                    String ü7=String.valueOf(m7);
                    icon=new ImageIcon("7.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü7);JOptionPane.showMessageDialog(null,"7. Ürün Seçildi."); break;
                case 8 : 
                    double m8 = 3.5;
                    m8=m8*b;
                    String ü8=String.valueOf(m8);
                    icon=new ImageIcon("8.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü8);JOptionPane.showMessageDialog(null,"8. Ürün Seçildi."); break;
                case 9 : 
                    double m9 = 2.5;
                    m9=m9*b;
                    String ü9=String.valueOf(m9);
                    icon=new ImageIcon("9.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü9);JOptionPane.showMessageDialog(null,"9. Ürün Seçildi."); break;
                case 10 : 
                   double m10 = 6.5;
                    m10=m10*b;
                    String ü10=String.valueOf(m10);
                    icon=new ImageIcon("10.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü10);JOptionPane.showMessageDialog(null,"10. Ürün Seçildi."); break;
                case 11: 
                    double m11 = 5.5;
                    m11=m11*b;
                    String ü11=String.valueOf(m11);
                    icon=new ImageIcon("11.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü11);JOptionPane.showMessageDialog(null,"11. Ürün Seçildi."); break;
                case 12:
                    double m12 = 2.75;
                    m12=m12*b;
                    String ü12=String.valueOf(m12);
                    icon=new ImageIcon("12.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü12);JOptionPane.showMessageDialog(null,"12. Ürün Seçildi."); break;
                case 13 : 
                    double m13 = 4.75;
                    m13=m13*b;
                    String ü13=String.valueOf(m13);
                    icon=new ImageIcon("13.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü13);JOptionPane.showMessageDialog(null,"13. Ürün Seçildi."); break;
                case 14 : 
                    double m14 = 4.75;
                    m14=m14*b;
                    String ü14=String.valueOf(m14);
                    icon=new ImageIcon("14.png");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü14);JOptionPane.showMessageDialog(null,"14. Ürün Seçildi."); break;
                case 15 : 
                   double m15= 2.5;
                    m15=m15*b;
                    String ü15=String.valueOf(m15);
                    icon=new ImageIcon("15.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü15);JOptionPane.showMessageDialog(null,"15. Ürün Seçildi."); break;
                case 16 : 
                    double m16 = 4.5;
                    m16=m16*b;
                    String ü16=String.valueOf(m16);
                    icon=new ImageIcon("16.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü16);JOptionPane.showMessageDialog(null,"16. Ürün Seçildi."); break;
                case 17 :
                    double m17 = 3.5;
                    m17=m17*b;
                    String ü17=String.valueOf(m17);
                    icon=new ImageIcon("17.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü17);JOptionPane.showMessageDialog(null,"17. Ürün Seçildi."); break;
                case 18 :
                   double m18 = 4.5;
                    m18=m18*b;
                    String ü18=String.valueOf(m18);
                    icon=new ImageIcon("18.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü18);JOptionPane.showMessageDialog(null,"18. Ürün Seçildi."); break;
                case 19 : 
                    double m19 = 4.75;
                    m19=m19*b;
                    String ü19=String.valueOf(m19);
                    icon=new ImageIcon("19.jpg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü19);JOptionPane.showMessageDialog(null,"19. Ürün Seçildi."); break;
                case 20 : 
                    double m20= 5;
                    m20=m20*b;
                    String ü20=String.valueOf(m20);
                    icon=new ImageIcon("20.jpeg");
                    pg.getSecilen().setIcon(icon);
                    pg.getUcret().setText(ü20); JOptionPane.showMessageDialog(null,"20. Ürün Seçildi."); break;
                default: JOptionPane.showMessageDialog(null,"Hatalı Seçim 1-20 Arası Seçim Yapabilirsiniz."); break;
                
            }
                
        }
       
        if(e.getSource()==pg.getOde()){
            String bakiye;
            float sonbakiye;
            bakiye=pg.getBakiye().getText();
           sonbakiye=Float.valueOf(bakiye);
            
            z=pg.getUcret().getText();
            x=Float.valueOf(z);
            
            
            if(sonbakiye>=x){
                sonbakiye=sonbakiye-x;
                System.out.println(sonbakiye+ " " + x +"işlem yapıldı.");//işlemin yapıldığını gösteren kod
                NumberFormat nf=NumberFormat.getInstance();
                nf.setMinimumFractionDigits(2);
                String y =nf.format(sonbakiye);
                
                JOptionPane.showMessageDialog(null, "Para Üstünüz :" + y);
                pg.getParaustu().setText("Para Üstünüz :) "+y);
               
            }else 
            JOptionPane.showMessageDialog(null, "Bakiye Yetersiz, Tekrar Giriniz.");
        }
        
          
        }

    }
 
    

