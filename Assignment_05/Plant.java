package Assignment_05;

public class Plant {
	    //Instance variables
	    private String name;
	    private String id;
	    
	    //Constructor Methods
	    public Plant()
	    {
	        name = " ";
	        id = " ";
	    }
	    
	    public Plant(String nm, String uid)
	    {
	    	super();
	    	name = nm;
	    	id = uid;
	    }
	    
	    //Mutator methods
	    public void setname (String fn)
	    {
	        name = fn;
	    }
	    
	    public void setid (String uid)
	    {
	    	id = uid;
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
	     
	    //Other methods
	    public String toString()
	    {
	        String str;
	        str = "Name .....:     " + name + "\n" +
	              "ID .......:     " + id + "\n";

	        return str;
	    }
	}
