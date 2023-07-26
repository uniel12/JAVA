package ex230703;

public class Ex02BinarySearch {

	public static void main(String[] args) {
		// 검색 알고리즘 - 이진검색
		
		// 요건) 데이터가 오름차순이나 내림차순으로 정리가 되어 있어야함
		// 1) 중간값이랑 찾는 값 비교
		// 2) 검색 범위 다시 지정
		// 3) 그 중 중간값과 찾는 값 비교 반복 후 찾기
		// 마지막 인덱스는 ( array.length -1 )
		// 변수 lowIndex , highIndex 
		
		int[] array = {1, 7, 16, 25, 30, 33, 41, 66, 78, 90}; 
		
		int search = 41;
		
		int lowIndex = 0;
		int highIndex = array.length -1;
		
		
		while(true) {
			int midIndex = (lowIndex+ highIndex)/2; // 0+9/2->4
		
		if(search == array[midIndex]) {
			System.out.println(search + "는 "+ midIndex+ "번 인덱스에 있습니다.");
			break;
		}else if(search > array[midIndex]) {
			lowIndex = midIndex + 1;
		}else if (search < array[midIndex]) {
			highIndex = midIndex - 1;
		}
		
		}
		
		
		
		

	}

}
