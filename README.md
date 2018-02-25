# Design patterns

## Creational patterns

### Singleton
Het singleton pattern zorgt ervoor dat er niet meer dan één object van een klasse word aangemaakt.
Deze instance is dan beschikbaar door de volledige code.

*Een toepassing van de singleton is bijvoorbeeld het maken van unieke identificatienummers binnen een programma. Om er altijd zeker van te zijn dat elk identificatienummer uniek is, is het handig om dit door één enkel object te laten genereren. Dit is dan een singleton.* (wikipedia)

![alt text](Singleton.png "Singleton pattern diagram")

###### *Singleton.java*
```java
public class Singleton {

	private ArrayList<String> idList = new ArrayList<String>();

	private static Singleton instance = new Singleton();

	//Singleton-constructor moet private zijn zodat je niet meerdere instanties aan kan maken
	private Singleton() {};

	public static Singleton getInstance() {
		return instance;
	}

	public String generateID() {
		String uniqueID = UUID.randomUUID().toString();

		if (idList.contains(uniqueID)) {
			System.out.println("id bestaat al.");
			return null;
		} else {
			return uniqueID;
		}

	}

}
```
###### *Main.java*

```java
public class Main {

	public static void main(String[] args) {

		//een instantie van singleton, geen nieuw object.
		Singleton s = Singleton.getInstance();

		System.out.println("ID1: "+s.generateID());
		System.out.println("ID2: "+s.generateID());
		System.out.println("ID3: "+s.generateID());

	}
}
```
### Factory
Het factory pattern is een manier om objecten te instantiëren zonder exact vast te hoeven van welke klasse deze objecten zullen zijn. Er wordt een factory gemaakt die door subklassen geïmplementeerd kan worden. De klasse van het object dat door die methode geïnstantieerd wordt, implementeert een bepaalde interface. Elk van de subklassen kan vervolgens bepalen van welke klasse een object wordt aangemaakt, zolang deze klasse maar die interface implementeert.

*Het doel van dit ontwerppatroon is het vereenvoudigen van het onderhoud van het programma. Als er nieuwe subklassen nodig zijn dan hoeft men alleen een nieuwe factory-methode te implementeren.* (wikipedia)

![alt text](Factory_pattern.png "Factory pattern diagram")

###### *Smartphone.java*

```java
public interface Smartphone {
	public void turnOn();
}

```
###### *Iphone.java*

```java
public class Iphone implements Smartphone{

	@Override
	public void turnOn() {
		System.out.println("De iPhone werkt!");

	}
}
```
###### *Samsung.java*

```java
public class Samsung implements Smartphone {

	@Override
	public void turnOn() {
		System.out.println("De Samsung werkt!");

	}
}
```
###### *SmartphoneFabriek.java*

```java
public abstract class SmartphoneFabriek {

	public abstract Smartphone produceerSmartphone();

}
```
##### *IphoneFabriek.java*

```java
public class IphoneFabriek extends SmartphoneFabriek{

	@Override
	public Smartphone produceerSmartphone() {
		return new Iphone();
	}

}
```
##### *SamsungFabriek.java*

```java
public class SamsungFabriek extends SmartphoneFabriek {

	@Override
	public Smartphone produceerSmartphone() {
		return new Samsung();
	}

}
```
##### *Main.java*

```java
public class Main {

	public static void main(String[] args) {

		SmartphoneFabriek iphoneFabriek = new IphoneFabriek();
		Smartphone iphoneX = iphoneFabriek.produceerSmartphone();
		iphoneX.turnOn();

		SmartphoneFabriek samsungFabriek = new SamsungFabriek();
		Smartphone s9 = samsungFabriek.produceerSmartphone();
		s9.turnOn();

	}

}
```
### Abstract Factory
Het Abstract Factory pattern werkt met een soort super-factory die dan weer andere factories creeërt. Een vaak gebruikt voorbeeld is het maken van specifieke venster voor Mac OS en Windows.
De 'super-factory' is hier de AbstractVensterFactory. Deze creeërt weer de factories die het Windows of Mac venster kunnen gaan produceren.

