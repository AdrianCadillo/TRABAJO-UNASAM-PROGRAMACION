/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danilo
 */
public class Validate {
  
/*VALIDA LA EXISTENCIA EN JTABLE*/
    
public boolean Exist(JTable table,String Data,int col)
{
  boolean verify = false;

  for(int i=0;i<table.getRowCount();i++)
  {
      if(table.getValueAt(i, col).equals(Data))
          verify = true;
  }
  
  return verify;
}

/*Limpiar Tabla*/

public void ClearTable(DefaultTableModel modelTabla)
{
    while(modelTabla.getRowCount()>0)
    {
        modelTabla.removeRow(0);
    }
}

/*OBTENER ESTUDIANTES % DE ESTUDIANTES APROBADOS y Desaprobados*/

public String EstudentAprob_Desaprob(JTable Tabla,int col,String condicion,Integer Total_est)
{
 String Porcentaje ="";
 
    DecimalFormat formato = new DecimalFormat("#.##");
 
 Double Contador =0.00;
 
 Double Porcentaje_ = 0.00;
 for(int i=0;i<Tabla.getRowCount();i++)
 {
     if(Tabla.getValueAt(i, col).equals(condicion))
     {
         Contador++;
         
     }
     
 }
 
 
 
 Porcentaje_ = Contador/Total_est;
 
 Porcentaje =formato.format( Porcentaje_*100)+"%";
 
 return Porcentaje;
}

 

 
}
