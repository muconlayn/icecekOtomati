/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.Actions;
import java.awt.Color;
import java.util.Locale;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.*;
import javax.swing.ImageIcon;



public class PanelGui {
     JPanel jp = null;
     PanelGui p=null;
     JButton select=null;
     JTextField urunNo=null;
     JLabel text1=null;
    JLabel price=null;
    JLabel text2=null;
    JTextField bakiye=null;
    JButton pay=null;
    JLabel remaining=null;
    Actions e=new Actions(this);
    JLabel secilen=null;
    JLabel urunno=null;
    JLabel miktar=null;
    JTextField urunmiktar=null;
    ImageIcon icon=null;
    public PanelGui() {
        getJp().setBackground(Color.lightGray);
        getJp().add(getVerilen());
        getJp().add(getSec());
        getJp().add(getBilgi());
        getJp().add(getUcret());
        getJp().add(getBilgi1()); 
        getJp().add(getBakiye()); 
        getJp().add(getOde());
        getJp().add(getParaustu());
        getJp().add(getSecilen());
        getJp().add(getUrunno());
        getJp().add(getMiktar());
        getJp().add(getUrunmiktar());
    }
     
    

    public JPanel getJp() {
        if(jp==null){
            jp=new JPanel();
            jp.setBounds(440,85,140,495);
            jp.setLayout(null);
            
        }
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public JLabel getSecilen() {
         if(secilen==null){
              
            secilen=new JLabel();
            secilen.setBounds(25, 145, 90, 120);
            secilen.setToolTipText("secilen ürün budur.");
            
            
            
        }
       
         
        return secilen;
    }

    
    


   
    
    


    public JButton getSec() { // ürünü seçme butonu 
        if(select==null){
            select=new JButton("Seç");
            select.setLayout(null);
            select.setBorderPainted(false);//çerçeveyi sildik
            select.setToolTipText("Girilen Ürünü Seçin");//üstüne geldin mi yorum satırı
            select.setBounds(30, 80,80, 40);
            select.addActionListener(e);
           
            
        }
        return select;
    }

    public JLabel getUrunno() { // ürün no bilgisi veren label 
        if(urunno==null){
            urunno=new JLabel("Ürün No:");
            urunno.setBounds(10, 10, 80, 30);
        }
        return urunno;
    }
    

    public JTextField getVerilen() { // alınıcak ürün kodu sırasıyla 
        if(urunNo==null){
            urunNo=new JTextField(10);
            urunNo.setToolTipText("Almak İstediğiniz Ürünün Kodunu Giriniz.");
            
            urunNo.setBounds(70, 10, 40, 30);
            
        }
        return urunNo;
    }

    public JLabel getMiktar() { // Alınıcak ürün Miktari
        if(miktar==null) {
            miktar=new JLabel("Ürün Mik. :");
            miktar.setToolTipText("Almak istediğiniz ürün miktarini giriniz.");
            miktar.setBounds(10, 43, 65, 30);
        }
        return miktar;
    }

    public JTextField getUrunmiktar() { // alınacak ürün miktarini girdiğimiz kisim
        if(urunmiktar==null){
            urunmiktar=new JTextField("1");
            urunmiktar.setBounds(70, 45, 40, 30);
            
        }
        return urunmiktar;
    }
    
   


    public JLabel getBilgi() { // ürün ücretini yazan label
        if(text1==null){
            text1=new JLabel();
            text1.setBounds(20, 270, 80,40);
            text1.setToolTipText("ürün ücreti :)");
            text1.setText("Ürün Ücreti :");
        }
        return text1;
    }

    public JLabel getUcret() { // ürünü tl olarak düşen kısım
        if(price==null){
            price=new JLabel();
            price.setBounds(94, 275 , 50, 30);
            
            
            
        }
        return price;
    }

     

    public JLabel getBilgi1() { // bakiye yükle bilgisi 
        if(text2==null){
            text2=new JLabel();
            text2.setBounds(20, 290, 150, 50);
            text2.setText("Bakiye Yükleyiniz...");
        }
        return text2;
    }

    public JTextField getBakiye() { // otomata verdiğimiz parayı girdiğimiz kısım
        if(bakiye==null){
            bakiye=new JTextField(10);
            bakiye.setBounds(50, 340, 40, 30);
            bakiye.setToolTipText("Yükleyeceğiniz Para Miktarını Girin.");
           
            
        }
        return bakiye;
    }

    public JButton getOde() { // ödeme yapıcagımız buton 
        if(pay==null){
            pay=new JButton();
            pay.setText("ÖDE");
            pay.setBorderPainted(false);
            pay.setToolTipText("Ödemek İçin Tıklayın.");
            pay.setBounds(30, 380, 80, 40);
            pay.addActionListener(e);
        }
        return pay;
    }

    public JLabel getParaustu() { // para üstünü yazan kısım
        if(remaining==null){
            remaining=new JLabel();
            remaining.setText("Para Üstünüz :)");
            remaining.setToolTipText("Para Üstünü Unutmayın :) :) ");
            remaining.setBounds(20, 440, 150, 40);
        }
        return remaining;
    }

  

    
    

    
    

    

   
    
}