Je kan dus tijdens runtime kijken welk besturingssysteem er draait en daarop je interface aanpassen.

![alt text](Abstract_Factory_pattern.png "Factory pattern diagram")

##### *AbstractVensterFactory.java*

```java
public interface AbstractVensterFactory {

	public Venster createVenster();

}
```
##### *MacOSVensterFactory.java*

```java
public class MacOSVensterFactory implements AbstractVensterFactory{

	@Override
	public Venster createVenster() {
		MacOSVenster venster = new MacOSVenster();
		return venster;
	}

}
```
##### *WindowsVensterFactory.java*

```java
public class WindowsVensterFactory implements AbstractVensterFactory{

	@Override
	public Venster createVenster() {
		WindowsVenster venster = new WindowsVenster();

		return venster;
	}

}
```
##### *Venster.java*

```java
public interface Venster {

	public void repaint();

}
```
##### *MacOSVenster.java*

```java
public class MacOSVenster implements Venster{

	@Override
	public void repaint() {
		// Knoppen aanpassen zodat het meer in de Mac OS omgeving past...
		System.out.println("Nieuw MAC OS -venster aangemaakt.");

	}

}
```
##### *WindowsVenster.java*

```java
public class WindowsVenster implements Venster{

	@Override
	public void repaint() {
		// Knoppen aanpassen zodat het meer in de Windows omgeving past...
		System.out.println("Nieuw Windows-venster aangemaakt.");

	}

}
```
##### *GUIBuilder.java*

```java
public class GUIBuilder {

	public void buildWindow(AbstractVensterFactory vensterFactory) {
		Venster venster = vensterFactory.createVenster();
		venster.repaint();
	}
}
```
##### *Main.java*

```java
public class Main {

	public static String platform = "MACOS";

	public static void main(String[] args) {

		GUIBuilder builder = new GUIBuilder();
		AbstractVensterFactory vensterFactory = null;

		if(platform == "MACOS"){
			vensterFactory  = new MacOSVensterFactory();
		} else {
			vensterFactory  = new WindowsVensterFactory();
		}
		builder.buildWindow(vensterFactory);

	}

}
```

### Builder
Het Builder pattern kan een gecompliceerd object bouwen door gebruik te maken van simplere objecten. Het gaat stap voor stap (1. buildDough, 2. buildSauce, 3. buildToppings). Als de builder klaar is dan geeft hij het object (in ons geval een pizza) terug aan de director (in ons geval de waiter).

![alt text](Builder_pattern.png "Builder pattern diagram")

##### *AbstractPizzaBuilder.java*

```java
public abstract class AbstractPizzaBuilder {
	protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
```
##### *SpicyPepperoniPizzaBuilder.java*

```java
public class SpicyPepperoniPizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("italiaans");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Spicy");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni, Salami & Pepers");

	}

}

```
##### *HawaiianPizzaBuilder.java*

```java
public class HawaiianPizzaBuilder extends AbstractPizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("karton");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("zoet");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Ham & Ananas");

	}

}
```
##### *Pizza.java*

```java
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public String getTopping() {
		return topping;
	}
}
```

##### *Waiter.java*

```java
public class Waiter {

	 private AbstractPizzaBuilder pizzaBuilder;

	    public void setPizzaBuilder(AbstractPizzaBuilder pb) {
	        pizzaBuilder = pb;
	    }

	    public Pizza getPizza() {
	        return pizzaBuilder.getPizza();
	    }

	    public void constructPizza() {
	        pizzaBuilder.createNewPizzaProduct();
	        pizzaBuilder.buildDough();
	        pizzaBuilder.buildSauce();
	        pizzaBuilder.buildTopping();
	    }

}
```
##### *Main.java*

```java
public class Main {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();

        AbstractPizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        AbstractPizzaBuilder spicyPizzaBuilder = new SpicyPepperoniPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println("Hawaiian Pizza: \nDough: "+pizza.getDough()+" Sauce: "+pizza.getSauce()+" Toppings: "+pizza.getTopping());

        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza();

        pizza = waiter.getPizza();

        System.out.println("Spicy Pizza: \nDough: "+pizza.getDough()+" Sauce: "+pizza.getSauce()+" Toppings: "+pizza.getTopping());


	}

}
```
### Prototype
Het Prototype pattern maakt nieuwe objecten door het clonen / kopieeren van een ander object. Dit kost niet veel resources en zorgt dus voor betere performance van je applicatie.

