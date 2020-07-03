package be.vdab.books;

public class Author {
    private String nameAuthor;
    private String email;
    private char gender;

    public Author(String nameAuthor, String email, char gender) {
        if (!(gender == 'v' || gender == 'x' || gender == 'm'))
            throw new IllegalArgumentException("Gender must be V, M or X "+ gender);
        this.nameAuthor = nameAuthor;
        this.email = email;
        this.gender = gender;

        }


    public Author() {

    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + nameAuthor + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
