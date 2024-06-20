import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] list = new String[N];
        String[] success = new String[N-1];

        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }

        for (int i = 0; i < N-1; i++) {
            success[i] = br.readLine();
        }
////////////////////// 풀이 ////////////////////////////////////////////
        // 이름의 등장 횟수를 세는 HashMap 생성
        HashMap<String, Integer> nameCount = new HashMap<>();

        // list 배열의 등장 횟수 세기
        for (String name : list) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        for (String name : success) {
            nameCount.put(name, nameCount.get(name) - 1);
        }


        String missing = "";
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) > 0) {
                missing = name;
                break;
            }
        }

        ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(missing);
    }
}
