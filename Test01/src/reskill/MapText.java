package reskill;
import java.util.*;
public class MapText {
   public static void main(String[] args) {
	   Map map=new HashMap();
	   Emp emp=new Emp("001","����");
	   Emp emp4=new Emp("100","�ɸ�");
	   Emp emp2=new Emp("005","����");
	   Emp emp3=new Emp("004","��һ");
	   map.put(emp.getEid(), emp.getEname());
	   map.put(emp4.getEid(), emp4.getEname());
	   map.put(emp2.getEid(), emp2.getEname());
	   map.put(emp3.getEid(), emp3.getEname());
	   Set set=map.keySet();
	   Iterator it=set.iterator();
	   System.out.println("HashMap��ʵ�ֵ�Map���ϣ�����");
	   while(it.hasNext()) {
		   String str=(String)it.next();
		   String name=(String)map.get(str);
		   System.out.println(str+" "+name);
	   }
	   
	   TreeMap treemap=new TreeMap();
	   treemap.putAll(map);
	   Iterator iter=treemap.keySet().iterator();
	   System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
	   while(iter.hasNext()) {
		   String str=(String) iter.next();
		   String name=(String) map.get(str);
		   System.out.println(str+"  "+name);
	   }
   }
}
