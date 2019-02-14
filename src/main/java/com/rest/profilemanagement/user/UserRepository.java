package com.rest.profilemanagement.user;

import com.rest.profilemanagement.user.resources.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
