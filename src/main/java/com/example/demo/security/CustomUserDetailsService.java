// logic to load user details by name from the database. 
package com.example.demo.security;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.example.demo.entity.User;
import com.example.demo.entity.User_types;
import com.example.demo.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	private UserRepository userRepository;
	
	public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	   @Override
	    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
	       User user = userRepository.findByName(name)
	               .orElseThrow(() ->
	                       new UsernameNotFoundException("User not found with username or email:" + name));
	        return new org.springframework.security.core.userdetails.User(user.getName(),
	                user.getPassword(), mapRolesToAuthorities(user.getUser_types()));
	    }

	    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(Set<User_types> roles){
	        return roles.stream().map(role -> new  SimpleGrantedAuthority(role.getUser_type_name())).collect(Collectors.toList());
	    }
	}

