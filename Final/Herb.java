package Final;

public class Herb extends Plant {
		//Instance variables
		private String name;
		private String id;
		private String flavor;
		private Boolean medicinal;
		private Boolean seasonal;
		
		//Constructor Methods
		public Herb()
	    {
	    	name = " ";
	    	id = "Herb";
	    	flavor = " ";
	        medicinal = false;
	        seasonal = false;
	    }
	    
	    public Herb(String nm, String uid, String fl, Boolean md, Boolean se)
	    {
	    	name = nm;
	    	id = uid;
	    	flavor = fl;
	    	medicinal = md;
	    	seasonal = se;
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
	    
	    public void setflavor (String fl)
	    {
	    	flavor = fl;
	    }
	    
	    public void setmedicinal (Boolean md)
	    {
	        medicinal = md;
	    }
	    
	    public void setseasonal (Boolean se)
	    {
	    	seasonal = se;
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
	    
	    public String getflavor()
	    {
	        return flavor;
	    }
	    
	    public Boolean getmedicinal()
	    {
	        return medicinal;
	    }
	    
	    public Boolean getseasonal()
	    {
	        return seasonal;
	    }
	    
	     
	    //Other methods
	    public String toString()
	    {
	        String str;
	        str = "Name ........:  " + name + "\n" +
			      "ID ..........:  " + id + "\n" +
	              "Flavor ......:  " + flavor + "\n" +
	              "Medicinal ...:  " + medicinal + "\n" +
	        	  "Seasonal ....:  " + seasonal + "\n";

	        return str;
	    }
}
