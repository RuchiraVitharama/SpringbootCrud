package backends.backend_users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/getuser/{id}"})
    public User findOne(@PathVariable("id") Long id){
        return userService.findById(id);
    	/* User user= new User();
    	 user.setemail("sfsdcsdv");
    	 user.setid((long) 2);
    	 user.setname("wffew");
    	 return user;*/
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping(path ={"/deleteuser/{id}"})
    public User delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @GetMapping(path = "/getall")
    public List findAll(){
        return userService.findAll();
    }
}
