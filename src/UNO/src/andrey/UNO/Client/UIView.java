/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrey.UNO.Client;
import andrey.UNO.Card.Card;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author andrey
 */
public class UIView extends javax.swing.JFrame implements IView {

    /**
     * Creates new form UIView
     */
    public UIView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        lastCard = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 764));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 764));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BlackColorchange.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BlackColorchange.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BlackColorchange.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BlackColorchange.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BlackColorchange.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15);

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17);

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18);

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19);

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20);

        jScrollPane1.setViewportView(jPanel3);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 590, 660, 140);
        getContentPane().add(lastCard);
        lastCard.setBounds(470, 90, 60, 90);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 160, 250, 430);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 740);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 741);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(1).color;
        String value = cardList.get(1).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(0).color;
        String value = cardList.get(0).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(2).color;
        String value = cardList.get(2).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(3).color;
        String value = cardList.get(3).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(4).color;
        String value = cardList.get(4).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(5).color;
        String value = cardList.get(5).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(6).color;
        String value = cardList.get(6).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(7).color;
        String value = cardList.get(7).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(8).color;
        String value = cardList.get(8).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(9).color;
        String value = cardList.get(9).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(10).color;
        String value = cardList.get(10).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(11).color;
        String value = cardList.get(11).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(12).color;
        String value = cardList.get(12).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(13).color;
        String value = cardList.get(13).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(14).color;
        String value = cardList.get(14).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(15).color;
        String value = cardList.get(15).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(16).color;
        String value = cardList.get(16).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(17).color;
        String value = cardList.get(17).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(18).color;
        String value = cardList.get(18).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        String color = cardList.get(19).color;
        String value = cardList.get(19).value;
        try {
            client.sendCard(color, value);
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        gameloop2();
    }//GEN-LAST:event_jButton20ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lastCard;
    // End of variables declaration//GEN-END:variables

    IClient client;
    public int buttonIndex = 0;
    public ArrayList<JButton> buttonList;
    public ArrayList<Card> cardList;
    public void setClient(IClient client) {
        this.client = client;
        cardList = new ArrayList<>();
        buttonList = new ArrayList<>();
        buttonList.add(jButton1);
        buttonList.add(jButton2);
        buttonList.add(jButton3);
        buttonList.add(jButton4);
        buttonList.add(jButton6);
        buttonList.add(jButton5);
        buttonList.add(jButton7);
        buttonList.add(jButton8);
        buttonList.add(jButton9);
        buttonList.add(jButton10);
        buttonList.add(jButton11);
        buttonList.add(jButton12);
        buttonList.add(jButton13);
        buttonList.add(jButton14);
        buttonList.add(jButton15);
        buttonList.add(jButton16);
        buttonList.add(jButton17);
        buttonList.add(jButton18);
        buttonList.add(jButton19);
        buttonList.add(jButton20);
        
    }

    public void retrieveCard(String color, String value) {
        lastCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + color + value +".png")));
    }

    public void retrieveDeckCount(int playerID, int cardsLeft){
        String string = "Player "+ playerID+ " tiene " + cardsLeft + " cartas";
        jTextArea1.setText(string);
    }

    public void receiveMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void printCards(String color, String value) {
        try {
            cardList.add(new Card(color, value));
        } catch (RemoteException ex) {
            Logger.getLogger(UIView.class.getName()).log(Level.SEVERE, null, ex);
        }
        buttonList.get(buttonIndex++).setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/" + color + value +".png")));
        
    }

    public void gameloop() {

    }
    
    public void gameloop2(){
        cardList.clear();
        buttonIndex = 0;
    }

    public void gamewon() {
        JOptionPane.showMessageDialog(null, "You won !!");
    }
}

