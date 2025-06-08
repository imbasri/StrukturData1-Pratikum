package latihan.Tugas3;

import java.util.*;

// class utama
public class BFS {
    private Map<String, List<String>> graph = new HashMap<>();

    public void addEdge(String node, String neighbor) {
        graph.computeIfAbsent(node, k -> new ArrayList<>()).add(neighbor);
    }

    public boolean bfs(String start, String target) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.println("Mengunjungi " + current);

            if (current.equals(target)) {
                System.out.println("Ditemukan dari node " + target);
                return true;
            }

            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }

    // main function
    public static void main(String[] args) {
        BFS bfsGraph = new BFS();

        // menentukkan hubungan antar node
        bfsGraph.addEdge("a1", "a2");
        bfsGraph.addEdge("a1", "a3");
        bfsGraph.addEdge("a2", "a4");
        bfsGraph.addEdge("a2", "a5");
        bfsGraph.addEdge("a3", "a6");
        bfsGraph.addEdge("a3", "a7");

        // memulai pencarian dari node a1 ke node yang ditarget
        String target = "a4";
        boolean found = bfsGraph.bfs("a1", target);

        if (!found) {
            System.out.println("Node " + target + " tidak ditemukan");
        }
    }
}
