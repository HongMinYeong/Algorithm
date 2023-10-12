//한변의 길이가 n인 정사각형 배열
function solution(n, arr1, arr2) {
  var answer = [];
  var temp = [];
  var result1 = [];
  var result2 = [];

  //2진법풀기
  for (let x of arr1) {
    temp = []; //temp 초기화시키기
    x = x.toString(2);
    for (let i = 0; i < n - x.length; i++) {
      //0001(2)
      temp.push(0);
    }
    temp.push(x);
    result1.push(temp.join(''));
  }
  for (let x of arr2) {
    temp = []; //temp 초기화시키기
    x = x.toString(2);
    for (let i = 0; i < n - x.length; i++) {
      //0001(2)
      temp.push(0);
    }
    temp.push(x);
    result2.push(temp.join(''));
  }
  //지도 합치기
  for (let i = 0; i < n; i++) {
    let wall = '';
    for (let j = 0; j < n; j++) {
      if (result1[i][j] == 0 && result2[i][j] == 0) {
        //둘다 벽아님
        wall += ' ';
      } else {
        wall += '#';
      }
    }
    answer.push(wall);
  }
  return answer;
}
solution(5, [9, 20, 28, 18, 11], [30, 1, 21, 17, 28]);
//["#####", "# # #", "### #", "#  ##", "#####"]
