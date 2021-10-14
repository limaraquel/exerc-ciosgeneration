package JavaPolimorfismo;

public class CachorroClass extends Animal{
	
	public CachorroClass()
	{
		super("Cachorro");
	}
	@Override
	public void som()
	{
		System.out.println("Latido");
	}
}