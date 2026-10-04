package com.frozen.comp;

import com.frozen.dto.UserFeedBackDTO;
import com.frozen.service.UserFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserFeedBackComponent {
    @Autowired
    private UserFeedBackService userFeedBackService;

    public UserFeedBackComponent() {
        System.out.println("UserFeedBackComponent created.");
    }

    @PostMapping("/feedback")
    public String feedback(@Valid UserFeedBackDTO userFeedBackDTO,
                           BindingResult bindingResult,
                           Model model) {
        System.out.println("UserFeedBackComponent feedback() method called.");
        System.out.println("userFeedBackDTO = " + userFeedBackDTO);
        if (bindingResult.hasErrors()) {
            System.out.println("Validation errors found:");

            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", errors);
            model.addAttribute("feedbackMessage", userFeedBackDTO);
        }
        else {
            System.out.println("Validation passed. Proceeding to save the feedback.");
        }
        return "Feedback.jsp";
    }
    @GetMapping("/feedback")
    public String feedbackGet() {
        System.out.println("UserFeedBackComponent feedback() method called for GET request.");

        return "Feedback.jsp";
    }

}
