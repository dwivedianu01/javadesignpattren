package Dao;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public String create(Employee employee) {
        return "Added successfully";
    }

    @Override
    public String update(Employee employee) {
        return "updated successfully";
    }

    @Override
    public String delete(int id) {
        return "deleted successfully";
    }

    @Override
    public String get(int id) {
        return "get employee list successfully";
    }
}
