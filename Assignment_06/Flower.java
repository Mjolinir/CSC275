package Assignment_06;

public class Flower extends Plant {
	    //Instance variables
		private String name;
		private String id;
	    private String color;
	    private Boolean thorns;
	    private String smell;
	    	    
	    //Constructor Methods	    	    
	    public Flower()
	    {
	    	name = " ";
	    	id = "Flower";
	    	color = " ";
	        thorns = false;
	        smell = " ";
	    }
	    
	    public Flower(String nm, String uid, String cl, Boolean ht, String sm)
	    {
	    	name = nm;
	    	id = uid;
	    	color = cl;
	    	thorns = ht;
	        smell = sm;
	    }
	    
	    //Mutator methods
	    public void setname(String nm)
	    {
	    	name = nm;
	    }
	    
	    public void setid (String uid)
	    {
	    	id = uid;
	    }
	    
	    public void setcolor (String cl)
	    {
	    	color = cl;
	    }
	    
	    public void setthorns (Boolean ht)
	    {
	        thorns = ht;
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
	    
	    public String getid()
	    {
	        return id;
	    }
	    
	    public String getcolor()
	    {
	        return color;
	    }
	    
	    public Boolean getthorns()
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
	        	  "ID .......:     " + id + "\n" +
	        	  "Color ....:     " + color + "\n" +
	              "Thorns ...:     " + thorns + "\n" +
	              "Smell ....:     " + smell + "\n";

	        return str;
	    }
	}
