package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Contact;
import za.ac.cput.dogparlor.domain.Customer;
import za.ac.cput.dogparlor.util.Helper;

import java.time.LocalDateTime;
import java.util.List;

public class CustomerFactory {

    public static Customer createCustomer(String firstName, String lastName, List<Contact> contacts,
                                          List<Address> addresses) {

        if ((Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)))
            return null;

        String customerID = Helper.getCustomerID();

        return new Customer.Builder()
                .setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setContacts(contacts)
                .setAddresses(addresses)
                .build();

    }

}