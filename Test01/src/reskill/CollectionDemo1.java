package reskill;
import java.util.*;
public class CollectionDemo1 {
   public static void main(String[] args) {
	   String a="a",b="b",c="c",d="d",apple="apple";
	   List<String> list=new ArrayList<String>();
	   list.add(a);
	   list.add(apple);
	   list.add(b);
	   list.add(apple);
	   list.add(c);
	   list.add(apple);
	   list.add(d);
	   System.out.println(list);
	   System.out.println("apple��һ�γ��ֵ�����λ����:"+list.indexOf(apple));
	   System.out.println("apple���һ�γ��ֵ�����λ����:"+list.lastIndexOf(apple));
	   Iterator<String> it=list.iterator();
	   while(it.hasNext()) {
		   System.out.print(it.next()+" ");
	   }
   }
}
