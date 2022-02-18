/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;



/**
 *
 * @author meghanshubhatt
 */
public class UberModel implements Serializable {
    private String brand;
    private String model;
    private String color;
    private int year;
    private String engineNo;
    private int seatsNumber;
    private String licensePlates;
    private String ownerName;
    private long ownerTelephoneNumbers;
    //private String ownerEmailAddresses;
    private String ownerDriverLicense;
    //private long ownerSocialSecurityNumber;
    //private String ownerAddress;
    private int warrantyYear;
    private boolean isAvailable;
    private boolean isMaintenanceCertificates;
    private String isCity;
    private String isSerialNumber;

    public UberModel() {
    }

    public UberModel(String brand, String model, String color, int year, String engineNo, int seatsNumber, String licensePlates, String ownerName, long ownerTelephoneNumbers, String ownerDriverLicense, int warrantyYear,boolean isAvailable,boolean isMaintenanceCertificates,String isCity,String isSerialNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineNo = engineNo;
        this.seatsNumber = seatsNumber;
        this.licensePlates = licensePlates;
        this.ownerName = ownerName;
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
        this.ownerDriverLicense = ownerDriverLicense;
        this.warrantyYear = warrantyYear;
        this.isAvailable = isAvailable;
        this.isMaintenanceCertificates = isMaintenanceCertificates;
        this.isCity = isCity;
        this.isSerialNumber = isSerialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getOwnerTelephoneNumbers() {
        return ownerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(long ownerTelephoneNumbers) {
        this.ownerTelephoneNumbers = ownerTelephoneNumbers;
    }



    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }


    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }
 

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setisAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public boolean getisMaintenanceCertificates() {
        return isMaintenanceCertificates;
    }

    public void setisMaintenanceCertificates(boolean isMaintenanceCertificates) {
        this.isMaintenanceCertificates = isMaintenanceCertificates;
    } 
    
    public String getisCity() {
        return isCity;
    }

    public void setisCity(String isCity) {
        this.isCity = isCity;
    }
    
    public String getisSerialNumber() {
        return isSerialNumber;
    }

    public void setisSerialNumber(String isSerialNumber) {
        this.isSerialNumber = isSerialNumber;
    }
   
    
}
