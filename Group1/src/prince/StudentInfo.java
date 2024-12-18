package prince;


public class StudentInfo {
    String Name, Course;
    int Id, Age, Year;
    
    StudentInfo(int Id, String Name, int Age, String Course, int Year){
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Course = Course;
        this.Year = Year;
    }
    

    public String getName() {
        return Name;
    }

    public int setId() {
        return Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
    

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public String toString(){
        return "ID: "+Id+"\nName: "+Name+"\nAge: "+Age+"\nCourse: "+Course+"\nYear: "+Year;
    }
    
    
}



