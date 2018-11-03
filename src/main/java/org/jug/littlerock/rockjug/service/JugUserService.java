package org.jug.littlerock.rockjug.service;

import org.jug.littlerock.rockjug.models.JugUser;
import org.jug.littlerock.rockjug.repos.JugUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service("userService")
public class JugUserService {
    private JugUserRepository userRepository;

    @Autowired
    public JugUserService(JugUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public JugUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public JugUser findByConfirmationToken(String confirmationToken) {
        return userRepository.findByConfirmationToken(confirmationToken);
    }

    public void saveUser(JugUser user) {
        userRepository.save(user);
    }
}
