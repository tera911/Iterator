public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

//コンストラクタ 本棚を作成する
// BookShelfクラスを集約している
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

//boolean型で次の要素が存在してるかどうかを返す
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

// nextメソッド　現在注目している本(Bookのインスタンス）を
// 返して　次のに進めるためのメソッド
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
