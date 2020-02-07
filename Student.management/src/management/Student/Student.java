package management.Student;

import java.util.ArrayList;
public class Student {
    private String f_name;
    private String l_name;
    private ArrayList<TestResult> results;

    public ArrayList<TestResult> getScore() {
        return results;
    }
    public String GetFName() {
        return f_name;
    }
    public String GetLName() {
        return l_name;
    }
    public void SetFName(String f_name) {
        this.f_name = f_name;
    }
    public void SetLName(String l_name) {
        this.l_name = l_name;
    }

    public Student(String f_name,String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.results = new ArrayList<>();
    }
    public Student(String f_name,String l_name,ArrayList<TestResult> results) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.results = results;
    }

    public String toString() {
        return "Student { " + f_name + " " + l_name + ", GPA =  " + this.Average(results) + " }";
    }
    public static double Average(ArrayList<TestResult> results) {
        double sum = 0;
        double avg,average;
        for(int i = 0; i < results.size(); i++) {
            sum += results.get(i).getScore();
        }
      average = sum/results.size();
      avg = Math.round(100 * average)/100D;
      return avg;
    }
    public static  int bestScore(ArrayList<TestResult>results) {
       int max = results.get(0).getScore();
       for(int i = 0; i < results.size(); i++) {
           if(max <= results.get(i).getScore())
           {
               max = results.get(i).getScore();
           }
       }
       return max;
    }
    public static  int worstScore(ArrayList<TestResult>results) {
        int min = results.get(0).getScore();
        for(int i = 0; i < results.size(); i++) {
            if(min >= results.get(i).getScore())
            {
                min = results.get(i).getScore();
            }
        }
        return min;
    }



}
