
public class BetterGraph {
	
	Vertex[] arrayOfLists;
	int indexCounter = 0;
	boolean undirected = false;
	
	
	class Node {
		public int vertexId;
		public Node next;
		public Node(int vertixId, Node node){
			this.vertexId = vertixId;
			next = node;
		}
	}
	
	class Vertex{
		String name;
		Node adjList;
		Vertex(String name, Node aNode){
			this.name = name;
			adjList = aNode;
		}
	}
	
	public BetterGraph(int vCount, String graphType){
		if(graphType.equals("directed")){
			undirected = false;
		}
		arrayOfLists = new Vertex[vCount];
	}
	
	public void addVertext(String vertexName){
		arrayOfLists[indexCounter] = new Vertex(vertexName, null);
		indexCounter++;
	}
	
	public void addEdge(String srcVertexName, String destinationVertexName){
		int v1Id = indexForName(srcVertexName);
		int v2Id = indexForName(destinationVertexName);
		arrayOfLists[v1Id].adjList = new Node(v2Id, arrayOfLists[v1Id].adjList);
		if(undirected){
			arrayOfLists[v2Id].adjList = new Node(v1Id, arrayOfLists[v2Id].adjList);
		}
	}
	
	int indexForName(String name){
		for(int i = 0; i < arrayOfLists.length; i++){
			if(arrayOfLists[i].name.equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	public void print(){
		System.out.println();
		for(int i = 0; i < arrayOfLists.length; i++){
			System.out.print(arrayOfLists[i].name);
			for(Node aNode = arrayOfLists[i].adjList; aNode!=null; aNode = aNode.next){
				System.out.print(" --> " + arrayOfLists[aNode.vertexId].name);
			}
			System.out.println("\n");
		}
	}
	
}
