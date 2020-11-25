package Tugas;

/**
 *
 * @author Aulafz
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                this.health += (3 / 100 * this.health);
                break;
            case 2:
                this.health += (4 / 100 * this.health);
                break;
            case 3:
                this.health += (5 / 100 * this.health);
                break;

        }

    }

    @Override
    public void destroyed() {
        this.health -= (this.health * 10 / 100);
    }

    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n" + info;
    }
}
