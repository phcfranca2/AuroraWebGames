package com.aurora.webgames.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aurora.webgames.repository.UsersAurora;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UsersAurora usersAurora;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return Optional.ofNullable(usersAurora.findByNome(nome))
            .orElseThrow(()-> new UsernameNotFoundException("Usuário não cadastrado!"));
    }

}
