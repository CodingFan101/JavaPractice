public class Professor extends ProfessorDemo {
    private String name;
    private String degree;
    
public Professor(String name, String degree){
    this.name = name;
    this.degree = degree;
}

public void setDegree(String choice){
    degree = choice;
}
public void setName(String nam){
    name = nam;
}
public String getDegree(){
    return degree;
}
public String getName(){
    return name;
}
}
