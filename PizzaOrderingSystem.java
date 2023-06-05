import java.util.*;
class PizzaOrderingSystem 
{
	public static void main(String[] args) 
	{
		int opt;

		//Vegetarian Pizza Object's
		VegPizza v=new VegPizza();
		PeppyPaneer vp=new PeppyPaneer();
		MexicanGreenWave vm=new MexicanGreenWave();
		DeluxeVeggie vd=new DeluxeVeggie();

		//Non-Vegetarian Pizza Object's
		NonVegPizza nv=new NonVegPizza();
		ChickenGoldenDelight nvc=new ChickenGoldenDelight();
		NonVegSupreme nvnv=new NonVegSupreme();
		PepperBarbecueOnion nvpb=new PepperBarbecueOnion();

		Scanner sc=new Scanner(System.in);
		System.out.println("We offer different varieties of veg and non-veg pizza");
		System.out.println("Enter: \nV to explore veg \nNV to explore Non-Veg");
		String s=sc.next();
		if(s.equalsIgnoreCase("v"))
		{
			ChooseVegPizza cv=new ChooseVegPizza();
			System.out.println("Veg Menu: \n1.PeppyPaneer \n2.MexicanGreenWave \n3.DeluxeVeggie");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:cv.selectYourFavouritePizza(vp);                                               
				break;
				case 2:cv.selectYourFavouritePizza(vm);                                              
				break;
				case 3:cv.selectYourFavouritePizza(vd);                                               
				break;
				default:System.out.println("No such variety available");                                                       
				break;
			}

		}
		else if(s.equalsIgnoreCase("nv"))
		{
			ChooseNonVegPizza cnv=new ChooseNonVegPizza();
			System.out.println("Non Veg Menu: \n1.ChickenGoldenDelight \n2.NonVegSupreme \n3.PepperBarbecueOnion");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:cnv.selectYourFavouritePizza(nvc);                                         
				break;
				case 2:cnv.selectYourFavouritePizza(nvnv);                                        
				break;
				case 3:cnv.selectYourFavouritePizza(nvpb);                                        
				break;
				default:System.out.println("No such variety available");                                        
				break;
			}
		}
	}
}

class ChooseVegPizza
{
	public void selectYourFavouritePizza(VegPizza ref)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int num=sc.nextInt();
		ref.addQuantity(num);
		ref.cost();
		}
}


class ChooseNonVegPizza
{
	public void selectYourFavouritePizza(NonVegPizza ref)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int num=sc.nextInt();
		ref.addQuantity(num);
		ref.cost();
	}
}

class VegPizza
{
	int Qty=0;
	int rate;
	void VegPizza()
	{
		System.out.println("A delight for veggie lovers! Choose from our wide range of delicious vegetarian pizzas,it's softer and tastier");
	}

	public void addQuantity(int num)
	{
		Qty+=num;
		System.out.println("Quantity= "+Qty+"No.s");
	}

	public void cost()
	{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
	}
}

class PeppyPaneer extends VegPizza
{
	int rate=150;
	PeppyPaneer()
	{
		System.out.println("Soft Paneer and Hot Pepper Combo-Rs 150/Piece PeppyPaneer");
	}

	public void cost()
	{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
	}
}

class MexicanGreenWave extends VegPizza
{
	int rate=175;
	MexicanGreenWave()
	{
		System.out.println("Sweet and spicy mexican combo-Rs 175/Piece MexicanGreenWave");
	}

	public void cost()
	{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
	}
}

class DeluxeVeggie extends VegPizza
{
	int rate=200;
	DeluxeVeggie()
	{
		System.out.println("High quality veggie treat-Rs 200/Piece DeluxeVeggie");
	}

	public void cost()
	{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
	}
}



class NonVegPizza
{
	int Qty=0;
	int rate;
	void NonVegPizza()
	{
		System.out.println("Non-Veg pizza's high on crusts and toppings");
	}
	
	public void addQuantity(int num)
	{
		Qty+=num;
		System.out.println("Quantity= "+Qty+"No.s");
	}

	public void cost()
		{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
		}
}

class ChickenGoldenDelight extends NonVegPizza
{
	int rate=250;
	ChickenGoldenDelight()
	{
		System.out.println("Fried Chicken-Rs 250/Piece ChickenGoldenDelight");
	}
  
		public void cost()
		{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
		}
}

class NonVegSupreme extends NonVegPizza
{
	int rate=285;
	NonVegSupreme()
	{
		System.out.println("Mixture high on chicken added veggies-Rs 285/Piece NonVegSupreme");
	}
  
		public void cost()
		{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
		}
}

class PepperBarbecueOnion extends NonVegPizza
{
	int rate=325;
	PepperBarbecueOnion()
	{
		System.out.println("Grilled chicken added with onion carvings-Rs 325/Piece PepperBarbecueOnion");
	}

		public void cost()
		{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
		}
}
