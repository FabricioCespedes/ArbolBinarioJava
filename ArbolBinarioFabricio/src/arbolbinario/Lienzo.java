package arbolbinario;


import Clases.Arbol;
import Clases.Nodo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

    private Arbol arbolGrafico;
   public static final int DIAMETRO=30;
   public static final int RADIO=DIAMETRO/2;
   public static final int ANCHO=50;

  
   public void setarbolGrafico(Arbol arbolGrafico){
      this.arbolGrafico=arbolGrafico;   
      repaint();
   }
   @Override
   public void paint(Graphics g){
      super.paint(g);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
      pintar(g,(getWidth()/2),20,arbolGrafico.getRaiz());
   }
   private void pintar(Graphics g,int x,int y, Nodo raiz){
      if(raiz==null){
      
      }else{
         int EXTRA=raiz.nodosCompletos(raiz)*(ANCHO/2); //Establece separación entre los nodos de un nivel
         g.drawOval(x-10,y,DIAMETRO,DIAMETRO);
         g.drawString(String.valueOf(raiz.getDato()),x-2,y+18);
         if(raiz.getIzq()!=null){
            g.setColor(new Color(0,0,0));
            g.drawLine(x-23+RADIO,y+8+RADIO,x-4-ANCHO-EXTRA+RADIO,y-12+ANCHO+RADIO);
         }
         if(raiz.getDer()!=null){
            g.setColor(new Color(0,0,0)); 
            g.drawLine(x+4+RADIO,y+5+RADIO,x-18+ANCHO+EXTRA+RADIO,y-10+ANCHO+RADIO);
         }
         pintar(g,x-ANCHO-EXTRA,y+2+ANCHO,raiz.getIzq());
         pintar(g,x+ANCHO+EXTRA,y+2+ANCHO,raiz.getDer());
      }
   }
}
