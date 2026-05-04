import java.util.ArrayList; 
public class Main { 
    static ArrayList<String> students = new ArrayList<>();
    static void addStudent(String name){
        students.add(name);
        System.out.println(name +"added.");
    } 
    static void viewStudents(){
        System.out.println("Student List:");
        for (String s : students){
            System.out.println("-" + s);
        }
    }
    static void deleteStudent(String name){
        if(students.remove(name)){
            System.out.println(name +"removed.");
        }else{
            System.out.println(name +"not found.");
        }
    }
    static void countStudents(){
        System.out.println("Totalstudents:" + students.size());

    }
    static void searchStudent(String name){
        boolean found = false;
        for (String s : students){
            if (s.equalsIgnoreCase(name)) {
            found = true;
            break;
        }
    }
    if (found) {
        System.out.println(name + " found in the list.");
    } else {
        System.out.println(name + " not found.");
    }
        }
        static void updateStudent(String oldName, String newName) {
    int index = -1;
    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).equalsIgnoreCase(oldName)) {
            index = i;
            break;
        }
    }
    if (index != -1) {
        students.set(index, newName);
        System.out.println(oldName + " updated to " + newName);
    } else {
        System.out.println(oldName + " not found.");
    }
}
    
 
 public static void main(String[] args) { 
   System.out.println("Student Record Manager"); 
   addStudent("Alice");
   addStudent("Bob");
   viewStudents();
   deleteStudent("Alice");
   viewStudents();
   countStudents();
   searchStudent("alice");  // Case insensitive test
    searchStudent("Charlie");
    updateStudent("bob", "Robert");
    viewStudents();


} 
}