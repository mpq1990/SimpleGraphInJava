
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(3);
		graph.addEdge(2, 1);
		graph.addEdge(2, 0);
		Object[] obj = graph.adj(2);
		for(int i = 0; i < obj.length; i++){
			System.out.println(obj[i]);
		}
	}

}
