let result = solution([1, 1, 2, 3, 4, 5], 1);
console.log(result);

function solution(array, n) {
  var answer = 0;
  for (let i = 0; i < array.length; i++) {
    const element = array[i];

    if (n === element) {
      answer++;
    }
  }

  return answer;
}
