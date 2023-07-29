package Proxy;

import Dao.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;

public class EmployeeProxyImpl implements EmployeeProxy{


    EmployeeDao employeeDao;

    public EmployeeProxyImpl() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public String create(String requestedBy,Employee employee) {
        if(!requestedBy.equalsIgnoreCase("ADMIN")){
            return "User is not Authorize for this operation";
        }

        return employeeDao.create(employee);
    }

    @Override
    public String update(String requestedBy,Employee employee) {
        if(!requestedBy.equalsIgnoreCase("ADMIN")){
            return "User is not Authorize for this operation";
        }

        return employeeDao.update(employee);
    }

    @Override
    public String delete(String requestedBy,int id) {
        if(!requestedBy.equalsIgnoreCase("ADMIN")){
            return "User is not Authorize for this operation";
        }

        return employeeDao.delete(id);
    }

    @Override
    public String get(String requestedBy,int id) {
        if(requestedBy.equalsIgnoreCase("ADMIN") || requestedBy.equalsIgnoreCase("USER")){
            return employeeDao.get(id);

        }
        return "User is not Authorize for this operation";


    }
}
