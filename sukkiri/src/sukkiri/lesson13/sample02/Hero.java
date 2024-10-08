package sukkiri.lesson13.sample02;


public class Hero {
	
	//フィールド
	private int hp;
	 String name;
	private Sword sword;
	
	//13-8
	//getter
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	
	//13-10
	//setter(セットするだけなので、戻り値なし)
	public void setName(String name) {
		this.name =name;
	}
	
	public void sestHp(int hp) {
		this.hp = hp;
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		/* … */
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0 ) {
			this.die();
		}
	}

}