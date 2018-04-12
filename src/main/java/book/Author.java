package book;

public class Author {

    private String name;
    private String domainName;
    private char gender;

    public Author(String name, String domainName, char gender){
        this.name = name;
        this.domainName = domainName;
        this.gender = gender;

    }

    public String getDomainName() {
        return domainName;
    }

    public String createBookEmail(){
        return "welit@turnup.org";
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", domainName='" + domainName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

