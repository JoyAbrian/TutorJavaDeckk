package T1;

class Hero {
    String name;
    int damage;
    int health;
    Item item;
    
    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public Hero(String name, int damage, int health, Item item) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.item = item;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void attack(Hero hero) {
        hero.setHealth(getHealth() - this.getDamage());
    }
    
    public void heal() {
        this.health += 200;
    }

    public void ultimate(Hero hero) {
        hero.setHealth(getHealth() - (this.getDamage() * 2));
    }
}