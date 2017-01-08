package com.altarix.users.service;

import com.altarix.users.dao.UserDAO;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDAO userDao;


	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

		com.altarix.users.data.User user = userDao.findByUserName(username);
		Set<GrantedAuthority> aa = new HashSet<>();
		aa.add(new SimpleGrantedAuthority(user.getRole().getRole()));
		List<GrantedAuthority> authorities = new ArrayList<>(aa);

		return buildUserForAuthentication(user, authorities);
	}

	private User buildUserForAuthentication(com.altarix.users.data.User user, List<GrantedAuthority> authorities) {
		User user1 = new User(user.getLogin(), user.getPassword(),true, true, true, true, authorities);
		return user1;
	}
//

}