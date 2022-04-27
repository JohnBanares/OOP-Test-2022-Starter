package ie.tudublin;



public class Main
{   //C20401442
    public static void nematodeVisualiser()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new NematodeVisualiser());
    }

    
    public static void main(String[] args)
    {
        nematodeVisualiser();
        
    }
}