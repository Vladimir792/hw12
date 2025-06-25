public class app {
    public static void main(String[] args) {
        // Создаем авторов
        author author1 = new author("George", "Orwell");
        author author2 = new author("Aldous", "Huxley");

        // Создаем книги
        book book1 = new book("1984", author1, 1949);
        book book2 = new book("Brave New World", author2, 1932);

        // Выводим информацию о книгах
        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());

        // Изменяем год публикации одной из книг
        book1.setPublicationYear(1950);
        System.out.println("Updated Year of Publication for " + book1.getTitle() + ": " + book1.getPublicationYear());
    }
}