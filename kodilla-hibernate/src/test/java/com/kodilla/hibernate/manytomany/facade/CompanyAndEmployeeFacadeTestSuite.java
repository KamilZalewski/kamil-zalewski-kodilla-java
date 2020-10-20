package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyAndEmployeeFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private EmployeeFacade employeeFacade;


    @Test
    public void shouldShowCompaniesUsingFacade() {

        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        List<Company> list1 = companyFacade.showCompaniesUsingFacade("war");
        List<Company> list2 = companyFacade.showCompaniesUsingFacade("gri");
        //Then
        Assert.assertEquals(1, list1.size());
        Assert.assertEquals(0, list2.size());
        //CleanUp
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(greyMatter);
    }

    @Test
    public void testShowEmployeeUsingFacade() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        List<Employee> list1 = employeeFacade.showEmployeesUsingFacade("Kov");
        List<Employee> list2 = employeeFacade.showEmployeesUsingFacade("Zal");
        //Then
        Assert.assertEquals(1, list1.size());
        Assert.assertEquals(0, list2.size());
        //CleanUp
        employeeDao.delete(johnSmith);
        employeeDao.delete(stephanieClarckson);
        employeeDao.delete(lindaKovalsky);
    }
}
