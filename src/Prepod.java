public class Prepod extends Person{
    String discipline;
    public Prepod(String name) {
        super(name);
    }

    public Prepod(String name, String discipline) {
        super(name);
        this.discipline = discipline;
    }

    public void workWithGroup(Group gr)
    {
        ResponsibleStudent st = askForHead(gr);
        System.out.println("Скажи, "+st.getName()+", сколько у вас народу в списке?");
        int k = st.howManyStudentsInMyGroup();
        System.out.println("я выяснил, что в группе "+gr.name+" числится "+k+" студентов");
    }
    public ResponsibleStudent askForHead(Group gr)
    {
        System.out.println("Ребята, кто у вас староста?");
        ResponsibleStudent starosta = gr.getHead();
        return starosta;
    }
}
