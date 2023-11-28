function solution(maps) {
  var answer = 0;
  const dirx = [-1, 1, 0, 0]; // 왼쪽 오른쪽
  const diry = [0, 0, -1, 1]; // 아래 위
  const graph = maps.map((layer) => Array.from(layer));
  // 시작점 찾기
  var start = [];
  var labor = [];
  var exit = [];
  for (i = 0; i < graph.length; i++) {
    for (j = 0; j < graph[0].length; j++) {
      if (graph[i][j] === 'S') {
        start.push(i, j);
      }
      if (graph[i][j] === 'L') {
        labor.push(i, j);
      }
      if (graph[i][j] === 'E') {
        exit.push(i, j);
      }
    }
  }
  // console
  var path = []; // 지나가는 길
  var visited = Array.from({ length: graph.length }, () =>
    Array(graph[0].length).fill(false)
  );

  path.push(...start);
  visited[start[0]][start[1]] = true;

  // 시작부터 -> Labor
  while (path.length > 0) {
    const x = path.shift();
    const y = path.shift();

    if (graph[x][y] === 'L') {
      start.shift();
      start.shift(); // 기존에 시작점 빼고 labor를 시작점으로
      start.push(x, y);
      break;
    }

    for (i = 0; i < 4; i++) {
      const nx = x + dirx[i];
      const ny = y + diry[i];

      if (
        nx >= 0 &&
        nx < graph.length &&
        ny >= 0 &&
        ny < graph[0].length &&
        !visited[nx][ny]
      ) {
        if (graph[nx][ny] !== 'X') {
          visited[nx][ny] = true;
          path.push(nx, ny);
          //   console.log('시간추가!', answer);
          answer++;
        }
      }
    }
  }
  //   console.log('Labor까지', answer);
  // Labor부터 -> Exit
  const path2 = []; // 지나가는 길
  const visited2 = Array.from({ length: graph.length }, () =>
    Array(graph[0].length).fill(false)
  );
  //   console.log('레바 시작지점', start);
  path2.push(...start);
  visited[start[0]][start[1]] = true;
  //   console.log(path2);

  while (path2.length > 0) {
    const x = path2.shift();
    const y = path2.shift();
    // console.log(x, y);
    if (graph[x][y] === 'E') {
      break;
    }
    for (i = 0; i < 4; i++) {
      const nx = x + dirx[i];
      const ny = y + diry[i];

      if (
        nx >= 0 &&
        nx < graph.length &&
        ny >= 0 &&
        ny < graph[0].length &&
        !visited[nx][ny]
      ) {
        if (graph[nx][ny] !== 'X') {
          visited[nx][ny] = true;
          path2.push(nx, ny);
          answer++;
          //   console.log('시간추가!', answer);
        }
      }
    }
  }
  if (answer === 0) {
    answer = -1;
  }
  return answer;
}

console.log(solution(['LOOXS', 'OOOOX', 'OOOOO', 'OOOOO', 'EOOOO']));
console.log(solution(['SOOOL', 'XXXXO', 'OOOOO', 'OXXXX', 'OOOOE']));
