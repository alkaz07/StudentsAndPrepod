public class Main {
    public static void main(String[] args) {
        Person p1 = new Prepod("Алекс");
        Prepod prep = (Prepod) p1;
        prep.discipline = "Java";
        Prepod prep2 = new Prepod("Василий","история античности");

        Group group1 = new Group("программисты летние");
        group1.enlist(new Student("Гриша"));
        group1.enlist(new Student("Маша"));

        System.out.println("сейчас в группе "+group1.members.size()+" студентов");

        Student rs = new ResponsibleStudent("Елена");
        group1.enlist(rs);
        group1.setHead((ResponsibleStudent) rs);
        System.out.println("сейчас в группе "+group1.members.size()+" студентов");

        prep.workWithGroup(group1);

    }
}