package reskill;
import java.util.*;
public class CollectionDemo3 {
   public static void main(String[] args) {
	   Set<People> hashSet=new HashSet<People>();
	   hashSet.add(new People("��ͬѧ",201101));
	   hashSet.add(new People("��ͬѧ",201102));
	   hashSet.add(new People("��ͬѧ",201103));
	   Iterator<People> it=hashSet.iterator();
	   System.out.println("�����е�Ԫ����:");
	   while(it.hasNext()) {
		   People person=it.next();
		   System.out.println(person.getName()+"  "+person.getid_card());
	   }
   }
}
