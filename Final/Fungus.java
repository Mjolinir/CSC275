package Final;

public class Fungus extends Plant {
	    //Instance variable
		private String name;
		private String id;
	    private String color;
	    private Boolean poisonous;
	    
	    //Constructor Methods
	    public Fungus()
	    {
			name = " ";
			id = "Fungus";
	    	color = " ";
	        poisonous = false;
	    }
	    
	    public Fungus(String nm, String uid, String cl, Boolean ps)
	    {
			name = nm;
			id = uid;
	    	color = cl;
	    	poisonous = ps;
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
	     
	    //Other methods
	    public String toString()
	    {
	        String str;
	        str = "Name ........:  " + name + "\n" +
		          "ID ..........:  " + id + "\n" +
	        	  "Color .......:  " + color + "\n" +
	              "Poisonous ...:  " + poisonous + "\n";

	        return str;
	    }
	}
