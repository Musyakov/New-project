package HW12;

public class Main {



    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and peace", levTolstoy, 1867);
        System.out.println("The book's name is " + warAndPeace.getName());
        System.out.println("The book's author is " + levTolstoy.getName() + " " + levTolstoy.getLastName());
        System.out.println("The book's publication year is " + warAndPeace.getPublicationYear());

        Book annaKarenina = new Book("Anna Karenina", levTolstoy, 1873);
        System.out.println("The book's name is " + annaKarenina.getName());
        System.out.println("The book's author is " + levTolstoy.getName() + " " + levTolstoy.getLastName());
        System.out.println("The book's publication year is " + annaKarenina.getPublicationYear());

        Author michailBulgakov = new Author("Michail", "Bulgakov");
        Book theMasterAndMargarita = new Book("The Master and Margarita", michailBulgakov, 1967);
        System.out.println("The book's name is " + theMasterAndMargarita.getName());
        System.out.println("The book's author is " + michailBulgakov.getName() + " " + michailBulgakov.getLastName());
        System.out.println("The book's publication year is " + theMasterAndMargarita.getPublicationYear());
        theMasterAndMargarita.setPublicationYear(1966);
        System.out.println("The correct book's publication year is " + theMasterAndMargarita.getPublicationYear());

    }
}
