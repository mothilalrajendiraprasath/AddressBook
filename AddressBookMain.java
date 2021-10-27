package com.company;
import java.util.*;
public class AddressBookMain {

    public static ArrayList<personInfo> list = new ArrayList<personInfo>();
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        personInfo personInfo = addPersonInfo();

    }
    public static personInfo addPersonInfo(){
        System.out.println("Enter the firstname");
        String firstName= sc.next();
        System.out.println("Enter the lastname");
        String lastName= sc.next();
        System.out.println("Enter the address");
        String address= sc.next();
        System.out.println("Enter the city");
        String city= sc.next();
        System.out.println("Enter the state");
        String state= sc.next();
        System.out.println("Enter the email");
        String email= sc.next();
        System.out.println("Enter the zip");
        long zip= sc.nextLong();
        System.out.println("Enter the phone of the person");
        long phone= sc.nextLong();
        personInfo personInfo= new personInfo(firstName,lastName,address,city,state,email,zip,phone);
        return personInfo;
    }

    private static void display(personInfo personInfo){
        System.out.println("firstname"+ personInfo.getFirstName());
        System.out.println("lastname"+personInfo.getLastName());
        System.out.println("address"+personInfo.getAddress());
        System.out.println("city"+personInfo.getCity());
        System.out.println("state"+personInfo.getState());
        System.out.println("email"+ personInfo.getEmail());
        System.out.println("zip"+ personInfo.getZip());
        System.out.println("phone"+personInfo.getPhone());
    }
}
