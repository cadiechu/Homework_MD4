package ra.academy.service;

import org.springframework.stereotype.Service;
import ra.academy.dto.SignInForm;
import ra.academy.model.user;

import java.rmi.registry.Registry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<user> users = new ArrayList<>();

    public UserService() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            users.add(new user(1L, "hunghx", "123456", "Hồ Xuân Hùng", sf.parse("1999-6-18"), true));
            users.add(new user(3L, "ngondm", "123456", "Đỗ Minh Ngọc", sf.parse("2000-5-5"), true));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public user login(SignInForm signInForm) {
        user userLogin = null;
        for (user u : users) {
            if (u.getUname().equals(signInForm.getUname) && u.getPass().equals(signInForm.getPass())) {
                userLogin = new user(u.getId(), u.getUname(), u.getFname(), null, u.getImg(), u.getBday(), u.isActive());
            }
        }
        return userLogin;
    }
    public boolean register(RegisterForm r) {
        final user[] user = {null};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        users.forEach(u -> {
            if (!u.getUname().equals(r.getUname())) {
                user[0] = new user(r.getId(), r.getUsername(), r.getPassword(), r.getFullName(), r.getBirthday(), true);
            }
        });
        if (user[0] == null) {
            return false;
        }
        users.add(user[0]);
        return true;
    }
}
