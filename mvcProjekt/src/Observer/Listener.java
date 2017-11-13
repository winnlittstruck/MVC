package Observer;

public class Listener extends Observer 
{
	private String name;
	private Radio radio;
	public Listener(String name, Radio radio) 
	{
		this.name = name;
		this.radio = radio;
		radio.attach(this);
		this.update();
	}
	public void update() 
	{		
		System.out.println("Hi, I'm " + this.name + " and am listening to station " + this.radio.getStation());
	}
}


