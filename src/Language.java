public class Language {
    private String name;
    private Double ranking;

    public Language(String name) {
        this.name = name;
        //this.ranking = ranking;
    }

    public void fun(TestClass n){
        System.out.println("fun1");
    }
    public void fun(TestClass2 n){
        System.out.println("fun2");
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Язык программирования - " + name + ", рейтинг  - " + ranking + "% опрошенных.";
    }
}