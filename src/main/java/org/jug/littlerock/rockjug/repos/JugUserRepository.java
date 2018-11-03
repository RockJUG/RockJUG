package org.jug.littlerock.rockjug.repos;

import org.jug.littlerock.rockjug.models.JugUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface JugUserRepository extends CrudRepository<JugUser,Long> {
    JugUser findByEmail(String email);
    JugUser findByConfirmationToken(String confirmationToken);
}
