package reskill;

public class SellOutClass {
   private String name;
   public SellOutClass() {
	   name="ƻ��";
   }
   public void sell(int price) {
	   class Apple {
		   int innerPrice=0;
		   public Apple(int price) {
			   innerPrice=price;
		   }
		   public void price() {
			   System.out.println("���ڿ�ʼ����"+name);
			   System.out.println("����Ϊ:"+innerPrice+"Ԫ");
		   }
	   }
	   Apple apple=new Apple(price);
	   apple.price();
   }
   public static void main(String[] args) {
	   SellOutClass sample=new SellOutClass();
	   sample.sell(100);
   }
}
