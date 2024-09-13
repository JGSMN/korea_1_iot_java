package chapter15;

// 상속 & 다형성 예제
// 도서(Book) 클래스를 상속받는 전자책(EBook) 클래스 정의
public class EBook extends Book {
    private String downloadLink; // 전자책 다운로드 링크
    
    // 생성자
    public EBook(String title, String author, String isbn, String downloadLink) {
        super(title, author, isbn); // 상위 클래스(Book)의 생성자 호출
        this.downloadLink = downloadLink;
    }
    
    // 전자책 대여
    @Override
    public void borrowBook() throws BookAlreadyBorrowedException {
        super.borrowBook(); // 상위 클래스의 borrowBook 메서드 호출
        System.out.println("다운로드 링크: " + downloadLink);
    }
}