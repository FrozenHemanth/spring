package com.frozen.comp;

import com.frozen.dto.UserFeedBackDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class UserFeedBackComponent {

    public UserFeedBackComponent() {
        System.out.println("UserFeedBackComponent created.");
    }
    @RequestMapping("/feedback")
    public String feedback(Model model , UserFeedBackDTO userFeedBackDTO) {
        model.addAttribute("feedbackMessage" , "Feedback registered successfully " + userFeedBackDTO);
        return "Feedback.jsp";

    }
}
