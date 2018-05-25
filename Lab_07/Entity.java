package Lab_07;

public class Entity {
	//Instance variables
    String strName;
    int intLife;
    int intEnergy;
    
    //Constructor Methods
    public Entity()
    {
    	strName = " ";
    	intLife = 100;
    	intEnergy = 100;
    }
    
    public Entity(String strName, int intLife, int intEnergy)
	{
    	strName = " ";
    	intLife = 100;
    	intEnergy = 100;
    }
    
    //Mutator methods
    public void setStrName (String setName)
    {
        strName = setName;
    }
    
    public void setIntLife (int setLife)
    {
    	intLife = setLife;
    }
    
    public void setIntEnergy (int setEnergy)
    {
    	intEnergy = setEnergy;
    }
    
    //Accessor methods
    public String getStrName()
    {
        return strName;
    }
    
    public int getIntLife()
    {
        return intLife;
    }
    
    public int getIntEnergy()
    {
    	return intEnergy;
    }
}
