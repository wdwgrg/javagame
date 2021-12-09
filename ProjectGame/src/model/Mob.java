package model;

public class Mob {
    private String name;
    private int hp;
    private int exp;
    private int attackPt;
    private int gold;

    public Mob(String name, int hp, int exp, int attackPt) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.attackPt = attackPt;
    }

    public int getGold() {
        return gold;
    }

    public void attack(Model model) {
        model.setHp(model.getHp() - attackPt);
        System.out.println(name + "에게" + attackPt + "만큼 공격받았습니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAttackPt() {
        return attackPt;
    }

    public void setAttackPt(int attackPt) {
        this.attackPt = attackPt;
    }
}
