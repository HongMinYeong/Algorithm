function solution(wallpaper) {
  var answer = [];
  let x = [];
  let y = [];

  for (let i = 0; i < wallpaper.length; i++) {
    for (let j = 0; j < wallpaper[i].length; j++) {
      if (wallpaper[i][j] === '#') {
        x.push(i);
        y.push(j);
      }
    }
    x.sort((a, b) => a - b);
    y.sort((a, b) => a - b);
  }
  console.log('x는', x);
  console.log('y는', y);
  answer.push(x[0]);
  answer.push(y[0]);
  const end_x = x.pop() + 1;
  const end_y = y.pop() + 1;
  answer.push(end_x);
  answer.push(end_y);
  return answer;
  //   return answer;
}
//점 S(lux,luy) (시작점) 점 E(rdx,rdy) (끝점)
//드래그 한 거리 -> |rdx-lux|+|rdy-luy|로 정의

// solution(['.#...', '..#..', '...#.']);
// //[0,1,3,4]
solution([
  '..........',
  '.....#....',
  '......##..',
  '...##.....',
  '....#.....',
]);
//[1,3,5,8]
//제일 왼쪽에 있으면서 제일 위쪽부터 시작
// 제일 위쪽(x), 제일 왼쪽(y)
