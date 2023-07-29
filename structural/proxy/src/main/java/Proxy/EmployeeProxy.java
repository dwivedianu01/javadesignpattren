package Proxy;

import Dao.Employee;

public interface EmployeeProxy {
    String create(String requestedBy,Employee employee);
    String update(String requestedBy,Employee employee);
    String delete(String requestedBy,int id);
    String get(String requestedBy,int id);
}
