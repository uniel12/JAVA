package controller;

import java.util.ArrayList;

import model.BookDAO;
import model.BookDTO;

public class BookController {
	BookDAO dao = new BookDAO();
	int cnt = 0;

	// main에서 보낸 dto를 받아줄 insert라는 메소드 만들기
	public void insert(BookDTO dto) {
		cnt = dao.insert(dto); // dao 결과값 : cnt
		if (cnt > 0) {
			System.out.println("도서등록이 완료되었습니다!");
		} else {
			System.out.println("도서등록이 실패했습니다. 다시 시도하세요");
		}
	}

	// main에서 보낸 dto를 받아줄 selectOne이라는 메소드 만들기
	public void selectOne(String title) {
		BookDTO dto = dao.selectOne(title);

		String db_title = dto.getTitle();
		String name = dto.getName();
		int price = dto.getPrice();
		String booknum = dto.getBooknum();
		
		if(db_title.equals(title)) {
		System.out.printf("%s(%s) : %d원 - %s번%n", db_title, name, price, booknum);
		} else {
			System.out.println("찾으시는 책은 현재 재고가 없습니다.");
		}
	}

	// main에서 보낸 dto를 받아줄 selectAll이라는 메소드 만들기
	public void selectAll() {
		ArrayList<BookDTO> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			String title = list.get(i).getTitle();
			String name = list.get(i).getName();
			int price = list.get(i).getPrice();
			String booknum = list.get(i).getBooknum();

			// 1.해와달(나무꾼) : 5000원 - A500번
			System.out.printf("%d. %s(%s) : %d원 - %s번%n",
							i + 1, title, name, price, booknum);
		}

	}

	// main에서 보낸 dto를 받아줄 delete라는 메소드 만들기
	public void delete(String booknum) {
		cnt = dao.delete(booknum);
		if (cnt > 0) {
			System.out.println("책에 대한 정보가 삭제되었습니다.");
		} else {
			System.out.println("책 번호를 다시 한번 확인해주세요.");
		}
	}

	// main에서 보낸 dto를 받아줄 update라는 메소드 만들기
	public void update(BookDTO dto) {
		cnt = dao.update(dto);

		if (cnt > 0) {
			System.out.println(dto.getTitle() + "책 업데이트 완료!!");
		} else {
			System.out.println("책 업데이트 실패..");
		}

	}

}
