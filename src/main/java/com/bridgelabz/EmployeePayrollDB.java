package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollDB {

    Connection getConnection() throws SQLException {
        Connection connection;
        String jdbcUrl = "jdbc:mysql://localhost:3306/employee_payroll_service?characterEncoding=utf8";
        String userName = "root";
        String Password = "poonam@5691";
        connection = DriverManager.getConnection(jdbcUrl, userName, Password);
        System.out.println("connection is successfull" + connection);
        return connection;
    }
}

