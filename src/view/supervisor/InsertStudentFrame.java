package view.supervisor;

import model.user.Student;
import funcation.insert.InsertStudent;
import util.JFrameUtilKt;
import util.SetColorKt;
import util.StackFrame;

import javax.swing.*;

/**
 *
 * @author Joki
 */
public class InsertStudentFrame extends StackFrame {

    /**
     * Creates new form InsertAdminFrame
     */
    public InsertStudentFrame() {
        super("");
        initComponents();
        JFrameUtilKt.init(this,370,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        stuNoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stuNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stuTelTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apartNoTextField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_Insert = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        dormTextFiled = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bedNoTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        SetColorKt.setWhite(bt_back,bt_Insert);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stuNoTextField.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("学号");

        stuNameTextField.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("姓名");

        stuTelTextField.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("联系方式");

        apartNoTextField.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("公寓号");

        titleLabel.setFont(new java.awt.Font("微软雅黑", 1, 20)); // NOI18N
        titleLabel.setText("添加学生信息");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel6.setText("注：红色为必填项");

        bt_Insert.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        bt_Insert.setText("添加");
        bt_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_InsertActionPerformed(evt);
            }
        });

        bt_back.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        bt_back.setText("返回");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        dormTextFiled.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("宿舍号");

        bedNoTextField.setFont(new java.awt.Font("新宋体", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("床位号");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(titleLabel)
                                        .addComponent(apartNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dormTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bedNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(bt_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(apartNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dormTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bedNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bt_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void bt_InsertActionPerformed(java.awt.event.ActionEvent evt) {
        Student student = new Student(stuNoTextField.getText(),stuNameTextField.getText(),
                null,stuTelTextField.getText(),null,null,apartNoTextField.getText(),
                dormTextFiled.getText(),Integer.parseInt(bedNoTextField.getText()),null);
        int flag = new InsertStudent().insertStuLive(student);
        if (flag < 0){
            JOptionPane.showMessageDialog(InsertStudentFrame.this,"插入失败");
        }else{
            JOptionPane.showMessageDialog(InsertStudentFrame.this,"插入成功");
            stuNoTextField.setText(null);
            stuNameTextField.setText(null);
            stuTelTextField.setText(null);
            apartNoTextField.setText(null);
            dormTextFiled.setText(null);
            bedNoTextField.setText(null);
        }
    }

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {
        int flag = 0;
        flag = JOptionPane.showConfirmDialog(InsertStudentFrame.this,
                "你确认信息已经提交吗？","提示",JOptionPane.YES_NO_OPTION);
        if (flag == JOptionPane.YES_OPTION){
            InsertStudentFrame.this.dispose();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField apartNoTextField;
    private javax.swing.JTextField bedNoTextField;
    private javax.swing.JButton bt_Insert;
    private javax.swing.JButton bt_back;
    private javax.swing.JTextField dormTextFiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField stuNameTextField;
    private javax.swing.JTextField stuNoTextField;
    private javax.swing.JTextField stuTelTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
