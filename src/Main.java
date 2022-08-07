public class Main {

    public static void main(String[] args) {
        Author publisher1 = new Author("Джек","Лондон");
        Author publisher2 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Мартин Иден", publisher1, 1909);
        Book book2 = new Book("Сияние", publisher2, 1977);
        book1.setYear(1910);
        book2.setYear(1980);
        System.out.println("Название:" + book1.getTitle() + ", " + "Автор:" + publisher1 + ", " + "Год:" + book1.getYear());
        System.out.println("Название:" + book2.getTitle() + ", " + "Автор:" + publisher2 + ", " + "Год:" + book2.getYear());
        System.out.println("Измененный год публикации:" + book1.getYear());
        System.out.println("Измененный год публикации:" + book2.getYear());

    }
}