![alt text](Prototype_pattern.png "Prototype pattern diagram")

##### *Animal.java*

```java
public interface Animal extends Cloneable {

	public Animal makeClone();

}
```
##### *Sheep.java*

```java
public class Sheep implements Animal {

	public Sheep() {

		System.out.println("Sheep is made.");
	}

	@Override
	public Animal makeClone() {
		System.out.println("Sheep is being cloned.");

		Sheep sheepObject = null;

		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return sheepObject;
	}

	public String toString() {
		return "Dolly is alive!";
	}

}
```
##### *Animal.java*

```java
public class Dog implements Animal{

	public Dog() {

		System.out.println("Dog is made.");
	}

	@Override
	public Animal makeClone() {
		System.out.println("Dog is being cloned.");

		Dog dogObject = null;

		try {
			dogObject = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return dogObject;
	}

	public String toString() {
		return "Baily is alive!";
	}
}
```
##### *CloneFactory.java*

```java
public class CloneFactory {

	public Animal getClone(Animal animalSample) {

		return animalSample.makeClone();

	}

}
```
##### *Main.java*

```java
public class Main {

	public static void main(String[] args) {
		CloneFactory cloneLab = new CloneFactory();

		Sheep Dolly = new Sheep();
		Sheep DollyCloned = (Sheep) cloneLab.getClone(Dolly);

		Dog Baily = new Dog();
		Dog BailyCloned = (Dog) cloneLab.getClone(Baily);

		System.out.println("Orgineel: "+Dolly);
		System.out.println("Clone: "+DollyCloned);

		System.out.println("Orgineel: "+Baily);
		System.out.println("Clone: "+BailyCloned);

	}

}
```
### Object Pool
Het Object Pool pattern maakt een pool van objecten die meerdere clienten kunnen gebruiken. Denk hierbij aan bijvoorbeeld een databaseconnectie. Dit is een 'dure' resource om iedere keer opnieuw aan te maken. Daarom is het logisch om de connectie eenmalig te maken en daarna door meerdere klassen te gebruiken.

Het object pool pattern wordt tegenwoordig niet veel meer gebruikt omdat systemen snel genoeg zijn om ook wat men vroeger 'dure' resources noemden snel uit te kunnen voeren. Het is dan overbodig om pools te vullen. Dit kost dan meer laadtijd en geheugen.

Het wordt soms wel nog gebruikt bij JDBC om snel toegang te krijgen tot een db connectie.

![alt text](Object_Pool_pattern.png "Object Pool pattern diagram")

##### *ObjectPool.java*

```java
public abstract class ObjectPool<T> {
	  private long expirationTime;

	  private Hashtable<T, Long> locked, unlocked;

	  public ObjectPool() {
	    expirationTime = 30000; // 30 seconds
	    locked = new Hashtable<T, Long>();
	    unlocked = new Hashtable<T, Long>();
	  }

	  protected abstract T create();

	  public abstract boolean validate(T o);

	  public abstract void expire(T o);

	  public synchronized T checkOut() {
	    long now = System.currentTimeMillis();
	    T t;
	    if (unlocked.size() > 0) {
	      Enumeration<T> e = unlocked.keys();
	      while (e.hasMoreElements()) {
	        t = e.nextElement();
	        if ((now - unlocked.get(t)) > expirationTime) {
	          // object has expired
	          unlocked.remove(t);
	          expire(t);
	          t = null;
	        } else {
	          if (validate(t)) {
	            unlocked.remove(t);
	            locked.put(t, now);
	            return (t);
	          } else {
	            // object failed validation
	            unlocked.remove(t);
	            expire(t);
	            t = null;
	          }
	        }
	      }
	    }
	    // no objects available, create a new one
	    t = create();
	    locked.put(t, now);
	    return (t);
	  }

	  public synchronized void checkIn(T t) {
	    locked.remove(t);
	    unlocked.put(t, System.currentTimeMillis());
	  }
	}
```
##### *JDBCConnectionPool.java*

