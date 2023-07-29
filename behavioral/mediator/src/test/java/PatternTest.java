import com.learn.pattern.IChatBox;
import com.learn.pattern.ChatBox;
import com.learn.pattern.RegisteredUser;
import com.learn.pattern.User;

/*
This is part of structural design pattern. Mediator design pattern is very helpful in a enterprise application where multiple object interacting
each other without knowing complexity of each other.
The system components are tightly-coupled with each other makes higher maintainability cost and not hard to extend.
Mediator pattern focuses on provide a mediator between objects for communication and help in implementing lose-coupling
between objects. Air traffic controller is a great example of mediator pattern where the airport control room
works as a mediator for communication between different flights.
Cab booking by Uber or OlaApplication also very good example of mediator design pattern.

Chat Meditor

1. Chat mediator
2. user



 */
public class PatternTest {
    public static void main(String args[]){
        IChatBox chatBox = new ChatBox();

        User user1 = new RegisteredUser(chatBox,"1", "Michal");
        User user2 = new RegisteredUser(chatBox,"2", "Marcel");
        User user3 = new RegisteredUser(chatBox,"3", "Jiri");
        User user4 = new RegisteredUser(chatBox,"4", "Dawn");

        chatBox.addUser(user1);
        chatBox.addUser(user2);
        chatBox.addUser(user3);
        chatBox.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");

    }



}
