package model;

public class Model {
    private int maxHp;
    private int maxMp;
    private String name;
    private int hp;
    private int exp;
    private int needExp;
    private int mp;
    private int lv;
    private int attackPt;

    public Model() {
    }

    public Model(String name, int hp, int exp, int mp, int lv, int attackPt) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.mp = mp;
        this.lv = lv;
        this.attackPt = attackPt;
    }

    public void attack(Mod mob){

        mob.setHp(mob.getHp() - attackPt);
    }

    public void run() {
        System.out.println("도망갑니다!!");
    }

    public void rest() {
        hp = maxHp;
        mp = maxMp;
        System.out.println("Hp, Mp가 모두 회복되었습니다.");
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getNeedExp() {
        return needExp;
    }

    public void setNeedExp(int needExp) {
        this.needExp = needExp;
    }

    public void levelUp() {

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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getAttackPt() {
        return attackPt;
    }

    public void setAttackPt(int attackPt) {
        this.attackPt = attackPt;
    }
}