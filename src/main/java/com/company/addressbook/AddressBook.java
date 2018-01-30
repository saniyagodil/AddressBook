package com.company.addressbook;

import org.springframework.data.repository.CrudRepository;

public interface AddressBook extends CrudRepository<Entry, Long> {
}
