public class Main {
    public static void main(String[] args) {

        //1 объект
        Author author1 = new Author("Тилли", "Коул");
        Book book1 = new Book("Тысяча поцелуев, которые невозможно забыть", 2020, author1);

        System.out.println("Год издания: " + book1.getPublicationYear());

        book1.setPublicationYear(2022);
        System.out.println("Год издания: " + book1.getPublicationYear());

        //2 объект
        Author author2 = new Author("Стефани", "Майер");
        Book book2 = new Book("Сумерки", 1989, author2);

        System.out.println("Год издания: " + book2.getPublicationYear());

        book2.setPublicationYear(2005);
        System.out.println("Год издания: " + book2.getPublicationYear());
    }
}