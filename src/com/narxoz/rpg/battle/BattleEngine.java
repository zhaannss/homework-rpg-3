package com.narxoz.rpg.battle;

import com.narxoz.rpg.adapter.Combatant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class BattleEngine {

    private static BattleEngine instance;

    private Random random;

    private BattleEngine() {
        this.random = new Random();
    }

    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public BattleEngine setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public void reset() {
        this.random = new Random();
    }

    public EncounterResult runEncounter(List<Combatant> teamA, List<Combatant> teamB) {
        List<Combatant> aliveA = new ArrayList<>(teamA);
        List<Combatant> aliveB = new ArrayList<>(teamB);

        System.out.println("=== BATTLE START ===");
        printTeams(aliveA, aliveB);

        int round = 1;

        while (!aliveA.isEmpty() && !aliveB.isEmpty()) {
            System.out.println("\n--- Round " + round + " ---");

            // Team A attacks Team B
            executeAttacks(aliveA, aliveB, "Team A");

            // Remove dead from B
            aliveB.removeIf(c -> !c.isAlive());

            if (aliveB.isEmpty()) break;

            // Team B attacks Team A
            executeAttacks(aliveB, aliveA, "Team B");

            // Remove dead from A
            aliveA.removeIf(c -> !c.isAlive());

            System.out.println("  Survivors — Team A: " + names(aliveA) + " | Team B: " + names(aliveB));
            round++;
        }

        boolean teamAWon = !aliveA.isEmpty();
        List<Combatant> survivors = teamAWon ? aliveA : aliveB;
        String winnerName = teamAWon ? "Team A" : "Team B";

        System.out.println("\n=== BATTLE END ===");
        System.out.println("Winner: " + winnerName);
        System.out.println("Survivors: " + names(survivors));

        return new EncounterResult(winnerName, survivors, round - 1);
    }

    private void executeAttacks(List<Combatant> attackers, List<Combatant> defenders, String teamLabel) {
        for (Combatant attacker : attackers) {
            if (defenders.isEmpty()) break;

            // Pick the first living defender
            Combatant target = defenders.stream()
                    .filter(Combatant::isAlive)
                    .findFirst()
                    .orElse(null);

            if (target == null) break;

            int damage = attacker.getAttackPower();
            target.takeDamage(damage);

            System.out.printf("  [%s] %s attacks %s for %d damage%s%n",
                    teamLabel,
                    attacker.getName(),
                    target.getName(),
                    damage,
                    target.isAlive() ? "" : " — DEFEATED");
        }
    }

    private void printTeams(List<Combatant> teamA, List<Combatant> teamB) {
        System.out.println("Team A: " + names(teamA));
        System.out.println("Team B: " + names(teamB));
    }

    private String names(List<Combatant> combatants) {
        if (combatants.isEmpty()) return "(none)";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < combatants.size(); i++) {
            sb.append(combatants.get(i).getName());
            if (i < combatants.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}