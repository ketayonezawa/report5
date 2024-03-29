package jp.ac.uryukyu.ie.e195731;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getHitPoint() {
        return hitPoint;
    }


    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead(){
        return  dead;
    }
    public String getName(){
        return name;
    }

    /**対象を攻撃をするメソッド
     *
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (dead!=true){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }}
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
