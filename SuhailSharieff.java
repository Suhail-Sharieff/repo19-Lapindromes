import java.util.*;
import java.util.stream.Stream;
import java.lang.*;
import java.io.*;

public class SuhailSharieff {
  public static void main(String[] args) throws java.lang.Exception {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    for (int v = 0; v < t; v++) {
      String s=sc.next();
      List<Character>l1=new ArrayList<>();
      List<Character>l2=new ArrayList<>();
      
      int len=s.length();
      if (len%2==0) {
        for (int i = 0; i < (len/2); i++) {
          l1.add(s.charAt(i));
          
        }
        for (int i = (len/2); i < len; i++) {
          l2.add(s.charAt(i));
        }
      }
      else{
        for (int i = 0; i < ((len-1)/2); i++) {
          l1.add(s.charAt(i));
        }
        for (int i = (((len-1)/2)+1); i < len; i++) {
          l2.add(s.charAt(i));
        }

      }


      Collections.sort(l1);
      Collections.sort(l2);
      boolean b=false;
      System.out.println(l1+" "+l2);
      for (int i = 0; i < l1.size(); i++) {
        if (l1.get(i)!=l2.get(i)) {
          b=true;break;
        }
      }
      if (b) {
        System.out.println("NO");

      }else{
        System.out.println("YES");
      }




    }
  }
}
