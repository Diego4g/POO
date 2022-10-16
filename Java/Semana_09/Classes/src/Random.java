import java.util.*;

public class Random {
  public static void myRandomMath(int m_ini, int m_final) {
    int tot = (m_final - m_ini) + 1;
    int n;
    int hist[] = new int[tot];

    for (int i =0; i < 10000; i++){
      n = (int) (Math.random()*(m_final - m_ini + 1));
      hist[n]++;
    }
    print(hist);
  }

  public static void print(int[] v) {
    for (int elem:v)
      System.out.println(elem + " ");
  }
}
