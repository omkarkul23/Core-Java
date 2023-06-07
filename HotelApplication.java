class HotelApplication 
{
	public static void main(String[] args) 
	{
		HotelManagement h=new HotelManagement();
		for(;;)
		{
			System.out.println(" Enter 1. To Choose hotel 2.To order food 3.For bill 4.exit");
             switch(h.sc.nextInt())
			{
				 case 1:
					 h.chooseFood();
					 break;
				  case 2:
					  h.orderFood();
					 break;
				   case 3:
					   h.bill();
					 break;
				    case 4:
						System.exit(1);
					 break;
			 }
		}
	}
}