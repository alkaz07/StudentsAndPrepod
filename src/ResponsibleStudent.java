public class ResponsibleStudent extends Student{

    private Group myGroup = null;
    public ResponsibleStudent(String name) {
        super(name);
    }

    public void takeGroup(Group gr)
    {
        myGroup = gr;
    }

    public int howManyStudentsInMyGroup()
    {
        if (myGroup != null)
            return myGroup.members.size();
        else
            return -1;
    }
}
