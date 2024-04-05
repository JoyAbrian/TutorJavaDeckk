package T1;

class Item {
    String name;
    int damage;
    int health;

    public Item(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void active(Hero hero) {
        hero.setDamage(getDamage() + this.getDamage());
        hero.setHealth(getDamage() + this.getHealth());
    }
}
