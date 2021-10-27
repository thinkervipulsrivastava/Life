package com.daily.status.SpringBootSecurityWithMySql.service;

import com.daily.status.SpringBootSecurityWithMySql.model.CustomUserDetails;
import com.daily.status.SpringBootSecurityWithMySql.model.Users;
import com.daily.status.SpringBootSecurityWithMySql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> optionalUsers = userRepository.findByName(username);
        optionalUsers.
                orElseThrow(() -> new UsernameNotFoundException("Username not found"));

        return optionalUsers.
                map(CustomUserDetails::new)
                .get();

    }
}
