package view.admin;

import funcation.OperatorAdvice;
import funcation.select.SelectAdminInfo;
import model.user.Admin;
import util.JFrameUtilKt;
import util.SetColorKt;
import util.StackFrame;
import util.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Joki
 */
public class AdminSeeAdviceFrame extends StackFrame {

    private Admin currentAdmin = new SelectAdminInfo().select(UserService.getInstance().getCurrentUser().getNo());

    /**
     * Creates new form AdminSeeAdviceFrame
     */
    public AdminSeeAdviceFrame() {
        super("");
        initComponents();
        JFrameUtilKt.init(this);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adviceTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        adviceTextArea = new javax.swing.JTextArea();
        timeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();

        SetColorKt.setWhite(selectButton);


        adviceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "内容", "时间"
                }
        ));
        jScrollPane1.setViewportView(adviceTable);
        AdviceTableKt.fillTable(adviceTable,new OperatorAdvice().selectApartAdvice(currentAdmin,"any(select date from advice)"));

        adviceTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                adviceTextArea.setText(AdviceTableKt.getAdviceInfo(adviceTable).toString());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                adviceTextArea.setText("");
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        adviceTextArea.setColumns(20);
        adviceTextArea.setRows(5);
        jScrollPane2.setViewportView(adviceTextArea);

        jLabel1.setText("时间");

        selectButton.setText("查询");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = "'" +timeTextField.getText() + "'";
                AdviceTableKt.fillTable(adviceTable,new OperatorAdvice().selectApartAdvice(currentAdmin,date));
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2)
                                                .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable adviceTable;
    private javax.swing.JTextArea adviceTextArea;
    private javax.swing.JButton selectButton;
    private javax.swing.JTextField timeTextField;
    // End of variables declaration
}
