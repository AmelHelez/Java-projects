package ba.edu.ssst;

public class Person {
    private String f_name;
    private String l_name;
    private String d_of_birth;

    /*public Person() {
        this.f_name = "";
        this.l_name = "";
        this.d_of_birth = "unknown";
    }*/

    public Person(String f_name,String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.d_of_birth = "unknown";
    }

    public Person(String f_name,String l_name,String d_of_birth) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.d_of_birth = d_of_birth;
    }

    public String getFname() {
        return f_name;
    }

    public String getLname() {
        return l_name;
    }

    public String getBirth() {
        return d_of_birth;
    }


    @Override
    public String toString() {
        return this.f_name + " " + this.l_name + " [" +  this.d_of_birth + "]";
    }
}
