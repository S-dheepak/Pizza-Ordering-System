import java.util.*;
class PizzaOrderingSystem 
{
	public static void main(String[] args) 
	{
		int opt;
		System.out.println("We offer different varieties of veg and non-veg pizza");
		
		//Vegetarian Pizza Object's
		VegPizza v=new VegPizza();
		v.VegPizza();

		//Non-Vegetarian Pizza Object's
		NonVegPizza nv=new NonVegPizza();
		nv.NonVegPizza();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter: \nV to explore Veg pizza \nNV to explore Non-Veg Pizza");
		String s=sc.next();
		if(s.equalsIgnoreCase("v"))
		{

			ChooseVegPizza cv=new ChooseVegPizza();
			System.out.println("Veg Menu: \n1.PeppyPaneer \n2.MexicanGreenWave \n3.DeluxeVeggie");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:PeppyPaneer vp=new PeppyPaneer();
				       cv.selectYourFavouritePizza(vp); 
					   System.out.println("Do you want to continue exploring veggie menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.MexicanGreenWave \n2.DeluxeVeggie");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:MexicanGreenWave vm=new MexicanGreenWave();
					           cv.selectYourFavouritePizza(vm);
							   System.out.println("Do you want to check out DeluxeVeggie pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   DeluxeVeggie vd=new DeluxeVeggie();
								   cv.selectYourFavouritePizza(vd);                                               
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }

				               case 2:DeluxeVeggie vd=new DeluxeVeggie();
					           cv.selectYourFavouritePizza(vd); 
							   System.out.println("Do you want to check out MexicanGreenWave pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   MexicanGreenWave mw=new MexicanGreenWave();
								   cv.selectYourFavouritePizza(mw);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
							   default:System.out.println("No such variety available");                                                    
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
							   System.out.println("Thank You");
							   break;
					   }
					   break;

				case 2:MexicanGreenWave vm=new MexicanGreenWave();
					   cv.selectYourFavouritePizza(vm);
					   System.out.println("Do you want to continue exploring veggie menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.PeppyPaneer \n2.DeluxeVeggie");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:PeppyPaneer pp=new PeppyPaneer();
					           cv.selectYourFavouritePizza(pp); 
							   System.out.println("Do you want to check out DeluxeVeggie pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   DeluxeVeggie vd=new DeluxeVeggie();
								   cv.selectYourFavouritePizza(vd);                                               
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				              
				               case 2:DeluxeVeggie dv=new DeluxeVeggie();
					           cv.selectYourFavouritePizza(dv);
							   System.out.println("Do you want to check out PeppyPaneer pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   PeppyPaneer pa=new PeppyPaneer();
								   cv.selectYourFavouritePizza(pa);                                               
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
							   default:System.out.println("No such variety available");                                                  
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
						   
							   System.out.println("Thank You");
							   break;
					   }
					   break;

				case 3:DeluxeVeggie vd=new DeluxeVeggie();
					   cv.selectYourFavouritePizza(vd); 
					   System.out.println("Do you want to continue exploring veggie menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.PeppyPaneer \n2.MexicanGreenWave");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:PeppyPaneer pp=new PeppyPaneer();
					           cv.selectYourFavouritePizza(pp);  
							   System.out.println("Do you want to check out MexicanGreenWave pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   MexicanGreenWave mw=new MexicanGreenWave();
								   cv.selectYourFavouritePizza(mw);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				              
				               case 2:MexicanGreenWave mg=new MexicanGreenWave();
					           cv.selectYourFavouritePizza(mg);
							   System.out.println("Do you want to check out PeppyPaneer pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   PeppyPaneer pa=new PeppyPaneer();
								   cv.selectYourFavouritePizza(pa);                                               
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               

				               default:System.out.println("No such variety available");                                                      
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
						   
							   System.out.println("Thank You");
							   break;
					   }
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
				case 1:ChickenGoldenDelight nvc=new ChickenGoldenDelight();
					   cnv.selectYourFavouritePizza(nvc);
					   System.out.println("Do you want to continue exploring non-veg menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.NonVegSupreme \n2.PepperBarbecueOnion");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:NonVegSupreme nvnv=new NonVegSupreme();
					           cnv.selectYourFavouritePizza(nvnv);
							   System.out.println("Do you want to check out PepperBarbecueOnion pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   PepperBarbecueOnion nvpb=new PepperBarbecueOnion();
								   cnv.selectYourFavouritePizza(nvpb);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
				               case 2:PepperBarbecueOnion nvpb=new PepperBarbecueOnion();
					           cnv.selectYourFavouritePizza(nvpb);
							   System.out.println("Do you want to check out NonVegSupreme pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   NonVegSupreme nvs=new NonVegSupreme();
								   cnv.selectYourFavouritePizza(nvs);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
				               default:System.out.println("No such variety available");                                                  
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
							   System.out.println("Thank You");
							   break;
					   }
				       break;

				case 2:NonVegSupreme nvnv=new NonVegSupreme();
					   cnv.selectYourFavouritePizza(nvnv);
					   System.out.println("Do you want to continue exploring non-veg menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.ChickenGoldenDelight \n2.PepperBarbecueOnion");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:ChickenGoldenDelight nvg=new ChickenGoldenDelight();
					           cnv.selectYourFavouritePizza(nvg);
							   System.out.println("Do you want to check out PepperBarbecueOnion pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   PepperBarbecueOnion nvpb=new PepperBarbecueOnion();
								   cnv.selectYourFavouritePizza(nvpb);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
				               case 2:PepperBarbecueOnion nvpb=new PepperBarbecueOnion();
					           cnv.selectYourFavouritePizza(nvpb);
							   System.out.println("Do you want to check out ChickenGoldenDelight pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   ChickenGoldenDelight nvgd=new ChickenGoldenDelight();
								   cnv.selectYourFavouritePizza(nvgd);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
				               default:System.out.println("No such variety available");                                                        
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
							   System.out.println("Thank You");
							   break;
					   }
				       break;

				case 3:PepperBarbecueOnion nvpb=new PepperBarbecueOnion();
					   cnv.selectYourFavouritePizza(nvpb);
					   System.out.println("Do you want to continue exploring non-veg menu? Y/N");
					   s=sc.next();
					   if(s.equalsIgnoreCase("y"))
				       {
						   System.out.println("\n1.ChickenGoldenDelight \n2.NonVegSupreme");
						   opt=sc.nextInt();
						   switch(opt)
						   {
							   case 1:ChickenGoldenDelight nvg=new ChickenGoldenDelight();
					           cnv.selectYourFavouritePizza(nvg);
							   System.out.println("Do you want to check out NonVegSupreme pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   NonVegSupreme nvs=new NonVegSupreme();
								   cnv.selectYourFavouritePizza(nvs);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				               
				               case 2:NonVegSupreme nvs=new NonVegSupreme();
					           cnv.selectYourFavouritePizza(nvs);
							   System.out.println("Do you want to check out ChickenGoldenDelight pizza? Y/N");
							   s=sc.next();
					           if(s.equalsIgnoreCase("y"))
							   {
								   ChickenGoldenDelight nvgd=new ChickenGoldenDelight();
								   cnv.selectYourFavouritePizza(nvgd);
				                   break;
							   }
							   else{
								    System.out.println("Thank you");
				                    break;
							        }
				             
				               default:System.out.println("No such variety available");                                                      
				               break;
						   }
					   }
					   else if(s.equalsIgnoreCase("n"))
				       {
							   System.out.println("Thank You");
							   break;
					   }
				       break;

				       default:System.out.println("No such variety available");                                                            
				       break;
			}
		}

		else
			{
			System.out.println("No such option available");
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
		System.out.println("Soft Paneer and Hot Pepper Combo-Rs 150/Piece");
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
		System.out.println("Sweet and spicy mexican combo-Rs 175/Piece");
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
		System.out.println("High quality veggie treat-Rs 200/Piece");
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
		System.out.println("Fried Chicken-Rs 250/Piece");
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
		System.out.println("Mixture high on chicken added veggies-Rs 285/Piece");
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
		System.out.println("Grilled chicken added with onion carvings-Rs 325/Piece");
	}
		
	public void cost()
		{
		rate*=Qty;
		System.out.println("Cost=Rs."+rate);
		}
}
