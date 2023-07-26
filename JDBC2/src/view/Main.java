package view;

import java.util.Scanner;

import controller.BookController;

import model.BookDTO;

public class Main {

	public static void main(String[] args) {

		// 도서관리 프로그램
		Scanner sc = new Scanner(System.in);
		BookDTO dto =null; 
		BookController con = new BookController();

		while (true) {
			System.out.print("[1]도서등록 [2]도서검색 [3]도서전체조회" 
		+ " [4]도서삭제 [5]도서정보변경 [6]종료 >> ");
			int select = sc.nextInt(); // 사용자가 선택

			if (select == 1) {
				// 도서등록(insert)
				// 사용자로부터 책제목, 저자, 가격, 번호를 입력받아
				// 데이터베이스에 저장하자!
				// 저장이 성공하면 "도서등록이 왼료되었습니다!"
				// 저장이 실패하면 "도서등록이 실패했습니다. 다시 시도하세요"

				System.out.print("책 제목 : ");
				String title = sc.next();
				System.out.print("책 저자 : ");
				String name = sc.next();
				System.out.print("책 가격 : ");
				int price = sc.nextInt();
				System.out.print("책 번호 : ");
				String booknum = sc.next();

				dto = new BookDTO(title, name, price, booknum);
				// controller에 있는 insert에다가 dto를 전송(전달)
				// 1. Controller 객체 생성
				con.insert(dto);

			} else if (select == 2) {
				// 도서검색(selectOne)
				// 사용자가 책제목을 검색했을 때
				// 데이터가 있으면 "책제목(저자) : 가격 - 책번호"
				// 데이터가 없으면 "찾으시는 책은 현재 재고가 없습니다."
				System.out.print("찾으시는 책 제목 입력하세요 >> ");
				String title = sc.next();
			
				con.selectOne(title);

			} else if (select == 3) {
				// 도서전체조회(selectAll)
				// 책제목 가격 저자 번호

				con.selectAll();

			} else if (select == 4) {
				// 도서삭제(delete)
				// 책 번호를 입력받아서 해당 책에 대한 정보를 삭제해주세요
				// 삭제 성공시 "책에 대한 정보가 삭제되었습니다."
				// 삭제 실패시 "책 번호를 다시 한번 확인해주세요."
				System.out.print("삭제할 책 번호을 입력해주세요 >> ");
				String booknum = sc.next();
			
				con.delete(booknum);

			} else if (select == 5) {
				// 도서정보변경(update)
				// 책 제목을 입력받아 책의 번호와 책의 가격을 변경하자!
				System.out.print("업데이트하려는 기존 책 제목을 입력헤주세요 >> ");
				String title = sc.next();
				System.out.print("변경할 책 번호를 입력하세요 >> ");
				String booknum = sc.next();
				System.out.print("변경할 책 가격을 입력하세요 >>  ");
				int price = sc.nextInt(); 
				
				dto = new BookDTO(title, null,price ,booknum);
				con.update(dto);

			} else if (select == 6) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 선택해 주세요!.");
			}

		}
sc.close();
	}

}
