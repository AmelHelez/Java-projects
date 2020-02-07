package team.Sport;

public class Manager extends Player{
     private String f_name;
     private String l_name;
     private int y_of_exp;

    public Manager(String f_name,String l_name,int y_of_exp) {
        super(f_name,l_name,y_of_exp);
        this.f_name = f_name;
        this.l_name = l_name;
        this.y_of_exp = y_of_exp;
    }

     public void SetFName(String f_name) {
         this.f_name = f_name;
     }
     public void SetLName(String l_name) {
         this.l_name = l_name;
     }
     public void SetExperience(int y_of_exp) {
         this.y_of_exp = y_of_exp;
     }
     public String GetFName() {
         return f_name;
     }
     public String GetLName() {
         return l_name;
     }
     public int GetExperience() {
         return y_of_exp;
     }

     public String toString() {
         return "Manager { " + f_name + " " + l_name + ", " + y_of_exp + " years of experience. }";
     }

}
