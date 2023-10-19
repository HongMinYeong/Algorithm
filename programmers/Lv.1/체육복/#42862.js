// function solution(n, lost, reserve) {
//   var answer = 0;
//   var arr = new Array(5);
//   console.log(arr);
//   for (let i = 0; i < n; i++) {
//     console.log('---------------------');
//     for (let j of lost) {
//       console.log(i + 1, '번째');
//       console.log('j는', j);
//       if (i + 1 == j) {
//         arr[i] = 0;
//         break;
//       } else {
//         arr[i] = 1;
//         continue;
//       }
//     }
//     console.log(arr);
//   }

//   return answer;
// }
//전체학생수 n
//도난당한 학생들의 번호가 담긴 배열 lost
//여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve
//체육 수업을 들을 수 있는 학생의 최댓값 return

//n은 2명이상 30명이하
//lost.length는 1~n
//reserve.length 1~n

// solution(5, [2, 4], [1, 3, 5]); //5
// solution(5, [2, 4], [3]); //4
// solution(3, [3], [1]); //2

function solution(n, lost, reserve) {
  // 중복 제거
  const realLost = lost.filter((l) => !reserve.includes(l));
  console.log(realLost);
  let realReserve = reserve.filter((r) => !lost.includes(r));
  console.log(realReserve);
  // 빌려줄 수 있는 경우 찾기
  let borrowed = 0;
  realLost.forEach((l) => {
    const before = l - 1;
    const after = l + 1;
    if (realReserve.includes(before)) {
      realReserve = realReserve.filter((r) => r !== before);
      borrowed += 1;
    } else if (realReserve.includes(after)) {
      realReserve = realReserve.filter((r) => r !== after);
      borrowed += 1;
    }
  });
  return n - realLost.length + borrowed;
}

solution(5, [2, 4], [1, 3, 5]); //5
