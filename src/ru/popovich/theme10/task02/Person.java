package ru.popovich.theme10.task02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {

    String firstname;
    String lastname;
    int age;
    String gender;
    Date birthDate;
    String email;
    String[] addresses;
    String[] phoneNumbers;
    ArrayList<String> phoneNumbers1;

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        phoneNumbers1 = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setPhoneNum(String phoneNum){
//        int newLengh = phoneNumbers.length + 1;
//        String[] newPhoneNumbers = new String[newLengh];
//        for (int i = 0; i < phoneNumbers.length; i++) {
//            newPhoneNumbers[i] = phoneNumbers[i];
//        }
//        newPhoneNumbers[newPhoneNumbers.length]=phoneNum;
//        phoneNumbers = newPhoneNumbers;
//
        phoneNumbers1.add(phoneNum);
    }

    public ArrayList<String> getPhoneNumbers1() {
        return phoneNumbers1;
    }

    public void setPhoneNumbers1(ArrayList<String> phoneNumbers1) {
        this.phoneNumbers1 = phoneNumbers1;
    }

    @Override
    public String toString() {
        return
                "Имя: " + firstname + " "
                + "Фамилия: " + lastname + " "
                + "Возраст: " + age + " лет "
                + "Почта: " + email;

    }
}
