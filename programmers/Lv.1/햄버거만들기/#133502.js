function solution(ingredient) {
  var answer = 0;
  const isSearch = []; //배열안에서 조사끝난 숫자들 넣기
  for (var i of ingredient) {
    isSearch.push(i);
    console.log(isSearch);
    if (isSearch.slice(-4).join('') === '1231') {
      //뒤에부터 4글자씩 문자열변환후 1231이랑 같은지
      isSearch.splice(-4); //같으면 1231 문자열 삭제 (-4인덱스포함 그 이후 모두 제거 )
      answer++; //삭제하고 answer 하나 올려주기
      console.log(answer);
    }
  }
  return answer;
}
//빵(1)-야채(2)-고기(3)-빵(1)
//console.log 넣어서 채점하면 출력크기 초과됨
