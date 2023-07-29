package Dao;

public interface EmployeeDao {
    String create(Employee employee);
    String update(Employee employee);
    String delete(int id);
    String get(int id);

}
