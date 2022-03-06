package book;

public class BookList {
    private Book[] books=new Book[3];
    private int usedSize;
    public BookList(){
        books[0]=new Book("三国演义","罗贯中",22.8,"小说");
        books[1]=new Book("西游记","吴承恩",12.8,"小说");
        books[2]=new Book("水浒传","施耐庵",52.8,"小说");
        this.usedSize=3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    /**
     * 获取pos位置的书的信息
     * @param pos
     * @return
     */
    public Book getPos(int pos){
        return this.books[pos];
    }

    /**
     * 更新pos位置的书的信息
     * @param pos
     * @param book
     */
    public void updsteBooks(int pos,Book book){
        this.books[pos]=book;

    }
}
