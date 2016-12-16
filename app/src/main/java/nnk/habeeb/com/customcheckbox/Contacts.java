package nnk.habeeb.com.customcheckbox;

/**
 * Created by Habeeb on 12/14/2016.
 */

public class Contacts {

    String name;
    Boolean check = false;

    public Contacts(String name, Boolean check) {
        this.name = name;
        this.check = check;
    }

    public Contacts(String name) {
        this.name = name;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
