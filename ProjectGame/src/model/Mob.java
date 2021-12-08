package model;

public class Mob {
    private String name;
    private int hp;
    private int exp;
    private int attackPt;

    public Mob(String name, int hp, int exp, int attackPt) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.attackPt = attackPt;
    }

    public void attack(Model model) {

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
