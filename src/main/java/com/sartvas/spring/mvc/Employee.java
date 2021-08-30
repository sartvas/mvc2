
package com.sartvas.spring.mvc;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;



public class Employee {
    
    @Size(min = 2, message = "Please, insert correct name")
    private String name;
//    @NotEmpty(message = "This field is required!")
    @NotBlank(message = "Please, insert correct name")
    private String surname;
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] langs;
    private Map<String, String> lang;


    public Employee(){
    carBrands = new HashMap<>();
    carBrands.put("BMW", "BMW");
    carBrands.put("Audi", "Audi");
    carBrands.put("Mercedes", "Mercedes");
    
    lang = new HashMap<>();
    lang.put("EN", "English");
    lang.put("DE", "Deutch");
    lang.put("FR", "France");
    
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLangs() {
        return langs;
    }

    public void setLangs(String[] langs) {
        this.langs = langs;
    }

    public Map<String, String> getLang() {
        return lang;
    }

    public void setLang(Map<String, String> lang) {
        this.lang = lang;
    }
    
   

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + ", department=" + department + '}';
    }
    
    
    
    
    
}
