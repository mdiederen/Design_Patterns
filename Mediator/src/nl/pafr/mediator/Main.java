package nl.pafr.mediator;

public class Main {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Michiel");
		User user2 = new UserImpl(mediator, "John");
		User user3 = new UserImpl(mediator, "Paul");
		User user4 = new UserImpl(mediator, "Sarah");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi there!");
		
	}
}
