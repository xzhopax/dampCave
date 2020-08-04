package myProjekt.addressBook;

import java.util.ArrayList;
import java.util.List;

public class Adress {
    protected static List<Adress> list = new ArrayList<>();

    private String area; // район
    private String street; // улица
    private int house; // дом
    private int fraction; // корпус
    private int numberOfBoxes;
    private String houseInfo; // информация о доме
    private  String locationEquipment; // расположение оборудования
    private String key; //для обслуживания дома, какие брать ключи от ящика

    protected Adress(String area, String street, int house, int fraction) { // создание дома (район, улица, дом, корпус)
        this.area = area;
        this.street = street;
        if (house > 0) {  this.house = house; }
        if (fraction > 0) {this.fraction = fraction;}
    }

    protected void addHouseInfo(String houseInfo) { // добавление информации к дому
        this.houseInfo = this.houseInfo +  houseInfo;
    }

    protected void addInfoLocationEquipment (String addInfo) { // добавление информации расположения оборудования
        this.locationEquipment = this.locationEquipment + addInfo;
    }


    public String getArea() {
        return area;
    }
    public String getStreet() {
        return street;
    }
    public int getHouse() {
        return house;
    }
    public int getFraction() {
        return fraction;
    }
    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }
    public String getHouseInfo() {
        return houseInfo;
    }
    public String getLocationEquipment() {
        return locationEquipment;
    }
    public String getKey() {
        return key;
    }

    public void setHouseInfo(String houseInfo) {
        this.houseInfo = houseInfo;
    }
    public void setLocationEquipment(String locationEquipment) {
        this.locationEquipment = locationEquipment;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public void setNumberOfBoxes(int numberOfBoxes) {
        if (numberOfBoxes >= 0) {
            this.numberOfBoxes = numberOfBoxes;
        }
    }
}
