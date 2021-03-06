import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import DrawHelpers.DrawPanel;

public class MyJFrame extends javax.swing.JFrame {

  /** Creates new form MyJFrame */
  public MyJFrame() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jPopupMenu1 = new javax.swing.JPopupMenu();
    jDialog1 = new javax.swing.JDialog();
    jDialog2 = new javax.swing.JDialog();
    jPanelRed = new javax.swing.JPanel();
    jPanelGreen = new javax.swing.JPanel();
    jPanelBlue = new javax.swing.JPanel();
    jPanelYellow = new javax.swing.JPanel();
    jPanelAqua = new javax.swing.JPanel();
    jPanelBlack = new javax.swing.JPanel();
    jLabelColor = new javax.swing.JLabel();
    jButtonClose = new javax.swing.JButton();
    jLabelShapes = new javax.swing.JLabel();
    drawPanel = new DrawPanel(new JLabel());
    jLabelCircle = new javax.swing.JLabel();
    jLabelLine = new javax.swing.JLabel();
    jLabelRectangle = new javax.swing.JLabel();
    jCheckBoxFilled = new javax.swing.JCheckBox();
    jMenuBarFile = new javax.swing.JMenuBar();
    jMenuSave = new javax.swing.JMenu();
    jMenuItemSave = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();
    jMenuItemExit = new javax.swing.JMenuItem();
    jMenu3 = new javax.swing.JMenu();
    jMenu4 = new javax.swing.JMenu();
    jMenuItemRedo = new javax.swing.JMenuItem();
    jMenuItemUndo = new javax.swing.JMenuItem();
    clear = new javax.swing.JMenuItem();
    ButtonHandler buttonHandler = new ButtonHandler();
    ColorHandler colorHandler = new ColorHandler();

    jMenu1.setText("jMenu1");

    jMenuItem1.setText("jMenuItem1");
    jMenu1.add(jMenuItem1);

    javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
    jDialog1.getContentPane().setLayout(jDialog1Layout);
    jDialog1Layout.setHorizontalGroup(
        jDialog1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE));
    jDialog1Layout.setVerticalGroup(
        jDialog1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE));

    javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
    jDialog2.getContentPane().setLayout(jDialog2Layout);
    jDialog2Layout.setHorizontalGroup(
        jDialog2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE));
    jDialog2Layout.setVerticalGroup(
        jDialog2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(0, 204, 204));

    jPanelRed.setBackground(new java.awt.Color(255, 102, 102));
    jPanelRed.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelRedLayout = new javax.swing.GroupLayout(jPanelRed);
    jPanelRed.setLayout(jPanelRedLayout);
    jPanelRedLayout.setHorizontalGroup(
        jPanelRedLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelRedLayout.setVerticalGroup(
        jPanelRedLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jPanelGreen.setBackground(new java.awt.Color(153, 255, 51));
    jPanelGreen.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelGreenLayout = new javax.swing.GroupLayout(jPanelGreen);
    jPanelGreen.setLayout(jPanelGreenLayout);
    jPanelGreenLayout.setHorizontalGroup(
        jPanelGreenLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelGreenLayout.setVerticalGroup(
        jPanelGreenLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jCheckBoxFilled.addItemListener(
        e -> {
          boolean checkFill = jCheckBoxFilled.isSelected() ? true : false; //
          drawPanel.setCurrentShapeFilled(checkFill);
        });

    jPanelBlue.setBackground(new java.awt.Color(51, 51, 255));
    jPanelBlue.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
    jPanelBlue.setLayout(jPanelBlueLayout);
    jPanelBlueLayout.setHorizontalGroup(
        jPanelBlueLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelBlueLayout.setVerticalGroup(
        jPanelBlueLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jPanelYellow.setBackground(new java.awt.Color(255, 255, 0));
    jPanelYellow.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelYellowLayout = new javax.swing.GroupLayout(jPanelYellow);
    jPanelYellow.setLayout(jPanelYellowLayout);
    jPanelYellowLayout.setHorizontalGroup(
        jPanelYellowLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelYellowLayout.setVerticalGroup(
        jPanelYellowLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jPanelAqua.setBackground(new java.awt.Color(51, 255, 255));
    jPanelAqua.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelAquaLayout = new javax.swing.GroupLayout(jPanelAqua);
    jPanelAqua.setLayout(jPanelAquaLayout);
    jPanelAquaLayout.setHorizontalGroup(
        jPanelAquaLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelAquaLayout.setVerticalGroup(
        jPanelAquaLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jPanelBlack.setBackground(new java.awt.Color(0, 0, 0));
    jPanelBlack.addMouseListener(colorHandler);

    javax.swing.GroupLayout jPanelBlackLayout = new javax.swing.GroupLayout(jPanelBlack);
    jPanelBlack.setLayout(jPanelBlackLayout);
    jPanelBlackLayout.setHorizontalGroup(
        jPanelBlackLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE));
    jPanelBlackLayout.setVerticalGroup(
        jPanelBlackLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE));

    jLabelColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabelColor.setText("Colors:");

    jButtonClose.setText("Close");
    jButtonClose.addActionListener(
        new ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCloseActionPerformed(evt);
          }
        });

    jLabelShapes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
    jLabelShapes.setText("Shapes:");

    drawPanel.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
    drawPanel.setLayout(drawPanelLayout);
    drawPanelLayout.setHorizontalGroup(
        drawPanelLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE));
    drawPanelLayout.setVerticalGroup(
        drawPanelLayout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE));

    jLabelCircle.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/images/oval.png"))); // NOI18N
    jLabelCircle.addMouseListener(buttonHandler);

    jLabelLine.setIcon(
        new javax.swing.ImageIcon(getClass().getResource("/images/line.png"))); // NOI18N
    jLabelLine.addMouseListener(buttonHandler);

    jLabelRectangle.setIcon(
        new javax.swing.ImageIcon(
            getClass().getResource("/images/rect.png"))); // NOI18N
    jLabelRectangle.addMouseListener(buttonHandler);

    jCheckBoxFilled.setBackground(new java.awt.Color(204, 204, 204));
    jCheckBoxFilled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jCheckBoxFilled.setText("Filled");
    jCheckBoxFilled.setActionCommand("Filled");

    jMenuSave.setText("File");
    jMenuSave.addActionListener(
        new ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuSaveActionPerformed(evt);
          }
        });



    jMenuItemExit.setText("Exit");
    //        jMenuItemExit.addMouseListener(new java.awt.event.MouseAdapter() {
    //            public void mouseClicked(java.awt.event.MouseEvent evt) {
    //                jMenuItemExitMouseClicked(evt);
    //            }
    //        });
    jMenuItemExit.addActionListener(
        new ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItemExitActionPerformed(evt);
          }
        });
    jMenuSave.add(jMenuItemExit);

    jMenuBarFile.add(jMenuSave);

    jMenu3.setText("Edit");

    jMenuItemRedo.setText("Redo");
    jMenuItemRedo.addActionListener(
            evt -> drawPanel.redoLastShape());
    jMenu3.add(jMenuItemRedo);


    jMenuItemUndo.setText("Undo");
    jMenuItemUndo.addActionListener(
            evt -> drawPanel.clearLastShape());
    jMenu3.add(jMenuItemUndo);

    clear.setText("Clear");
    clear.addActionListener(
            evt -> drawPanel.clearDrawing());
    jMenu3.add(clear);

    jMenuBarFile.add(jMenu3);

    setJMenuBar(jMenuBarFile);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.LEADING,
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(
                                        drawPanel,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.LEADING,
                                layout
                                    .createSequentialGroup()
                                    .addGap(1193, 1193, 1193)
                                    .addComponent(
                                        jButtonClose,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 222, Short.MAX_VALUE))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap(
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelShapes)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        jLabelCircle,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(
                                        jLabelRectangle,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        59,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelLine)
                                    .addGap(80, 80, 80)
                                    .addComponent(jCheckBoxFilled)
                                    .addGap(70, 70, 70)
                                    .addComponent(jLabelColor)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jPanelGreen,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jPanelYellow,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jPanelBlue,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        jPanelRed,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jPanelBlack,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        jPanelAqua,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(615, 615, 615)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jPanelRed,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jPanelGreen,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jPanelBlue,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelColor)
                                                    .addComponent(jCheckBoxFilled))
                                            .addComponent(
                                                jLabelLine,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                15,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                jPanelYellow,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jPanelAqua,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jPanelBlack,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelShapes)
                                            .addComponent(
                                                jLabelCircle,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                58,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRectangle))))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                    .addComponent(
                        drawPanel,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(
                        jButtonClose,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        36,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(69, 69, 69)));

    pack();
  } // </editor-fold>

  private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {
    System.exit(0);
  }

  
  private void jMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:

  }


  private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    System.exit(0);
  }



  

  @Override
  public boolean isResizable() {
    return super.isResizable(); //To change body of generated methods, choose Tools | Templates.
  }

  private class ColorHandler implements MouseListener {
    JPanel[] colors = {jPanelAqua,jPanelBlue,jPanelBlack,jPanelGreen,jPanelRed,jPanelYellow};

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      drawPanel.setCurrentShapeColor(e.getComponent().getBackground());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (JPanel color : colors) {
            if (color.equals(e.getComponent())) {
                color.setBorder(new BevelBorder(BevelBorder.RAISED));
            } else {
                color.setBorder(null);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
  }

  private class ButtonHandler implements MouseListener {
    JLabel[] shapes = {jLabelCircle, jLabelRectangle, jLabelLine};

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
      if (e.getComponent().equals(jLabelLine)) {
        drawPanel.setCurrentShapeType(0);
      } else if (e.getComponent().equals(jLabelRectangle)) {
        drawPanel.setCurrentShapeType(1);
      } else if (e.getComponent().equals(jLabelCircle)) {
        drawPanel.setCurrentShapeType(2);
      }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      for (JLabel shape : shapes) {
        if (shape.equals(e.getComponent())) {
            shape.setBorder(new BevelBorder(BevelBorder.RAISED));
        } else {
            shape.setBorder(null);
        }
      }
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
  }

  /** @param args the command line arguments */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
          javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MyJFrame.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MyJFrame.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MyJFrame.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MyJFrame.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> new MyJFrame().setVisible(true));
  }

  // Variables declaration - do not modify
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButtonClose;
  private javax.swing.JCheckBox jCheckBoxFilled;
  private javax.swing.JDialog jDialog1;
  private javax.swing.JDialog jDialog2;
  private javax.swing.JLabel jLabelCircle;
  private javax.swing.JLabel jLabelColor;
  private javax.swing.JLabel jLabelLine;
  private javax.swing.JLabel jLabelRectangle;
  private javax.swing.JLabel jLabelShapes;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenuBar jMenuBarFile;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JMenuItem clear;
  private javax.swing.JMenuItem jMenuItemExit;
  private javax.swing.JMenuItem jMenuItemRedo;
  private javax.swing.JMenuItem jMenuItemSave;
  private javax.swing.JMenuItem jMenuItemUndo;
  private javax.swing.JMenu jMenuSave;
  private javax.swing.JPanel jPanelAqua;
  private javax.swing.JPanel jPanelBlack;
  private javax.swing.JPanel jPanelBlue;
  private DrawPanel drawPanel;
  private javax.swing.JPanel jPanelGreen;
  private javax.swing.JPanel jPanelRed;
  private javax.swing.JPanel jPanelYellow;
  private javax.swing.JPopupMenu jPopupMenu1;

  // End of variables declaration
}
