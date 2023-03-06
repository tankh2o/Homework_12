package homework_12;

public class Author {
        public Author (String name, String family) {
        this.name = name;
        this.family = family;
    }

        public String name;
        public String family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
