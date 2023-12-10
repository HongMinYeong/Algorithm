const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];
let list = [];
let list2 = [];

rl.on('line', function (line) {
  input.push(line); //3 4 0000 어쩌고 ~
}).on('close', function () {
  let tmp = input[0].split(' ').map((el) => parseInt(el));
  let n = tmp[0];
  let m = tmp[1];

  //A배열
  let arr = input.slice(1, n + 1);
  //B배열
  let arr2 = input.slice(n + 1);

  //A,B 배열을 이중배열로 만들고 int형으로 변환
  for (let i = 0; i < arr.length; i++) {
    list.push(arr[i].split('').map((el) => parseInt(el)));
    list2.push(arr2[i].split('').map((el) => parseInt(el)));
  }

  solution(n, m, list, list2);

  process.exit();
});
function solution(n, m, list, list2) {
  let answer = 0;

  // 3x3 부분 배열을 순회하면서 list와 list2의 해당 부분이 다를 경우 뒤집기 작업을 수행
  for (let i = 0; i < n - 2; i++) {
    for (let j = 0; j < m - 2; j++) {
      if (list[i][j] !== list2[i][j]) {
        // 3x3 행렬의 가장 왼쪽 위의 값만 비교하여 다를 경우, flip 함수 호출
        flip(i, j);
        answer += 1; // 뒤집기 작업 횟수 증가
      }
    }
  }

  // 모든 행과 열을 순회하면서 list와 list2가 같은지 확인
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < m; j++) {
      if (list[i][j] !== list2[i][j]) {
        // 만약 두 배열이 다르다면, 뒤집어서 일치시킬 수 없음
        answer = -1;
        break;
      }
    }
  }

  // 최종 결과 출력
  console.log(answer);
}

// 뒤집는 함수 -> 3 * 3 행렬씩 뒤집음 1이면 0 0이면 1
function flip(x, y) {
  for (let i = x; i < x + 3; i++) {
    for (let j = y; j < y + 3; j++) {
      list[i][j] = 1 - list[i][j];
    }
  }
}
