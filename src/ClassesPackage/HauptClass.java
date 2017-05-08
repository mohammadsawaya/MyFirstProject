package ClassesPackage;

/**
 * Created by redi on 5/8/17.
 */
public class HauptClass {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String  email;
    int Tel;

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }
    public void Addemplyee(int i,String n,String e,int t){
        name=n;
        id=i;
        email=e;
        Tel=t;
    }
    public void Printemployee(){
        System.out.println("the name is:"+name+"\nenmail Addresse :"+email);
    }
}
