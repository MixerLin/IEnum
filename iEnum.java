import java.util.*;
class iEnum
{
	enum Device{
		pc,laptop,server,mobile
	}
	
		public static void main(String args[])
		{
			MyEnum me = new MyEnum();
			// Добавляем элементы
			me.add("pc");
			me.add("laptop");
			me.add("server");
			me.add("mobile");
			
			for(int i=0; i<me.getIndex();i++)
			System.out.println(me.get(i));
			
				System.out.println("Hello");
		}
}

class MyEnum
{
	private List<String> list = new ArrayList<String>();
	
	public void add(String str)
	{
		list.add(str);
	}
	
	public String get(int index)
	{
		return list.get(index);
	}
	
	public int getIndex()
	{
		return list.size();
	}
}
