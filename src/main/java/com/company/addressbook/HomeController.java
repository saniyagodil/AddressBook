package com.company.addressbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

import javax.validation.Valid;


@Controller
public class HomeController {

    @GetMapping("/addressform")
    public String makeBook(Model model) {
        model.addAttribute("NewEntry", new Entry());
        return "addressbookform";

    }

    @PostMapping("/addressform")
    public String processBook(@Valid Entry NewEntry, BindingResult result, Model model){
        model.addAttribute("NewEntry", NewEntry );
        return "addressbookconfirm";
    }


    @GetMapping("/search")
    public String searchBook(Model model){
        model.addAttribute("Anna Banana", new Entry("Anna", "Banana", "123 Road, City, State, Zip", "email@comcast.com", "240-222-3333"));
        model.addAttribute("Brian Cana", new Entry("Brian", "Cana", "456 Ave, City, State, Zip", "email@apple.com", "111-222-3333"));
        model.addAttribute("Connor Doe", new Entry("Connor", "Doe", "562 Ave, City, State, Zip", "email@gmail.com", "301-245-3333"));
        model.addAttribute("David Esjdfk", new Entry("David", "Esjdfk", "127 Ave, City, State, Zip", "email@gmail.com", "201-212-3333"));
        model.addAttribute("Elizabeth Smith", new Entry("Elizabeth", "Smith", "396 Ave, City, State, Zip", "email@yahoo.com", "511-222-1414"));
        return "searchbook";
    }
}


