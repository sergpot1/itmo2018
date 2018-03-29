public class Book {

    public String author, title;
    public int pagesNum;

    public Book(String author, String title, int pagesNum){
        this.author = author;
        this.title = title;
        this.pagesNum = pagesNum;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPagesNum(){
        return this.pagesNum;
    }

    public void setPagesNum(int pagesNum){
        this.pagesNum = pagesNum;

    }

    public void setTitle(String title){
        this.title = title;

    }

    public void setAuthor(String author){
        this.author = author;

    }


}
