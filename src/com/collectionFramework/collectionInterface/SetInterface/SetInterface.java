package com.collectionFramework.collectionInterface.SetInterface;

public class SetInterface {
}

//Comparison of all Classes in the Set interface

//| Feature                       | `HashSet`                                      | `LinkedHashSet`              | `TreeSet`                               | `EnumSet`                              |
//        | ----------------------------- | ---------------------------------------------- | ---------------------------- | --------------------------------------- | -------------------------------------- |
//        | **Ordering**                  | No guarantee                                   | Maintains insertion order    | Sorted in natural/custom order          | Natural order of enum constants        |
//        | **Duplicates**                | ❌ Not allowed                                  | ❌ Not allowed                | ❌ Not allowed                           | ❌ Not allowed                          |
//        | **Null Elements**             | ✅ One allowed                                  | ✅ One allowed                | ❌ Not allowed                           | ❌ Not allowed                          |
//        | **Underlying Structure**      | Hash table                                     | Hash table + linked list     | Red-Black Tree (balanced binary tree)   | Bit vector (internal bit masking)      |
//        | **Performance**               | Fast (O(1) for add/remove/contains)            | Slightly slower than HashSet | Slower (O(log n) for add/remove/search) | Extremely fast (bit-level performance) |
//        | **Thread-Safe**               | ❌ No (wrap with `Collections.synchronizedSet`) | ❌ No                         | ❌ No                                    | ❌ No                                   |
//        | **Use Case**                  | When order doesn't matter, high speed          | Maintain insertion order     | Need sorted elements                    | Efficient operations on enum types     |
//        | **Implements Set?**           | ✅ Yes                                          | ✅ Yes                        | ✅ Yes                                   | ✅ Yes                                  |
//        | **Allows Custom Comparator?** | ❌ No                                           | ❌ No                         | ✅ Yes                                   | ❌ No (order fixed by enum declaration) |
