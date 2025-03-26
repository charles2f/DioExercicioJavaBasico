public class PetMachine {

    static String getName;

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet = null;

    public void takeAShower() {
        if (this.pet == null) {
            System.err.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.err.println("O pet " + pet.getName() + " está limpo");

    }

    public void addWater() {
        if (water == 30) {
            System.err.println("A capacidade de agua da máquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.err.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }

    public String getName() {
        return getName;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }   

    public void setPet(Pet pet) {

        if (!this.clean) {
            System.err.println("A máquina está suja, limpe-a antes de colocar o pet");
            return;
        }
        if (hasPet()) {
            System.err.println("O Pet " + this.pet.getName() + " já está na máquina");
            return;
        }

        this.pet = pet;
        getName = pet.getName();
        System.out.println("O Pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.err.println("O pet " + this.pet.getName() + " foi removido da máquina");
            this.pet = null;
        }

    public void washMachine() {
        if (hasPet()) {
            System.err.println("Remova o pet da máquina antes de lavá-la");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;

        this.clean = true;
        System.err.println("A máquina foi limpa");
    }

}
