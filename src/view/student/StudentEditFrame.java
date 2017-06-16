package view.student;


import model.user.Student;
import funcation.select.SelectStudentsInfo;
import funcation.update.UpdateStudentInfo;
import util.JFrameUtilKt;
import util.SetColorKt;
import util.StackFrame;
import util.UserService;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Joki
 */
public class StudentEditFrame extends StackFrame {
    private Student oldStudent=null;
    /** Creates new form StudentEditSelf */
    public StudentEditFrame() {
        super("");
        initComponents();
        JFrameUtilKt.init(this);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        snoTextField = new javax.swing.JTextField();
        snameTextField = new javax.swing.JTextField();
        ssexTextField = new javax.swing.JTextField();
        stelTextField = new javax.swing.JTextField();
        academicTextField = new javax.swing.JTextField();
        deptTextField = new javax.swing.JTextField();
        apartTextField = new javax.swing.JTextField();
        dormTextField = new javax.swing.JTextField();
        bedTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_update = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        bt_resetPassword = new javax.swing.JButton();
        SetColorKt.setWhite(bt_update,bt_back,bt_resetPassword);


        if (UserService.getInstance().getUserType() == UserService.TYPE_STUDENT){
            snoTextField.setEditable(false);
            snameTextField.setEditable(false);
            apartTextField.setEditable(false);
            dormTextField.setEditable(false);
            bedTextField.setEditable(false);
            fillText(new SelectStudentsInfo().select(UserService.getInstance().getCurrentUser().getNo()));
        }



        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel1.setText("学号");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel2.setText("姓名");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel3.setText("性别");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel4.setText("联系方式");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel5.setText("学院");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel6.setText("专业");

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel7.setText("公寓号");

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel8.setText("宿舍号");

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel9.setText("床位号");

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        jLabel10.setText("家庭地址");

        jLabel11.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        jLabel11.setText("学生信息修改");

        bt_update.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        bt_update.setText("提交");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        bt_back.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        bt_back.setLabel("返回");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_resetPassword.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        bt_resetPassword.setLabel("重置密码");
        bt_resetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_resetPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel3))
                                                        .addComponent(jLabel5))
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9))
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(bedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(snoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(ssexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                                                .addComponent(jLabel4))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(apartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel8))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(academicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel6)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(snameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(deptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(dormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(59, 59, 59))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel11))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(bt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(84, 84, 84)
                                                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(snoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(snameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ssexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(academicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deptTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(apartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bt_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>



    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {
        Student newStudent = new Student(snoTextField.getText(),snameTextField.getText(),
                ssexTextField.getText(),stelTextField.getText(),academicTextField.getText(),
                deptTextField.getText(),apartTextField.getText(),dormTextField.getText(),
                Integer.parseInt(bedTextField.getText()),addressTextField.getText());
        int result = new UpdateStudentInfo().updateByNo(oldStudent.getNo(),newStudent);
        if (result == -1){
            JOptionPane.showMessageDialog(this,"更新失败！请检查输入是否有误");
        }else {
            JOptionPane.showMessageDialog(this,"更新成功！");
            this.dispose();
        }
    }

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {
        int flag = 0;
        flag = JOptionPane.showConfirmDialog(StudentEditFrame.this,
                "你确认信息已经提交吗？","提示",JOptionPane.YES_NO_OPTION);
        if (flag == JOptionPane.YES_OPTION){
            StudentEditFrame.this.dispose();
        }
    }

    private void bt_resetPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void fillText(Student student){
        oldStudent=student;
        snoTextField.setText(student.getNo());
        snameTextField.setText(student.getName());
        ssexTextField.setText(student.getSex());
        stelTextField.setText(student.getTel());
        academicTextField.setText(student.getAcademic());
        deptTextField.setText(student.getDept());
        apartTextField.setText(student.getApartNO());
        dormTextField.setText(student.getDormNo());
        bedTextField.setText(student.getBedNo().toString());
        addressTextField.setText(student.getAddress());
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField academicTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField apartTextField;
    private javax.swing.JTextField bedTextField;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_update;
    private javax.swing.JButton bt_resetPassword;
    private javax.swing.JTextField deptTextField;
    private javax.swing.JTextField dormTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField snameTextField;
    private javax.swing.JTextField snoTextField;
    private javax.swing.JTextField ssexTextField;
    private javax.swing.JTextField stelTextField;
    // End of variables declaration

}
