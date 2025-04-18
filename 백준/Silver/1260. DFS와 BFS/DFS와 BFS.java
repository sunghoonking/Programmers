  import java.util.*;
  public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int vertex = scanner.nextInt();
    int trunk = scanner.nextInt();
    int startNode = scanner.nextInt();
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i <= vertex; i++) {
      graph.add(new ArrayList<>());
    }
    for (int i = 0; i < trunk; i++) {
      int start = scanner.nextInt();
      int end = scanner.nextInt();
      graph.get(start).add(end);
      graph.get(end).add(start); // ★ 요 줄 추가!
    }
    for (int i = 1; i <= vertex; i++) {
      Collections.sort(graph.get(i)); // 작은 노드부터 방문하려면 정렬
    }
    dfs(startNode, graph, new boolean[vertex + 1]);
      System.out.println(); 
    bfs(startNode, graph, new boolean[vertex + 1]);
  }
  public static void dfs(int startNode, List<List<Integer>> graph, boolean[] visited) {
    visited[startNode] = true; // 1 방문처리
    System.out.print(startNode + " "); // 2 방문한 정점 출력
    for (int i = 0; i < graph.get(startNode).size(); i++) {
      int nextNode = graph.get(startNode).get(i);
      if (!visited[nextNode]) {
        dfs(nextNode, graph, visited);
      }
    }
  }
  public static void bfs(int startNode, List<List<Integer>> graph, boolean[] visited) {
    Queue<Integer> queue = new LinkedList<>();  // BFS는 Queue 사용
    visited[startNode] = true;
    queue.offer(startNode); // 시작 노드를 큐에 넣기
    while (!queue.isEmpty()) {
      int current = queue.poll(); // 큐에서 꺼냄
      System.out.print(current + " "); // 방문한 노드 출력

      for (int next : graph.get(current)) {
        if (!visited[next]) {
          visited[next] = true;
          queue.offer(next); // 다음 노드 큐에 추가
        }
      }
    }
  }}