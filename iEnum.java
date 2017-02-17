import java.util.*;
class iEnum
{
	enum Device{
		pc,laptop,server,mobile
	}
	
		public static void main(String args[])
		{
			for(Device dev : Device.values())
			{
				System.out.println(dev);
			}
				System.out.println("Hello");
		}
}

class MyEnum
{
	List<String> list = new ArrayList<String>();
	
	public void add(String str)
	{
		list.add(str);
	}
	
	public String get(int index)
	{
		return list.get(index);
	}
}
