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
		
		for(int i = 0; i<nematodes.size();i++)
		{	
			//if doesnt work here
			if(nematodes.get(i).name == "Jun")
			{
				text(nematodes.get(i).name, 400,200);
			}
			else{
				text(nematodes.get(i).name, 400,200);
			}
		}

		//jun
		text(nematodes.get(0).name,200,200);

		circle(200, 220, 20);
		stroke(255);
		line(180,220,220,220);
		
		circle(200, 240, 20);
		stroke(255);
		line(180,240,220,240);
		
		circle(200, 260, 20);
		stroke(255);
		line(180,260,220,260);
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
		/*
		String name = "Jack";
		textAlign(CENTER);
		text(name, 400,400);*/
		//circle(162, 184, 220);
		//text(nematodes.name(1), 400,400);
		//background(0);
		/*
		for(Nematode n:nematodes)
		{
			if(n.getName() == "Jun")
			{
				n.render(this);
				
				textAlign(CENTER);
				text(n.render(this), 400,400);
			}
		}*/
	}
}
