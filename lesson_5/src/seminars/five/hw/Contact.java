package seminars.five.hw;

public class Contact {
    String name;
    String phone;
    String info;

    public Contact(String name, String phone, String info) {
        this.name = name;
        this.phone = phone;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
