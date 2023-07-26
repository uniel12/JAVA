package ex0706오전;

public class PokemonMain {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 배열이름 = new 자료형 [배열크기];
		// 포켓몬 자료 3개를 저장할 수 있는 배열 생성-> bag

		Pokemon[] bag = new Pokemon[3];
		// bag[0]에 포켓몬 하나 넣기

		bag[0] = new Pokemon("피카츄", "전기", "수", 1000, 500, 500, "백만볼트");
		bag[1] = new Pokemon("꼬부기", "물", "수", 800, 500, 700, "물대포");
		bag[2] = new Pokemon("파이리", "불", "암", 900, 700, 400, "화염방사");

		// for문을 사용해서 배열안에 들어있는 포켓몬들의 이름, 속성, hp, atk, dps, skill
		// 형식
		// ===== 포켓몬 정보 출력=====
		// 1) 피카츄 전기 수 1000 500 500 백만볼트
		// 2) 꼬부기 물 수 800 500 700 물대포
		// 3) 파이리 불 암 900 700 400 화염방사
		
		System.out.println("===== 포켓몬 정보 출력======");
		
		for (int i = 0; i < bag.length; i ++) {
			System.out.printf("%d) %s\t%s\t%s\t%d\t%d\t%d\t%s%n", 
							i + 1, 
							bag[i].getName(), 
							bag[i].getType(),
							bag[i].getGender(), 
							bag[i].getHp(), 
							bag[i].getAtk(), 
							bag[i].getDps(), 
							bag[i].getSkill()
							);
		}
		// for-each(확장 for문)
		// 배열과 같이 여러 개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리)
		// 배열안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준 왼쪽에 있는 변수에 담아 사용함
		// for(자료형 변수명 : 배열명)
		System.out.println("=====for-each문=====");
		int i = 1;
		for (Pokemon poke : bag ) {
			
			System.out.printf("%d) %s\t%s\t%s\t%d\t%d\t%d\t%s\n",
					i++,poke.getName(),poke.getType(),poke.getGender(),poke.getHp(),
					poke.getAtk(),poke.getDps(),poke.getSkill()
					);
		}
	}
}