```java
public class JDBCConnectionPool extends ObjectPool<Connection> {

	  private String dsn, usr, pwd;

	public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
	    super();
	    try {
	      Class.forName(driver);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    this.dsn = dsn;
	    this.usr = usr;
	    this.pwd = pwd;
	  }

	  @Override
	  protected Connection create() {
	    try {
	      return (DriverManager.getConnection(dsn, usr, pwd));
	    } catch (SQLException e) {
	      e.printStackTrace();
	      return (null);
	    }
	  }

	  @Override
	  public void expire(Connection o) {
	    try {
	      ((Connection) o).close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }

	  @Override
	  public boolean validate(Connection o) {
	    try {
	      return (!((Connection) o).isClosed());
	    } catch (SQLException e) {
	      e.printStackTrace();
	      return (false);
	    }
	  }
	}
```
##### *Main.java*

```java
public class Main {
	  public static void main(String args[]) {
	    // Create the ConnectionPool:
	    JDBCConnectionPool pool = new JDBCConnectionPool(
	      "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
	      "sa", "secret");

	    // Get a connection:
	    Connection con = pool.checkOut();

	    // Use the connection

	    // Return the connection:
	    pool.checkIn(con);

	  }
	}
```
## Behavioral Design Patterns

### Chain of Responsibility
Het Chain of Responsibility pattern is vrij simpel. Het krijgt een request binnen en gaat alle chains (klasses) langs om te kijken of de klassen de request kan afhandelen. Als dit niet het geval is dan word de request doorgegeven naar de volgende klasse.

![alt text](Chain_of_Responsibillity_pattern.png "Object Pool pattern diagram")

##### *Chain.java*

```java
public interface Chain {
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers request);
}
```
##### *Numbers.java*

```java
public class Numbers {

	private double number1;
	private double number2;

	private String calculation;

	public Numbers(Double num1, Double num2, String calc) {
		number1 = num1;
		number2 = num2;
		calculation = calc;
	}

	public double getNumber1() {
		return number1;
	}

	public double getNumber2() {
		return number2;
	}

	public String getCalculation() {
		return calculation;
	}

}
```
##### *AddNumber.java*

```java
public class AddNumber implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;

	}

	@Override
	public void calculate(Numbers request) {

		if(request.getCalculation() == "add") {
			Double calculation = (request.getNumber1()+request.getNumber2());
			System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + calculation);
		} else {

			nextInChain.calculate(request);
		}

	}

}
```
##### *SubtractNumber.java*

```java
public class SubtractNumber implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;

	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculation() == "sub") {
			Double calculation = (request.getNumber1()-request.getNumber2());
			System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = " + calculation);
		} else {

			nextInChain.calculate(request);
		}

	}

}
```
##### *MultNumber.java*

```java
public class MultNumber implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;

	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculation() == "mult") {
			Double calculation = (request.getNumber1()*request.getNumber2());
			System.out.println(request.getNumber1() + " X " + request.getNumber2() + " = " + calculation);
		} else {

			nextInChain.calculate(request);
		}

	}

}
```

##### *DivideNumber.java*

```java
public class DivideNumber implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;

	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalculation() == "div") {
			Double calculation = (request.getNumber1()/request.getNumber2());
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + calculation);
		} else {

			System.out.println("You can only add, sub, mult & div.");
		}

	}

}
```
##### *Main.java*

```java
public class Main {

	public static void main(String[] args) {

		Chain chainCalc1 = new AddNumber();
		Chain chainCalc2 = new SubtractNumber();
		Chain chainCalc3 = new MultNumber();
		Chain chainCalc4 = new DivideNumber();

		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);

		Numbers request = new Numbers(1234.0, 4321.0, "mult");

		chainCalc1.calculate(request);

	}

}
```
### Command


![alt text](Command_pattern.png "Command pattern diagram")
