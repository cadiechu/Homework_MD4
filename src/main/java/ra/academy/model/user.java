package ra.academy.model;

import javax.xml.crypto.Data;
import java.util.Date;

public class user {
    private Long id;
    private String uname, pass, img, fname;
    private Date bday;
    private boolean active;

    public user() {
    }

    public user(Long id, String uname, String pass, String img, String fname, Date bday, boolean active) {
        this.id = id;
        this.uname = uname;
        this.pass = pass;
        this.img = img;
        this.fname = fname;
        this.bday = bday;
        this.active = active;
    }

    public user(long l, String hunghx, String number, String hồXuânHùng, Date parse, boolean b) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
