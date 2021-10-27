package com.company;
import java.util.*;

public class personInfo {
    String firstName, lastName, address, city, state, email;
    long zip, phone;

    public personInfo(String firstName, String lastName, String address, String city, String state, String email, long zip, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phone = phone;
    }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getZip() {
            return zip;
        }

        public void setZip(long zip) {
            this.zip = zip;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }
    }
}
