import java.util.HashSet;
import java.util.Set;

public class Group {
    Set<Student> members = new HashSet<>();
    String name;

    private ResponsibleStudent head;

    public ResponsibleStudent getHead() {
        return head;
    }

    public void setHead(ResponsibleStudent candidate) {
        if (members.contains(candidate)) {
            this.head = candidate;
            candidate.takeGroup(this);
        }
        else
            System.out.println("ошибка! "+candidate.getName()+" не числится в группе "+this.name);
    }

    public Group(String name) {
        this.name = name;
    }

    public void enlist(Student s)
    {
        members.add(s);
    }

    public void remove(Student s)
    {
        members.remove(s);
    }
}
