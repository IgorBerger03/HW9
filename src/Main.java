public class Main {

    public static void main(String[] args) {
        Author publisher1 = new Author("Джек","Лондон");
        Author publisher2 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Мартин Иден", publisher1, 1909);
        Book book2 = new Book("Сияние", publisher2, 1977);
        book1.setYear(1910);
        book2.setYear(1980);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println("Измененный год публикации: " + book1.getYear());
        System.out.println("Измененный год публикации: " + book2.getYear());

        System.out.println(book1.equals(book1));
        System.out.println(book1.hashCode() == book1.hashCode());
    }
}