package jhotel.controller;

import org.springframework.web.bind.annotation.*;
import jhotel.*;
import java.util.Date;
import java.util.GregorianCalendar;
@RestController
/**
 * Kelas ini mengatur dari sisi server dan sisi client saat pengambilan data customer.
 *
 * @author Fahmi FF
 * @version 20-05-2018
 */
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }


    /**
     * method ini mengatur pengambilan data dari server untuk pembuatan customer baru.
     *
     * @param name
     * @param email
     * @param password
     */
    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="tahun", required = false, defaultValue  = "2000") int tahun,
                            @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(name, 10, 10, tahun, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };

        return customer;
    }


    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

    /**
     * method ini mengatur login customer.
     *
     * @param email
     * @param password
     */
    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value="email") String email,
                              @RequestParam(value="password") String password) {
        return DatabaseCustomer.getCustomerLogin(email, password);
    }

}