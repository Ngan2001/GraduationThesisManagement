package com.gtm.validators;

import com.gtm.pojo.Council;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CouncilMemberUnique implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Council.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
//        Council council = (Council) target;
//        Set<CouncilDetail> councilDetailSet = new HashSet<>(council.getCouncilDetails());
//
//        if (council.getCouncilDetails().size() > councilDetailSet.size()) {
//            errors.rejectValue("councilDetails",
//                    "council.add.councilDetails.uniqueMessage",
//                    "Các thành viên trong 1 hội đồng không được trùng nhau");
//        }
    }
}
