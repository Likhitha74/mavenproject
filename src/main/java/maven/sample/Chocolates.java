package maven.sample;

public class Chocolates  {
	  String type;
	  String name;
	  int cost;
	  Chocolates()
	  {
		  
	  }
	  Chocolates(String name,String type,int cost)
	  {
		  this.name=name;
		  this.type=type;
		  this.cost=cost;
	  }
	   int weight(Chocolates chocos[])
	  {
		  int weight=0;
		  for(int i=0;i<chocos.length;i++)
		  {
			  weight+=chocos[i].cost;
		  }
		  return weight;
	  }
	}
