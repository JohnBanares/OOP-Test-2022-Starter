package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{	
		for(Nematode n:nematodes)
		{
			if (keyCode == LEFT)
			{
				background(0);
				n.render(this);
			}	
		}
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		loadNematodes();
		printNematodes();
		background(0);
		smooth();				
	}

	
	void printNematodes()
	{
		for(Nematode n:nematodes)
		{
			System.out.println(n);
		}
	}
	
	public void drawNematodes()
	{
		for(Nematode n:nematodes)
		{
			if(n.getName() == "Jun")
			{
				text(n.getName(), 400,200);
			}
			else{
				text(n.getName(), 400,700);
			}
		}
	}


	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}


	public void draw()
	{	
		drawNematodes();
		
	}
}
