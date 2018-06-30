package com.lxt.client.rest.template.security;

import com.lxt.client.rest.template.user.ClientUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClientUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ClientUser clientUser = new ClientUser();
        clientUser.setUsername("bobo");
        clientUser.setPassword("xyz");
        return new ClientUserDetails(clientUser);
    }
}
