function solution(maps) {
    let answer = 1;
    const visited = Array(maps.length).fill(0).map(() => Array(maps[0].length).fill(0));
    let queue = [];
    const dx = [-1, 1, 0, 0]; // 왼쪽 오른쪽
    const dy = [0, 0, -1, 1]; // 아래 위 
    const n = maps.length;  // 세로
    const m = maps[0].length; // 가로  

    queue.push([0, 0]); // 시작
    visited[0][0] = 1; //시작점 방문 처리 

    while (queue.length > 0) {
        let size = queue.length;

        for (let i = 0; i < size; i++) {
            let [x, y] = queue.shift();

            for (let j = 0; j < 4; j++) { // 상하좌우 탐색 
                let nx = x + dx[j];
                let ny = y + dy[j];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] === 1 && visited[nx][ny] === 0) {
                    if (nx == n - 1 && ny == m - 1) {
                        return ++answer;
                    }
                    queue.push([nx, ny]);
                    visited[nx][ny] = 1;
                }
            }
        }
        answer++;
    }

    return -1;
}
