package be.vdab.books;

public class BookApp{
    public static void main(String[] args) {
        Author jos = new Author("Jos DenOs", "josdenos@gmail.com", 'm');
        Book farm = new Book("Farms", "Jos DenOs", 20.5, 5);

        System.out.println(jos.getEmail());
        jos.setEmail("josdenos@hotmails.com");
        System.out.println(jos.getEmail());
        System.out.println(jos.getGender());
        System.out.println(jos.getNameAuthor());
        jos.setNameAuthor("Jos den OOOOS");


        System.out.println(jos.toString());


        System.out.println(farm.getPrice());
        farm.setPrice(21);
        farm.setQty(10);
        System.out.println(farm.getAuthor());
        System.out.println(farm.getNameAuthor());

        System.out.println(farm.toString());


    }
}
