package backends.backend_users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import antlr.collections.List;

//@Component
@Service
public class UserServiceImpl  {

    @Autowired
    private UserRepo repository;

    
    public User create(User user) {
        return repository.save(user) ;
    }

    
    public User delete(Long id) {
        User user = findById(id);
        if(user != null){
            repository.deleteById(id);
        }
        return user;
    }

    
    public java.util.List<User> findAll() {
        return (java.util.List<User>) repository.findAll();
    }

    
    public User findById(Long id) {
    	Optional<User> user=repository.findById(id);
    	return user.get();
        
    }

    
    public User update(User user) {
        return null;
    }
}