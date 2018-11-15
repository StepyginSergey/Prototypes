package test.bean;

public class TestPersonBean {
    public static void main(String[] args) {
        PersonBean person = new PersonBean();
        person.setName("Bob");
        person.setDeceased(true);

        // Результат: "Bob [deceased]"
        System.out.print(person.getName());
        System.out.println(person.isDeceased() ? " [deceased]" : " [alive]");
    }
}
