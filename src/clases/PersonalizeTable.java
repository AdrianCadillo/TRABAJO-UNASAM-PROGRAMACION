/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Danilo
 */
public class PersonalizeTable extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
         JLabel label = (JLabel)  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
      
           if(value instanceof String)
         {
             String data =(String)value;
             
             label.setFont(new Font("Arial", 13, 14));
             if(data.equals("APROBADO"))
             {
              label.setBackground(Color.GREEN);
              
              label.setForeground(Color.BLACK);
             }else{
                 if(data.equals("EXCELENTE"))
                 {
                     label.setBackground(Color.blue);
                     
                     label.setForeground(Color.white);
                 }else{
                     label.setBackground(Color.red);
                 }
             }
         }
           
         return label;
    }
    
}
