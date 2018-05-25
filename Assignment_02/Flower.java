package Assignment_02;

public class Flower {
	    //Instance variables
	    private String name;
	    private String color;
	    private String thorns;
	    private String smell;
	    
	    //Constructor Methods
	    public Flower(String string)
	    {
	        name = " ";
	        color = " ";
	        thorns = " ";
	        smell = " ";
	    }
	    
	    public Flower(String nm, String cl, String ht, String sm)
	    {
	    	name = nm;
	    	color = cl;
	    	thorns = ht;
	        smell = sm;
	    }
	    
	    //Mutator methods
	    public void setname (String fn)
	    {
	        name = fn;
	    }
	    
	    public void setcolor (String ln)
	    {
	    	name = ln;
	    }
	    
	    public void setthorns (String mj)
	    {
	        thorns = mj;
	    }
	    
	    public void setsmell (String sm)
	    {
	        smell = sm;
	    }
	    	        
	    //Accessor methods
	    public String getname()
	    {
	        return name;
	    }
	    
	    public String getcolor()
	    {
	        return color;
	    }
	    
	    public String getthorns()
	    {
	        return thorns;
	    }
	    
	    public String getsmell()
	    {
	        return smell;
	    }
	     
	    //Other methods
	    public String toString()
	    {
	        String str;
	        str = "Name .....:     " + name + "\n" +
	              "Color ....:     " + color + "\n" +
	              "Thorns ...:     " + thorns + "\n" +
	              "Smell ....:     " + smell + "\n";

	        return str;
	    }
	}
