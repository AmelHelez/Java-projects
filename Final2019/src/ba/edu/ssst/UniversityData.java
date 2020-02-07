package ba.edu.ssst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UniversityData {
    private ArrayList<Shop> students;
    private ArrayList<Service> services;

    public UniversityData() {
        this.students = new ArrayList<>();
    }

    public UniversityData(ArrayList<Shop> students) {
        this.students = students;
    }

    public ArrayList<Shop> getStudents() {
        return students;
    }

    public void readFromFile(Path path, Path path2) throws IOException, ParseException {
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            String[] attrs = line.split(", ");
            String shopName = attrs[0];
            Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(attrs[1]);
            Integer numbEmp = Integer.parseInt(attrs[2]);
            Double profit = Double.parseDouble(attrs[3]);
            Double revenue = Double.parseDouble(attrs[4]);
            ArrayList<Grade> grades = new ArrayList<>();

            Shop shop = new Shop(shopName, dob, numbEmp, profit, revenue);

            students.add(shop);

            List<String> lines2 = Files.readAllLines(path2);

            for (String l : lines2) {
                String[] attr = l.split(", ");
                String servType = attrs[0];
                Integer marketSize = Integer.parseInt(attrs[2]);
                Double totalMoney = Double.parseDouble(attrs[3]);
                ArrayList<Grade> grades = new ArrayList<>();

                Service service = new Service(servType, marketSize, totalMoney);
                services.add(service);
                Comparator<Shop> comparator = new Comparator<Shop>() {
                    @Override
                    public int compare(Shop o1, Shop o2) {

                        return (int) (o2.getAverage() - o1.getAverage());
                    }
                };

                Collections.sort(students, comparator);
            }
        }
    }
