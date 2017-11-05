
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
		
		
		BetterGraph bg = new BetterGraph(5, "directed");
		bg.addVertext("State1");
		bg.addVertext("State2");
		bg.addVertext("State3");
		bg.addVertext("State4");
		bg.addVertext("State5");
		
		bg.addEdge("State1", "State2");
		bg.addEdge("State1", "State5");
		bg.addEdge("State2", "State5");
		bg.addEdge("State3", "State4");
		bg.addEdge("State4", "State3");
		bg.addEdge("State5", "State1");
		bg.addEdge("State5", "State2");
		
		bg.print();
	}

}
