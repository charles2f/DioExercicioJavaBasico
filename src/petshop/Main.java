package petshop;

import java.util.Scanner;

public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    
    public static void main(String[] args) throws Exception {

        int option;

        do { 
            System.err.println("===Escolha uma das opções===");
            System.err.println("1 - Dar banho no pet");
            System.out.println("2 - Adicionar água");
            System.out.println("3 - Adicionar shampoo");
            System.out.println("4 - verificar água");
            System.out.println("5 - verificar shampoo");
            System.out.println("6 - verificar pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> addWater();
                case 3 -> addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine(); 
                case 7 -> addPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.out.println("Saindo..."); 
                default -> System.err.println("Opção inválida");

            }

        } while (option != 0);


    }

    // Trata as funções para a opção 7.
    public static void addPetInPetMachine() {
        var name = "";

        while (name.isEmpty()) {
            scanner.nextLine(); // Consumir a quebra de linha pendente
            System.err.println("Digite o nome do pet");
            name = scanner.nextLine();
        }
         
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

    // Trata as funções para a opção 6.
    public static void checkIfHasPetInMachine() {
        
        if (petMachine.hasPet()) {
            System.out.println("O pet " + PetMachine.getName +" está na máquina");
        } else {
            System.err.println("Não há pet na máquina");
        }
    }
    
    // Trata as funções para a opção 5. 
    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " Litro(s) de de shampoo");
    }

    // Trata as funções para a opção 4.
    public static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " Litro(s) de de água");
    }

    // Trata as funções para a opção 3.
    public static void addShampoo() {
        System.err.println("Adicionando shampoo...");
        petMachine.addShampoo();
    }

    // Trata as funções para a opção 2.
    public static void addWater() {
        System.err.println("Adicionando água...");
        petMachine.addWater();
    }


    





}