//shopsPerService
    public Map<String, Integer> studentsPerCourse() {
        Map<String, Integer> map = new HashMap<>();

        for (Service service : services) {

            for (Shop grade : students) {
                if (map.containsKey(grade.getName())) {
                    map.replace(grade.getName(), map.get(grade.getName() + 1));
                } else {
                    map.put(grade.getName(), 1);
                }
            }
        }
        return map;
    }

    public String studentsPerCourseReport() {
        Map<String, Integer> map = studentsPerCourse();

        String report = "Students per course: \n";

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            report = report + e.getKey() + " =  " + e.getValue() + "\n";
        }
        return report;
    }

    public int max(String course) {

        int max = 0;

        for (Service service : services) {
            for (Shop shop : students) {
                if (Objects.equals(services., course) && grade.getNumberOfPoints() > max) {
                    max = grade.getNumberOfPoints();
                }
            }
        }
        return max;

    }

    public int min(String course) {

        int min = 100;

        for (Student student : students) {
            for (Grade grade : student.getGrades()) {
                if (Objects.equals(grade.getCourse().getCourseName(), course) && grade.getNumberOfPoints() < min) {
                    min = grade.getNumberOfPoints();
                }
            }
        }
        return min;

    }

    public Map<String, ArrayList<Student>> maximumPointsPerCourse() {
        Map<String, ArrayList<Student>> map = new HashMap<>();


        //Set<String> courses = this.studentsPerCourse().keySet();

        for (Student student : students) {

            for (Grade grade : student.getGrades()) {
                if (grade.getNumberOfPoints() == max(grade.getCourse().getCourseName())) {
                    if (map.containsKey(grade.getCourse().getCourseName())) {
                        ArrayList<Student> s = map.get(grade.getCourse().getCourseName());
                        s.add(student);
                        map.replace(grade.getCourse().getCourseName(), s);
                    } else {
                        ArrayList<Student> s = new ArrayList<>();
                        s.add(student);
                        map.put(grade.getCourse().getCourseName(), s);
                    }
                }
            }
        }

        return map;
    }

    public Map<String, ArrayList<Student>> maximumPointsPerCourseThreaded() throws InterruptedException {

        Set<String> courses = this.studentsPerCourse().keySet();
        ArrayList<Thread> threads = new ArrayList<>();
        for (String course : courses) {
            threads.add(new Thread(new MaxThreaded(course, this)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Map<String, ArrayList<Student>> max = SyncThreaded.map;
        SyncThreaded.map = new HashMap<>();
        return max;

    }


    public String maximumPointsPerCourseReport() throws InterruptedException {
        Map<String, ArrayList<Student>> map = maximumPointsPerCourseThreaded();

        String report = "Best student(s) per course: \n";

        for (Map.Entry<String, ArrayList<Student>> e : map.entrySet()) {
            report = report + e.getKey() + ": \n";
            for (Student s : e.getValue()) {
                report += s.getInfo() + " " + max(e.getKey()) + "\n";
            }
        }

        return report;
    }


    public Map<String, ArrayList<Student>> minimumPointsPerCourse() {
        Map<String, ArrayList<Student>> map = new HashMap<>();


        Set<String> courses = this.studentsPerCourse().keySet();

        for (Student student : students) {

            for (Grade grade : student.getGrades()) {
                if (grade.getNumberOfPoints() == min(grade.getCourse().getCourseName())) {
                    if (map.containsKey(grade.getCourse().getCourseName())) {
                        ArrayList<Student> s = map.get(grade.getCourse().getCourseName());
                        s.add(student);
                        map.replace(grade.getCourse().getCourseName(), s);
                    } else {
                        ArrayList<Student> s = new ArrayList<>();
                        s.add(student);
                        map.put(grade.getCourse().getCourseName(), s);
                    }
                }
            }
        }

        return map;
    }

    public Map<String, ArrayList<Student>> minimumPointsPerCourseThreaded() throws InterruptedException {

        Set<String> courses = this.studentsPerCourse().keySet();
        ArrayList<Thread> threads = new ArrayList<>();
        for (String course : courses) {
            threads.add(new Thread(new MinThreaded(course, this)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Map<String, ArrayList<Student>> min = SyncThreaded.map;
        SyncThreaded.map = new HashMap<>();
        return min;

    }

    public String minimumPointsPerCourseReport() throws InterruptedException {
        Map<String, ArrayList<Student>> map = minimumPointsPerCourseThreaded();

        String report = "Worst student(s) per course: \n";

        for (Map.Entry<String, ArrayList<Student>> e : map.entrySet()) {
            report = report + e.getKey() + ": \n";
            for (Student s : e.getValue()) {
                report += s.getInfo() + " " + min(e.getKey()) + "\n";
            }
        }

        return report;
    }

    public List<Student> topTen() {

        return students.subList(0, 10);
    }

    public String topTenReport() {

        List<Student> list = topTen();
        String report = "Top ten students are: \n";

        for (Student s : list) {
            report += s.getInfo() + " " + s.getAverage() + "\n";
        }

        return report;
    }

    public List<Student> lastTen() {

        return students.subList(students.size() - 10, students.size());
    }

    public String lastTenReport() {

        List<Student> list = lastTen();
        String report = "Last ten students are: \n";

        for (Student s : list) {
            report += s.getInfo() + " " + s.getAverage() + "\n";
        }

        return report;
    }

    public void report() throws IOException, InterruptedException {
        System.out.println(toString());
        System.out.println(studentsPerCourseReport());
        System.out.println(maximumPointsPerCourseReport());
        System.out.println(minimumPointsPerCourseReport());
        System.out.println(topTenReport());
        System.out.println(lastTenReport());

        writeReports();
    }


    private void writer(Path path, String string) throws IOException {
        Files.write(path, string.getBytes(), StandardOpenOption.CREATE);
    }

    private void writeReports() throws IOException, InterruptedException {
        writer(Paths.get("src/all.txt"), toString());
        writer(Paths.get("src/best.txt"), topTenReport());
        writer(Paths.get("src/worst.txt"), lastTenReport());
        writer(Paths.get("src/spc.txt"), studentsPerCourseReport());
        writer(Paths.get("src/minPoints.txt"), minimumPointsPerCourseReport());
        writer(Paths.get("src/maxPoints.txt"), maximumPointsPerCourseReport());
    }

    @Override
    public String toString() {
        String output = "All students are: \n";
        for (Student student : students) {
            output += student + "\n";
        }
        return output;
    }
}
