package ba.edu.ssst;

public abstract class Person {
    private final String f_name;
    private final String l_name;

    public Person(String f_name,String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return this.l_name;
    }


}
