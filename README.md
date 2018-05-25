# AdjacencyLists

1.2
Vertex

This class is going to be used to represent an individual node in our graph

1. Create a new class in your project, called Vertex

2. This class must have the following attributes:
• vertexNumber, which is an integer
• colour, which is an integer
• adjacencies, which is a LinkedList containing Vertex objects. These are the Vertex objects
that are connected to the current Vertex by an edge.

3. It must also have a constructor that takes in an integer in order to set the vertexNumber property.

4. Note that the edge here is unweighted and undirected. This means that an edge between vertex 2 and vertex 5 is equally an edge between vertex 5 and vertex 2.

5. In addition to the constructor, the Vertex class must have the following methods:
• addAdjacency - takes in a Vertex object and adds it to the adjacencies LinkedList
• isAdjacent - takes in a Vertex object and returns true if the given Vertex is adjacent to the
current Vertex object, and false otherwise
• getDegree - returns the degree of the current Vertex

1.3
Graph
This class is going to be used to represent a collection of vertices.

1. Create a new class in your project, called Graph

2. This class must have the following attributes
• vertices, which is an ArrayList containing Vertex objects

3. The Graph class must have the following methods:
• addVertex - this method has no parameters. When called, it creates a new Vertex and adds
it to the vertices ArrayList. Note that in order to create a new Vertex, it needs to pass a
vertex number to the constructor of the Vertex object. Note that the size of the ArrayList
is the number of vertices that have already been added, so when you want to add a new
one, you can set its vertex number to be the size of the ArrayList.
• getVertex - takes in a vertex number and returns the Vertex object in that position in the
vertices ArrayList
• addEdge - this method takes in two vertex numbers and adds them to each others’ adja-
cency lists so that the vertices are adjacent

4. Since we do NOT want to make all the methods static, we use the Graph class’s constructor
instead of the main method. We then call the constructor from the main method. Since the
constructor is not static, this allows us to keep all the methods from having to be static.

