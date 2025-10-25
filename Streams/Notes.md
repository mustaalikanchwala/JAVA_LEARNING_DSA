Streams in Java are a way to process collections of data (like lists or arrays) in a simple, clean, and efficient manner. 
Think of a stream as a pipeline where data flows through and gets transformed step by step.

Aspect        |  Collections                                   |  Streams                                           
--------------+------------------------------------------------+----------------------------------------------------
Purpose       |  Store and group data in memory                |  Perform operations like filtering, mapping on data
Storage       |  Hold all elements in memory (List, Set, Map)  |  Don't store data; process from a source           
Modification  |  Can add or remove elements                    |  Cannot modify; only produce results               
Reusability   |  Can traverse multiple times                   |  Consumable once; must recreate to use again       
Iteration     |  External iteration (you write loops)          |  Internal iteration (Stream API handles it)        
Computation   |  All elements computed before adding           |  Elements computed on demand (lazy)                
Package       |  java.util package                             |  java.util.stream package                          

Usecases for Streams
1. Filtering
2. Mapping
3. Aggregation
4. Searching
5. Iteration    

Stream Pipeline
Source => intermediate Opertion => Terminal Operation
intermediate operation will excute only if terminal operation are there 
intermediate operation are lazy

collect(Collectors.toList()) returns a mutable list (usually an ArrayList) that you can modify after creation. This means you can add, remove, or change elements in the resulting list.​

toList() returns an immutable list that cannot be modified. If you try to add or remove elements, it will throw an UnsupportedOperationException.


Method                      |  Syntax                          |  Use Case                                            |  Example                                  
----------------------------+----------------------------------+------------------------------------------------------+-------------------------------------------
From Collections            |  collection.stream()             |  Create stream from List, Set, or other collections  |  list.stream()                            
From Arrays                 |  Arrays.stream(array)            |  Create stream from an array                         |  Arrays.stream(arr)                       
From Values                 |  Stream.of(val1, val2, ...)      |  Create stream from individual values                |  Stream.of("a", "b", "c")                 
From Array                  |  Stream.of(array)                |  Create stream from array reference                  |  Stream.of(arr)                           
Empty Stream                |  Stream.empty()                  |  Create empty stream to avoid null                   |  Stream.empty()                           
Stream Builder              |  Stream.builder()                |  Build stream using builder pattern                  |  Stream.<String>builder().add("a").build()
Infinite Stream (iterate)   |  Stream.iterate(seed, function)  |  Generate infinite stream by applying function       |  Stream.iterate(0, n -> n + 2).limit(5)   
Infinite Stream (generate)  |  Stream.generate(supplier)       |  Generate infinite stream from supplier              |  Stream.generate(() -> "Hello").limit(3)  
From String                 |  string.chars()                  |  Create stream of characters from String             |  "Hello".chars()                          
From Files                  |  Files.lines(path)               |  Create stream of lines from text file               |  Files.lines(Paths.get("file.txt"))       