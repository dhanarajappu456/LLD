Concurrency issue in booking the seat

can be solved with locking mechanism 

can follow 

1)pessimistic locking - 
2)optimistic locking

# we need optimistic lock here
Best is to use optimistic - since user may read a set(select a seat) but he  might immediately change  his mind to selecte another seats, in which locks will be held for all the prev seats as well , which makes other users 
not able to access the seat , at the same time . There for pessimistic  is not efficient and profitable form business pov ,hence we need optimistic lock , here , 


Pessimistic locking and optimistic locking are two strategies used in concurrent programming and database systems to manage access to shared resources, such as database records, in a multi-user environment. These strategies differ in their approaches to handling concurrent access and potential conflicts.

### Pessimistic Locking:

1. **Definition:**
   - Pessimistic locking assumes that conflicts between transactions are likely to occur. As a result, it locks the resource (e.g., a database record) as soon as a transaction begins, and it holds the lock until the transaction completes.

2. **Locking Mechanism:**
   - Exclusive locks are typically used to prevent other transactions from accessing the same resource simultaneously.
  
3. **Concurrency Control:**
   - Pessimistic locking reduces concurrency because only one transaction can access a resource at a time. Other transactions must wait until the lock is released.

4. **Usage:**
   - Commonly used in situations where conflicts are expected to be frequent, and the cost of conflict resolution is high.

### Optimistic Locking:

1. **Definition:**
   - Optimistic locking assumes that conflicts are infrequent. Instead of locking a resource during the entire transaction, it allows multiple transactions to access and modify the resource concurrently.

2. **Locking Mechanism:**
   - No exclusive locks are held during the read phase. Instead, a version number or timestamp is associated with the resource.

3. **Concurrency Control:**
   - During the update phase, the system checks if the resource has been modified by another transaction since it was read. If no modifications are detected, the update is allowed. If a conflict is detected, the system takes appropriate action (e.g., rejecting the update).

4. **Usage:**
   - Suitable for situations where conflicts are expected to be rare, and the cost of conflict resolution is low.

### Comparison:

- **Concurrency:**
  - Pessimistic locking reduces concurrency by holding locks for the entire transaction, potentially causing contention.
  - Optimistic locking allows higher concurrency during the read phase but requires conflict resolution during the update phase.

- **Resource Access:**
  - Pessimistic locking prevents other transactions from accessing the resource until the lock is released.
  - Optimistic locking allows multiple transactions to read the resource concurrently but resolves conflicts during updates.

- **Conflict Resolution:**
  - Pessimistic locking resolves conflicts by preventing them through exclusive locks.
  - Optimistic locking resolves conflicts by detecting changes made by other transactions during the update phase.

- **Suitability:**
  - Pessimistic locking is suitable for situations with frequent conflicts and high conflict resolution costs.
  - Optimistic locking is suitable when conflicts are rare, and the cost of conflict resolution is low.


