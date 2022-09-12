package pro.sky.java.course8.homework9;

public class App {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Lev", "Tolstoy");
        Author secondAuthor = new Author("Dmitriy", "Glushovskiy");
        Book firstBook = new Book ("War and piece", firstAuthor, 1865);
        Book secondBook = new Book("Metro 2033", secondAuthor, 2005);
        System.out.println(firstBook.getNameBook() + ". " + firstBook.getAuthor().getNameAuthor()+ " " + firstBook.getAuthor().getSurnameAuthor() + ". " + firstBook.getYearOfPublication());
        System.out.println(secondBook.getNameBook() + ". " + secondBook.getAuthor().getNameAuthor()+ " " + secondBook.getAuthor().getSurnameAuthor() + ". " + secondBook.getYearOfPublication());
      firstBook.setYearOfPublication(2022);
        System.out.println(firstBook.getYearOfPublication());
        String bookFirstInfo = firstBook.toString();
        String bookSecondInfo = secondBook.toString();
        System.out.println(bookFirstInfo);
        System.out.println(bookSecondInfo);
        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstAuthor.equals(secondAuthor));

    }
    }
