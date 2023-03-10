/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JTable;

 
public class Venta {
   
public Integer filaExiste;
  
/*SI EXISTE AUMENTAMOS LA CANTIDAD EN UNO*/

public boolean ExistProd(JTable table,String Data,int col)
{
  boolean verify = false;

  for(int i=0;i<table.getRowCount();i++)
  {
      if(table.getValueAt(i, col).equals(Data))
      {
          verify = true;
          filaExiste=i;
      }
  }
  
  return verify;
}

}
