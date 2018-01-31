package com.company.addressbook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressBook extends CrudRepository<Entry, Long> {

    List<Entry> findByLastNameAndFirstNameAllIgnoreCase(String lastName, String firstName);


}
