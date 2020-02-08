package maven.sample;

public class NewYearGift extends Sweets{
	Sweets candies[];
	Chocolates chocos[];
	int weight;
	NewYearGift()
	{
		
	}
	NewYearGift(Sweets candies[],Chocolates chocos[])
	{
		this.candies=candies;
		this.chocos=chocos;
		weight=0;
	}
	void sort_chocolates()
	{
		int n=candies.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i+1;j++)
			{
				if(chocos[j].cost>chocos[j+1].cost)
				{
					Chocolates temp;
					temp=chocos[j];
					chocos[j]=chocos[j+1];
					chocos[j+1]=temp;
				}
			}
		}
	}
	public void find_chocolates()
	{
		System.out.println("Candies in the children's gift whose cost is less than 100 is:");
		for(int i=0;i<chocos.length;i++)
		{
			if(chocos[i].cost>=100)
				break;
			System.out.println("Name:"+chocos[i].name);
			System.out.println("Type:"+chocos[i].type);
			System.out.println("Cost:"+chocos[i].cost);
		}
	}
	void find_weight()
	{
		weight=weight(candies)+weight(chocos);
		System.out.println("Total Weight of childresn's gift is:"+weight);
	}
}
