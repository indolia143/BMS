package model;

public class Theatre {
    private int id;
    private String name;
    private String cityName;
    private String address;

    public Theatre(int id, String name, String cityName, String address) {
        this.id = id;
        this.name = name;
        this.cityName = cityName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
