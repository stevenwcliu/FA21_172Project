package test.register.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import test.register.Repository.UserRepository;

// tell Spring Security how to look up the user information
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	// invoke the loadUserByUsername() method to authenticate the user
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// a new object of type CustomUserDetails object is created to represent the authenticated user
		User user = userRepo.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(user);
	}

}