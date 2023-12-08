package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.academy.model.Customer;
import ra.academy.service.ICustomerService;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/")
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers", customerService.findAll());
        return modelAndView;
    }

//    @GetMapping("/create")
//    public String showFormCreate(Model model) {
//        Customer customer = new Customer();
//        model.addAttribute("customerForm", customer);
//        return "add";
//    }

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("/add");
        modelAndView.addObject("customerForm", new Customer());
        return modelAndView;
}

    @PostMapping("/create/customer")
    public String createCustomer(@ModelAttribute("customerForm") Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }
    @GetMapping("/detail/{id}")
    public String showFormForAdd(@PathVariable("id") Long id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "detail";
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("editForm", customer);
        return modelAndView;
    }
    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute("editForm") Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("deleteForm", customer);
        return modelAndView;
    }
    @PostMapping("/delete")
    public String deleteById(@ModelAttribute("deleteForm") Customer customer) {
        customerService.deleteById(customer.getId());
        return "redirect:/";
    }
}
