// function solution(maps) {
//   var time = 0;
//   var answer;
//   const dirx = [-1, 1, 0, 0]; // 왼쪽 오른쪽
//   const diry = [0, 0, -1, 1]; // 아래 위
//   const graph = maps.map((layer) => Array.from(layer));
//   // 시작점 찾기
//   var start = [];
//   for (let i = 0; i < graph.length; i++) {
//     for (let j = 0; j < graph[0].length; j++) {
//       if (graph[i][j] === 'S') {
//         start.push(i, j);
//       }
//     }
//   }

//   var path = []; // 지나가는 길
//   var visited = Array.from({ length: graph.length }, () =>
//     Array(graph[0].length).fill(0)
//   );
//   path.push(...start);
//   visited[start[0]][start[1]] = 1;
//   // 시작부터 -> Labor
//   while (path.length > 0) {
//     const x = path.shift();
//     const y = path.shift();

//     if (graph[x][y] === 'L') {
//       start.shift();
//       start.shift(); // 기존에 시작점 빼고 labor를 시작점으로
//       start.push(x, y); //L 위치 저장
//       path = []; //초기화
//       break;
//     }

//     for (let i = 0; i < 4; i++) {
//       const nx = x + dirx[i];
//       const ny = y + diry[i];

//       if (
//         //방문하지 않은 곳 방문할 때
//         nx >= 0 &&
//         nx < graph.length &&
//         ny >= 0 &&
//         ny < graph[0].length &&
//         !visited[nx][ny]
//       ) {
//         if (graph[nx][ny] !== 'X') {
//           // 벽이 아니라면,
//           visited[nx][ny] = true;
//           // console.log('벽이아니야아앗', visited);
//           path.push(nx, ny);
//           // console.log('시간추가!', answer);
//           time++;
//         }
//       }
//     }
//   }
//   console.log('Labor까지', answer);
//   // if (time === 0) {

//   // }
//   // Labor부터 -> Exit
//   // console.log('레바 시작지점', start);
//   path.push(...start);
//   // console.log('Exit 드가자', visited);
//   var time2 = 0;
//   while (path.length > 0) {
//     const x = path.shift();
//     const y = path.shift();
//     console.log(x, y);
//     if (graph[x][y] === 'E') {
//       //Exit 라면,
//       answer = time + time2;
//       break;
//     }
//     for (let i = 0; i < 4; i++) {
//       // 상하좌우 탐색
//       const nx = x + dirx[i];
//       const ny = y + diry[i];

//       if (
//         nx >= 0 &&
//         nx < graph.length &&
//         ny >= 0 &&
//         ny < graph[0].length &&
//         !visited[nx][ny] //방문 안했을 때
//       ) {
//         if (graph[nx][ny] !== 'X') {
//           //벽이 아니당
//           visited[nx][ny] = 1;
//           path.push(nx, ny);
//           // console.log('저벅저벅,...', path);
//           // console.log('path는', path);
//           time2++;
//           // console.log('시간추가!', answer);
//         } else {
//           // console.log('벽이다! 지금 위치는 ', [nx, ny]);
//         }
//       }
//     }
//   }
//   // console.log('레바까지 길이는', time);
//   // console.log('출구까지 길이는', time2);
//   return answer ? answer : -1;
// }

function solution(maps) {
  // var time = 0;
  var answer;
  var center;
  const dirx = [-1, 1, 0, 0];
  const diry = [0, 0, -1, 1];
  const graph = maps.map((layer) => Array.from(layer));
  // console.log('graph는', graph);
  var start = [];
  for (let i = 0; i < graph.length; i++) {
    for (let j = 0; j < graph[0].length; j++) {
      if (graph[i][j] === 'S') {
        start.push(i, j);
      }
    }
  }
  // console.log('시작', start);
  var path = [];
  var visited = Array.from({ length: graph.length }, () =>
    Array(graph[0].length).fill(0)
  );

  path.push(...start, (selfTime = 0));
  visited[start[0]][start[1]] = 1;
  while (path.length > 0) {
    // console.log('visited:::', visited);
    const x = path.shift();
    const y = path.shift();
    const selfTime = path.shift();

    if (graph[x][y] === 'L') {
      start.shift();
      start.shift();
      start.push(x, y);
      path = [];
      center = selfTime;
      visited = Array.from({ length: graph.length }, () =>
        Array(graph[0].length).fill(0)
      );
      visited[start[0]][start[1]] = 1;
      break;
    }

    for (let i = 0; i < 4; i++) {
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
          visited[nx][ny] = 1;
          path.push(nx, ny, selfTime + 1);
        }
      }
    }
  }
  if (!center) {
    //center가 undefined일때
    return (answer = -1);
  }
  path.push(...start, center); //레버까지 시간
  // console.log('저벅저벅,,,,');
  while (path.length > 0) {
    const x = path.shift();
    const y = path.shift();
    const selfTime = path.shift();
    if (graph[x][y] === 'E') {
      answer = selfTime;
      break;
    }
    for (let i = 0; i < 4; i++) {
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
          visited[nx][ny] = 1;
          path.push(nx, ny, selfTime + 1);
        }
      }
    }
  }
  return answer ? answer : -1;
}

// console.log(solution(['LOOXS', 'OOOOX', 'OOOOO', 'OOOOO', 'EOOOO']));
// console.log(solution(['SOOXX', 'XXOXX', 'XXLXX', 'XXOOX', 'XXXXE']));
console.log(solution(['SOOOL', 'XXXXO', 'OOOOO', 'OXXXX', 'OOOOE']));
