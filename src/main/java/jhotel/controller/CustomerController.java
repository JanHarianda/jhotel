package jhotel.controller;
import jhotel.Customer;
import jhotel.DatabaseCustomer;
import jhotel.DatabaseHotel;
import jhotel.Hotel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
		public Customer newCust(@RequestParam(value="name") String name,
                                @RequestParam(value="email") String email,
                                @RequestParam(value = "password") String password,
                                @RequestParam(value="tahun", required = false, defaultValue = "2000") int tahun)
		{
			Customer customer = new Customer(name,10,10,tahun, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
			} 
			catch(Exception ex) 
			{
            ex.getMessage();
            return null;
        };

        return customer;
    }

    @RequestMapping(value = "/logincust/" ,method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value="email") String email,
                              @RequestParam(value="password") String password) {
        return DatabaseCustomer.getCustomerLogin(email, password);
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }


}