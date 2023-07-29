import Dao.Employee;
import Proxy.EmployeeProxy;
import Proxy.EmployeeProxyImpl;
/*
This Pattern is part of Structural design Pattern. We are using this pattern on daily basis in our office or college computer.

Client --------->||{PROXY}||----------->Server

When we called Any ENd point or method which pass from some layer which perform some operation like filter / authorization/logging etc.

Proxy usage:
Blocking End Points - Client --------->||{PROXY(Block Some End Points)}||----------->Server
Caching - Client --------->||{PROXY (Caching}||----------->Server
Pre Processing/Post Processing - Client --------->||{PROXY (Pre Processing/Post Processing)}||----------->Server

 */

public class PatternTest {
    public static void main(String args[]){
        System.out.println("<-----------------------Work Here----------------------->");
        EmployeeProxy employeeProxy = new EmployeeProxyImpl();
        System.out.println(employeeProxy.create("USER",new Employee()));
        System.out.println(employeeProxy.create("ADMIN",new Employee()));

        System.out.println(employeeProxy.update("USER",new Employee()));
        System.out.println(employeeProxy.update("ADMIN",new Employee()));

        System.out.println(employeeProxy.delete("USER",1));
        System.out.println(employeeProxy.delete("ADMIN",1));

        System.out.println(employeeProxy.get("USER",2));
        System.out.println(employeeProxy.get("ADMIN",2));


    }
}
