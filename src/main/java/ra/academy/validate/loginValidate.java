package ra.academy.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.academy.dto.SignInForm;
@Component
public class loginValidate implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return SignInForm.class.equals(clazz);
        // cho phép ép kiểu về SignINFOMR
    }

    @Override
    public void validate(Object obj, Errors errors) {
        //  eps kieerru tuw obj  thành SignInForm
        // obj laf cha sign inffo neen eps kieeru tuonwgf minh
        SignInForm signInForm = (SignInForm) obj;
        // kiểm tra trường có để trống hay không
        if (signInForm.getUname.trim().isEmtry() || signInForm.getPass().trim().isEmtry()) {
            errors.rejectValue("login", "KHÔNG ĐƯỢC ĐỂ TRỐNG!");
        }

    }
}
