package reskill;
import java.util.*;
public class CollectionDemo2 {
   public static void main(String[] args) {
	   List<String> list=new ArrayList<String>();
	   list.add("apple");
	   list.add("pear");
	   list.add("banana");
	   list.add("apple");
	   list.add("oranage");
	   Set<String> set=new HashSet<String>();
	   set.addAll(list);
	   Iterator<String> it=set.iterator();
	   System.out.println("�����е�Ԫ����:");
	   while (it.hasNext()) {
		   System.out.print(it.next()+"\t");
	   }
   }
}
