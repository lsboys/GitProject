package reskill;
import java.util.*;
public class Gather {
  public static void main(String[] args) {
	  List list=new ArrayList();
	  int i=(int)(Math.random()*(list.size()-1));
	  list.add("a");
	  list.add("b");
	  list.add("c");
	  list.add("d");
	  list.add("e");
	  list.add("f");
	  System.out.println("i="+i);
	  System.out.println("�����ȡ�����е�Ԫ��:"+list.get(i));
	  list.remove(2);
	  System.out.println("��������'2'��Ԫ�ش������Ƴ��������е�Ԫ����:");
	  for(int j=0;j<list.size();j++) {
		  System.out.print(list.get(j)+" ");
	  }
	  
  }
}

