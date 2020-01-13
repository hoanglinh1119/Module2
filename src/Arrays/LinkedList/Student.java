package Arrays.LinkedList;

public class Student {
    private String name;
    private String id;
    private int year;
    private String address;

    public Student() {
    }

    public Student(String name, String id, int year,String address) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void disPlay(){
        System.out.printf("%-40s%-10s%-10s%-50s%n",getName(),getId(),getYear(),getAddress());
    }
}
