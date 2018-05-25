package jhotel.controller;

import jhotel.Customer;
import jhotel.DatabaseCustomer;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    /**
     * Request maping untuk localhost:8080/
     *
     * @param name nama
     * @return "Hello " + name
     */
    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * Request mapping untuk localhost:8080/newcustomer
     *
     * @param name nama customer
     * @param email email login
     * @param tahun tahun lahir customer
     * @param password password login
     * @return customer customer yang dibuat
     */
    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="tahun", required = false, defaultValue = "2000") int tahun,
                            @RequestParam(value="password") String password) {
        Customer customer = new Customer(name, 10, 10, tahun, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };
        return customer;
    }

    /**
     * Request maping untuk localhost:8080/logincust
     *
     * @param email email customer
     * @param password password customer
     * @return customer customer terpilih
     */
    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value="email") String email,
                              @RequestParam(value="password") String password) {
        Customer customer = DatabaseCustomer.getCustomerLogin(email, password);
        return customer;
    }

    /**
     * Request maping untuk localhost:8080/getcustomer/id
     *
     * @param id id customer
     * @return customer customer terpilih
     */
    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}