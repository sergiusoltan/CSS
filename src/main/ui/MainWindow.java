package main.ui;

import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JDialog {
    private JPanel contentPane;
    private JButton buttonCancel;
    private JButton addStudentButton;
    private JButton calculateButton;
    private JButton reportButton;
    private JButton viewStudentsButton;

    public MainWindow() {
        setContentPane(contentPane);
        setLocationRelativeTo(null);
        setModal(true);
        getRootPane().setDefaultButton(buttonCancel);

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        addStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAddStudentButton();
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCalculateButton();
            }
        });

        reportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onReportButton();
            }
        });

        viewStudentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onViewStudentButton();
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

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    private void onAddStudentButton(){
        AddStudentWindow addStudentWindow = new AddStudentWindow();
        addStudentWindow.pack();
        addStudentWindow.setLocationRelativeTo(this);
        addStudentWindow.setVisible(true);
    }

    private void onCalculateButton(){
        //calculate results
        onViewStudentButton();
    }

    private void onReportButton(){
        //generate Report
    }

    private void onViewStudentButton(){
        ShowResultsWindow showResultsWindow = new ShowResultsWindow();
        showResultsWindow.pack();
        showResultsWindow.setLocationRelativeTo(this);
        showResultsWindow.setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow dialog = new MainWindow();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
