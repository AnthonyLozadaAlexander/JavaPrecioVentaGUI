/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainWindow;

import igu.PrecioVentaIGU;
import com.formdev.flatlaf.FlatIntelliJLaf;

/**
 *
 * @author zDefcon
 */
public class MainPrecioVenta {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      FlatIntelliJLaf.setup();
      PrecioVentaIGU Window = new PrecioVentaIGU();
      Window.setVisible(true);
      Window.setResizable(false);
      Window.setLocationRelativeTo(null);
  }
  
}
