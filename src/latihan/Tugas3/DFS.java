package latihan.Tugas3;

import java.util.*;

// class utama
public class DFS {
    // graf menggunakan HashMap
    private Map<String, List<String>> graph = new HashMap<>();

    // tambahkan hubungan antar nodenya.
    public void addEdge(String node, String neighbor) {
        graph.computeIfAbsent(node, k -> new ArrayList<>()).add(neighbor);

    }

    // fungsi DFS rekrusif
    public boolean dsf(String current, String target, Set<String> visited) {
        System.out.println("Mengunjungi Node : " + current);
        if (current.equals(target)) {
            System.out.println("Ditemukan Node : " + target);
            return true;
        }

        visited.add(current);

        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dsf(neighbor, target, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // main function
    public static void main(String[] args) {
        DFS dfsGraph = new DFS();
        // menentukan hubungan antar node
        dfsGraph.addEdge("a1", "a2");
        dfsGraph.addEdge("a1", "a3");
        dfsGraph.addEdge("a2", "a4");
        dfsGraph.addEdge("a2", "a5");
        dfsGraph.addEdge("a3", "a6");
        dfsGraph.addEdge("a3", "a7");

        // memulai pencarian dari node a1 ke node yang dicari dalam variabel target
        String target = "a6";
        Set<String> visited = new HashSet<>();
        boolean found = dfsGraph.dsf("a1", target, visited);

        if (!found) {
            System.out.println("Node " + target + " tidak ditemukan");
        }
    }
}
