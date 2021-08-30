
package com.sartvas.spring.mvc;

import com.sartvas.spring.mvc.valid.CheckEmail;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.constraints.Min;





public class Employee {
    
    @Size(min = 2, message = "Please, insert correct name")
    private String name;
//    @NotEmpty(message = "This field is required!")
    @NotBlank(message = "Please, insert correct name")
    private String surname;
    @Min(value = 100, message = "Salary must be greater 99$")
    @Max(value = 29999, message = "Salary not must be greater 29999$")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] langs;
    private Map<String, String> lang;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Telephone number must be format: XXX-XX-XX")
    private String phoneNumber;
    
    @CheckEmail
    private String email;


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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + ", department=" + department + '}';
    }
    
    
    
    
    
}
