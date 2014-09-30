public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

//コンストラクタ 本棚に格納される本の数を定義
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

//indexの引数の配列に格納されたBookの参照を返す
    public Book getBookAt(int index) {
        return books[index];
    }

 //配列に bookの参照を格納して lastを一つ増やす
   public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

//配列の長さを返す
   public int getLength() {
        return last;
    }
//　Iteratorを作成する
   public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
