package backends.backend_users;



import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
@Entity

public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    
    public void setid(Long id) {this.id=id;}
    public void setemail(String email) {this.email=email;}
    public void setname(String name) {this.name=name;}
    
    public Long getid() {return this.id;}
    public String getname() {return this.name;}
    public String getemail() {return this.email;}
    
}