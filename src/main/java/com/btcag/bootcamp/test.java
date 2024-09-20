package com.btcag.bootcamp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {

        Object [][] data = {
                {"USA", 1 },
                {"China", 2 },
                {"Germany", 3 },
        };

        String [] collums = {"Skin", "Skinnummer"};
        DefaultTableModel tableModel = new DefaultTableModel(data, collums);

        JTable jtable = new JTable(tableModel);

        JPanel jpanel = new JPanel();
        jpanel.add(new JScrollPane(jtable));

        JButton addButton = new JButton("Skin1");
        JButton addButton1 = new JButton("Skin 2");
        JButton addButton2 = new JButton("Skin 3");


        jpanel.add(addButton);
        jpanel.add(addButton1);
        jpanel.add(addButton2);

        JFrame frame = new JFrame("Skinauswahl");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jpanel);

        frame.pack();
        frame.setVisible(true);
    }
}
