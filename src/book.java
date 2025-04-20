class book {
    private String title;
    private author author;
    private int publicationYear;
    // Конструктор
    public book(String title, author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    // Геттеры
    public String getTitle() {
        return title;
    }
    public author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    // Сеттер для года публикации
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}