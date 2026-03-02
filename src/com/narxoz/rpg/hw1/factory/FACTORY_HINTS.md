# Factory Pattern Implementation Hints

This package is where your factory implementations should live.

## Factory Method Pattern (Character Creation)

### The Problem
You need to create different character types, but the client code shouldn't know about concrete classes like `Warrior`, `Mage`, or `Archer`.

### Questions to Answer
1. **Who should be responsible for creating characters?**
   - A factory class? An abstract creator? The character itself?

2. **How do you avoid if-else chains?**
   ```java
   // BAD - violates Open/Closed Principle:
   if (type.equals("warrior")) {
       return new Warrior();
   } else if (type.equals("mage")) {
       return new Mage();
   }
   ```

   Think: Can inheritance help here?

3. **What is the "factory method"?**
   - It's a method that returns a Product (Character)
   - Subclasses override it to return specific products

### Possible Approaches

#### Approach 1: Abstract Creator with Concrete Factories
```
CharacterFactory (abstract)
├── WarriorFactory
├── MageFactory
└── ArcherFactory
```

#### Approach 2: Parameterized Factory Method
```
CharacterFactory
└── createCharacter(CharacterType type)
```

#### Approach 3: Static Factory Methods on Character
```
Character
├── createWarrior()
├── createMage()
└── createArcher()
```

**Which is most aligned with Factory Method pattern? Research and decide!**

---

## Abstract Factory Pattern (Equipment Sets)

### The Problem
You need to create **families** of related objects (Weapon + Armor) that belong together thematically.

### Key Insight
Abstract Factory ensures consistency: if you get a Medieval weapon, you MUST get Medieval armor too.

### Questions to Answer
1. **What is a "product family" here?**
   - Medieval family: Iron Sword + Plate Armor
   - Magic family: Wizard Staff + Enchanted Robes
   - Ranger family: Longbow + Leather Armor

2. **How do you guarantee consistency?**
   - Think: If one factory creates both weapon AND armor, they'll match!

3. **What's the structure?**
   ```
   EquipmentFactory (interface or abstract class)
   ├── createWeapon()
   └── createArmor()

   Concrete Factories:
   ├── MedievalEquipmentFactory
   ├── MagicEquipmentFactory
   └── RangerEquipmentFactory
   ```

### Implementation Steps
1. Create abstract factory interface/class with methods:
   - `Weapon createWeapon()`
   - `Armor createArmor()`

2. Create concrete factories (one per theme):
   - Each factory creates matching weapon + armor pair

3. Client code works with factory interface, not concrete factories

---

## How the Patterns Work Together

```
Main.java
│
├─> Uses CharacterFactory to create characters (Factory Method)
│   └─> Returns: Warrior, Mage, Archer, etc.
│
└─> Uses EquipmentFactory to create gear (Abstract Factory)
    └─> Returns: Matching Weapon + Armor sets
```

---

## Key Design Principles

### Open/Closed Principle
- **Open for extension**: Easy to add new character types or equipment themes
- **Closed for modification**: Don't change existing code when adding new types

### Dependency Inversion Principle
- Depend on abstractions (interfaces), not concrete classes
- `Main.java` should reference `Character`, not `Warrior`
- `Main.java` should reference `EquipmentFactory`, not `MedievalEquipmentFactory`

### Single Responsibility Principle
- Factories are responsible ONLY for object creation
- Characters are responsible ONLY for character behavior
- Separation of concerns!

---

## Common Mistakes to Avoid

❌ **Using if-else in client code**
```java
// This defeats the purpose!
if (type.equals("medieval")) {
    factory = new MedievalEquipmentFactory();
}
```

❌ **Not using interfaces**
```java
// Bad:
MedievalEquipmentFactory factory = new MedievalEquipmentFactory();

// Good:
EquipmentFactory factory = new MedievalEquipmentFactory();
```

❌ **Creating mismatched equipment**
```java
// Abstract Factory should prevent this:
Weapon weapon = medievalFactory.createWeapon();
Armor armor = magicFactory.createArmor(); // MISMATCH!
```

---

## Testing Your Design

Ask yourself:
1. Can I add a new character class WITHOUT modifying existing classes? ✓
2. Can I add a new equipment theme WITHOUT modifying existing factories? ✓
3. Is it impossible to create mismatched equipment? ✓
4. Does Main.java depend on abstractions, not concrete classes? ✓

If you answered yes to all, you're on the right track! 🎯

---

## Need More Help?

Resources:
- Refactoring Guru: Factory Method
- Refactoring Guru: Abstract Factory
- "Head First Design Patterns" book
- Draw UML diagrams as you plan!

Remember: **Understanding the problem is more important than memorizing the solution.**
