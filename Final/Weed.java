package Final;

public class Weed extends Plant {
	    //Instance variables
		private String name;
		private String id;
	    private String color;
	    private Boolean poisonous;
	    private Boolean edible;
	    private Boolean medicinal;
	    
	    //Constructor Methods
	    public Weed()
	    {
	    	name = " ";
	    	id = "Weed";
	    	color = " ";
	        poisonous = false;
	        edible = false;
	        medicinal = false;
	    }
	    
	    public Weed(String nm, String uid, String cl, Boolean ps, Boolean ed, Boolean md)
	    {
	    	name = nm;
	    	id = uid;
	    	color = cl;
	    	poisonous = ps;
	    	edible = ed;
	    	medicinal = md;
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
	    
	    public void setpoisonous (Boolean ps)
	    {
	        poisonous = ps;
	    }
	    
	    public void setedible (Boolean ed)
	    {
	    	edible = ed;
	    }
	    
	    public void setmedicinal (Boolean md)
	    {
	    	medicinal = md;
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
	    
	    public Boolean getpoisonous()
	    {
	        return poisonous;
	    }
	    
	    public Boolean getedible()
	    {
	        return edible;
	    }
	    
	    public Boolean getmedicinal()
	    {
	        return medicinal;
	    }
	     
	    //Other methods
	    public String toString()
	    {
	        String str;
	        str = "Name ........:  " + name + "\n" +
			      "ID ..........:  " + id + "\n" +
	              "Color .......:  " + color + "\n" +
	              "Poisonous ...:  " + poisonous + "\n" +
	        	  "Edible ......:  " + edible + "\n" +
	              "Medicinal ...:  " + medicinal + "\n";

	        return str;
	    }
	}
