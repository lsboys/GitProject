package reskill;
import java.util.*;
public class MapMemo {
   public static void main(String[] args) {
	   Map<String,String> map=new HashMap<String,String>();
	   map.put("1", "apple");
	   map.put("2", "pear");
	   map.put("3", "orange");
	   for(int i=1;i<=3;i++) {
		//   System.out.println("��"+i+"Ԫ����:"+map.get(""+i+""));
		  // String key=Integer.toString(i);
		   System.out.println("��"+i+"Ԫ����:"+map.get(i));
	   }
   }
}
