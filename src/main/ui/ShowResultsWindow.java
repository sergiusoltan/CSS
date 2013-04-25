package main.ui;

import main.java.ReportGenerator;
import main.java.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;
import java.util.Vector;

public class ShowResultsWindow extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable studentsTable;
    private JButton reportButton;
    List<Student> studentList;

    public ShowResultsWindow() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        updateModel();

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onReportButtonClick();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void setStudentList(){
        //todo: call getStudents;
        studentList = ReportGenerator.staticList;
    }

    private void updateModel(){
        setStudentList();
        DefaultTableModel tableModel = new DefaultTableModel(Student.columnNames,studentList.size());
        Object[][] data = new Object[Student.columnNames.length][Student.columnNames.length];
        for (int i = 0; i < studentList.size(); i++) {
            data[i] = studentList.get(i).getVector();
        }
        tableModel.setDataVector(data,Student.columnNames);
        studentsTable.setModel(tableModel);
    }

    private void onReportButtonClick(){
        MainWindow.onReport();
    }

    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }
}
