package reskill;
import java.util.*;
public class GeneralForDemo {
   public static void main(String[] args) {
	   List<Integer> list=new ArrayList<Integer>();
	   for(int i=0;i<10;i++) {
		   list.add(i);
		   
	   }
	   System.out.println("�б��е�Ԫ��:"+list);
	   System.out.println("�б��е��������Ԫ��:");
	   for(int i=1;i<list.size();i+=2) {
		   System.out.print(list.get(i)+" ");
	   }
   }
}
