package test.bean;

public class PersonBean implements java.io.Serializable {

    private String name;
    private boolean deceased;

    // Методы геттеры (get) и сеттеры (set)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isDeceased() {
        return deceased;
    }
    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    //Переопределенные методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonBean that = (PersonBean) o;

        if (deceased != that.deceased) {
            return false;
        }
        return !(name != null ? !name.equals(that.name) : that.name != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (deceased ? 1 : 0);
        return result;
    }

    //Переопределенный метод toString()
    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", deceased=" + deceased +
                '}';
    }

}
