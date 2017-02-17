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
