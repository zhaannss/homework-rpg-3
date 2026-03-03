# RPG Battle Engine — Homework 3

Homework 3 on design patterns.  
Heroes from HW1 and enemies from HW2 finally fight each other.

---

## What was done

- **Singleton** — one global `BattleEngine` for the whole game
- **Adapter** — heroes and enemies have different methods, adapters bring them to a unified `Combatant` interface
- **Battle** — round-based simulation, dead combatants are removed, winner is determined automatically

---

## Patterns

### Singleton
```java
BattleEngine e1 = BattleEngine.getInstance();
BattleEngine e2 = BattleEngine.getInstance();
System.out.println(e1 == e2); // true — always one object
```

### Adapter

| Combatant method | Hero (BaseCh) | Enemy (BaseEnemy) |
|------------------|---------------|-------------------|
| `getName()` | `getName()` | `getName()` |
| `getAttackPower()` | `getStrength()` | `getDamage()` |
| `takeDamage(int)` | `receiveDamage(int)` | `applyDamage(int)` |
| `isAlive()` | `isAlive()` | `!isDefeated()` |

---

## Connection to previous homeworks

- **HW1** — creating heroes via Factory
- **HW2** — creating enemies via Builder + Prototype
- **HW3** — battle between them via Singleton + Adapter

---

## Project structure

```
homework-rpg-3/
└── src/com/narxoz/rpg/
    ├── Main.java
    ├── diagrams/
    ├── adapter/
    │   ├── Combatant.java
    │   ├── HeroCombatantAdapter.java
    │   └── EnemyCombatantAdapter.java
    ├── battle/
    │   ├── BattleEngine.java
    │   └── EncounterResult.java
    ├── hero/
    └── enemy/
```

---

## How to run

```bash
javac -d out $(find src -name "*.java")
java -cp out com.narxoz.rpg.Main
```

---

## Sample output

```
=== Singleton Check ===
engine1 == engine2: true

║  BATTLE START  ║
Team A (Heroes):  Aragorn, Gandalf, Legolas
Team B (Enemies): Goblin, Ice Warrior, Shadow Guardian

--- Round 1 ---
[Heroes]  Aragorn attacks Goblin for 120 dmg — DEFEATED!
[Enemies] Shadow Guardian attacks Aragorn for 80 dmg

║  BATTLE END  ║
Winner: Team B (Enemies)
Survivors: Shadow Guardian
```

---

# RPG Battle Engine — Домашнее задание 3

Третье домашнее задание по паттернам проектирования.  
Герои из HW1 и враги из HW2 наконец сражаются друг с другом.

---

## Что сделано

- **Singleton** — один глобальный `BattleEngine` на всю игру
- **Adapter** — герои и враги имеют разные методы, адаптеры приводят их к единому интерфейсу `Combatant`
- **Бой** — пораундовая симуляция, мёртвые удаляются, победитель определяется автоматически

---

## Паттерны

### Singleton
```java
BattleEngine e1 = BattleEngine.getInstance();
BattleEngine e2 = BattleEngine.getInstance();
System.out.println(e1 == e2); // true — всегда один объект
```

### Adapter

| Метод Combatant | Hero (BaseCh) | Enemy (BaseEnemy) |
|-----------------|---------------|-------------------|
| `getName()` | `getName()` | `getName()` |
| `getAttackPower()` | `getStrength()` | `getDamage()` |
| `takeDamage(int)` | `receiveDamage(int)` | `applyDamage(int)` |
| `isAlive()` | `isAlive()` | `!isDefeated()` |

---

## Связь с предыдущими ДЗ

- **HW1** — создание героев через Factory
- **HW2** — создание врагов через Builder + Prototype
- **HW3** — бой между ними через Singleton + Adapter

---

## Структура проекта

```
homework-rpg-3/
└── src/com/narxoz/rpg/
    ├── Main.java
    ├── diagrams/
    ├── adapter/
    │   ├── Combatant.java
    │   ├── HeroCombatantAdapter.java
    │   └── EnemyCombatantAdapter.java
    ├── battle/
    │   ├── BattleEngine.java
    │   └── EncounterResult.java
    ├── hero/
    └── enemy/
```

---

## Запуск

```bash
javac -d out $(find src -name "*.java")
java -cp out com.narxoz.rpg.Main
```

---

## Пример вывода

```
=== Singleton Check ===
engine1 == engine2: true

║  BATTLE START  ║
Team A (Heroes):  Aragorn, Gandalf, Legolas
Team B (Enemies): Goblin, Ice Warrior, Shadow Guardian

--- Round 1 ---
[Heroes]  Aragorn attacks Goblin for 120 dmg — DEFEATED!
[Enemies] Shadow Guardian attacks Aragorn for 80 dmg

║  BATTLE END  ║
Winner: Team B (Enemies)
Survivors: Shadow Guardian
```

