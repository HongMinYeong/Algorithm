//칼로리가 적은 순서대로 나타내는 정수배열 food
//대회를 위한 음식의 배치를 나타내는 문자열
//food[0]은 물
function solution(food) {
  var answer = '';
  for (let i = 1; i < food.length; i++) {
    answer += String(i).repeat(Math.floor(food[i] / 2));
  }
  // 가운데 0(물)을 넣고 reverse() 메서드를 이용해 대칭을 만들어준다.
  return answer + '0' + [...answer].reverse().join('');
}

console.log(solution([1, 7, 1, 2]));
// "111303111"
