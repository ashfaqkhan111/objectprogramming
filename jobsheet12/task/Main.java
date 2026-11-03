package jobsheet12.task;

public class Main {

    public static void main(String[] args) {

        Plant plant = new Plant();

        WalkingZombies wz = new WalkingZombies(100, 1);
        JumpingZombies jz = new JumpingZombies(100, 2);
        Barrier barrier = new Barrier(100);

        // Walking Zombie
        System.out.println("=== WALKING ZOMBIE ===");

        System.out.println(wz.getZombiesInfo());

        wz.heal();
        System.out.println(wz.getZombiesInfo());

        plant.doDestroy(wz);
        System.out.println(wz.getZombiesInfo());

        System.out.println("---------------------------");

        // Jumping Zombie
        System.out.println("=== JUMPING ZOMBIE ===");

        System.out.println(jz.getZombiesInfo());

        jz.heal();
        System.out.println(jz.getZombiesInfo());

        plant.doDestroy(jz);
        System.out.println(jz.getZombiesInfo());

        System.out.println("---------------------------");

        // Barrier
        System.out.println("=== BARRIER ===");

        System.out.println(barrier.getBarrierInfo());

        plant.doDestroy(barrier);
        System.out.println(barrier.getBarrierInfo());
    }
}