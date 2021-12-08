package model;

public class Sorceress extends Model{
    private int spellpower;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Sorceress() {
        System.out.println("소서러스가 생성 되었습니다.");
    }

    public Sorceress(int spellpower, int damage) {
        this.spellpower = spellpower;
        this.damage = damage;
    }

    public void attack(){
        System.out.println(this.spellpower +"만큼 마법으로 공격하였습니다.");
    }

    public int getSpellpower() {
        return spellpower;
    }

    public void setSpellpower(int spellpower) {
        this.spellpower = spellpower;
    }
}
