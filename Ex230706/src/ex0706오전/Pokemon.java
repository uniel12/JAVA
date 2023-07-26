package ex0706오전;

public class Pokemon {

	// Pokemon 필드
	private String name; // 이름
	private String type; // 속성
	private String gender; //성별
	private int hp; // hp
	private int atk; // 공격력
	private int dps; // 방어력
	private String skill; // 스킬
	
	
	// getter 메소드
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getDps() {
		return dps;
	}
	
	public String getSkill() {
		return skill;
	}
	
	// 메소드
	public Pokemon(String name, String type, String gender, int hp, int atk, int dps, String skill) {
		super();
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.hp = hp;
		this.atk = atk;
		this.dps = dps;
		this.skill = skill;
	}

	
	
}
