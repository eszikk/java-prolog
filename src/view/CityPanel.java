/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author Krisztian
 */
public class CityPanel extends javax.swing.JPanel {
    private final Integer height=500;
    private final Integer width=200;
    /**
     * Creates new form CityPanel
     */
    public CityPanel() {
        this.setSize(width, height);
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

        btnGrp = new javax.swing.ButtonGroup();
        rbtnNew = new javax.swing.JRadioButton();
        rbtnModDel = new javax.swing.JRadioButton();
        cmbCity = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCoordX = new javax.swing.JTextField();
        txtCoordY = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrp.add(rbtnNew);
        rbtnNew.setText("New");
        add(rbtnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, -1, -1));

        btnGrp.add(rbtnModDel);
        rbtnModDel.setText("Delete");
        add(rbtnModDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 7, -1, -1));

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 158, -1));

        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, -1));

        txtName.setText("jTextField1");
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 158, -1));

        txtCoordX.setText("jTextField1");
        add(txtCoordX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 158, -1));

        txtCoordY.setText("Coord X:");
        add(txtCoordY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, -1, -1));

        jTextField3.setText("jTextField1");
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, 158, -1));

        jLabel3.setText("Coord Y:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        btnSave.setText("Save");
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 158, -1));

        btnDelete.setText("Delete");
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 158, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton rbtnModDel;
    private javax.swing.JRadioButton rbtnNew;
    private javax.swing.JTextField txtCoordX;
    private javax.swing.JLabel txtCoordY;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
