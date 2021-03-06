//15D8102011G Masubuchi Yoshiki
import java.awt.*;
import javax.swing.*;
import java.util.Random;


public class Ex01d extends JFrame {
  private MyPanel sp;
  public static void main(String[] args){
    Ex01d sm = new Ex01d();
  }
  public Ex01d(){
    super("Ex01d");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500,500);
    sp = new MyPanel();
    add(sp, BorderLayout.CENTER);
    setVisible(true);
  }
  public class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      double n0[] = {0,0};
      double n1[] = {0,0};
      double scale = 400;
      int dx,dy;
      int N = 100000;
      double a1[][] = {{0.5,0.288675}, {0.288675, -0.5}};
      double a2[][] = {{-0.5,-0.288675}, {0.288675, -0.5}};
      double b1[] = {0,0};
      double b2[] = {1,0};

      for(int k = 0; k<N; k ++){

        Random rnd = new Random();
        int flag = rnd.nextInt(2);
        if (flag == 0){
          n1 = cal(n0,a1,b1);
        }else{
          n1 = cal(n0,a2,b2);
        }
        dx = (int)(n1[0]*scale);
        dy = (int)(n1[1]*scale);
        g.drawLine(dx, dy, dx, dy);

        n0 = n1;
      }
    }
    private double[] cal(double[] n,double[][] a,double[] b){
      double tmp[] = {0,0};
      for (int i=0;i<2;i++) {
        tmp[i] = a[i][0]*n[0] + a[i][1] * n[1] + b[i];
      }
      return tmp;
    }
  }
}
