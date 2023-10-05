function solution(array) {
  // 최빈값이 여러개면 -1 return
  // 최빈값 return
  const aObject = array.reduce((acc, cur) => {
    acc.hasOwnProperty(cur) ? (acc[cur] += 1) : (acc[cur] = 1);
    return acc;
  }, {});

  let maxCount = 0; // 가장 많이 나타난 횟수
  let answer = null; // 최빈값 초기값을 null로 설정

  for (const key in aObject) {
    if (aObject[key] > maxCount) {
      maxCount = aObject[key];
      answer = Number(key); // key를 숫자로 변환하여 저장
    } else if (aObject[key] === maxCount) {
      // 최빈값이 여러 개인 경우
      answer = -1;
    }
  }

  console.log(typeof answer); // 'number'
  return answer;
}

solution([1, 2, 3, 3, 3, 4]);
