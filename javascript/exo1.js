function hasUniqueCharacters(word) {
  var checker = [];

  for(var i=0, l= word.length; i<l; i++) {
    if (checker[word.charAt(i)]) {
      return false;
    } else {
      checker[word.charAt(i)] = true;
    }
  }

  return true;
}

console.log(hasUniqueCharacters('diokey'));
console.log(hasUniqueCharacters('Olivier'));
console.log(hasUniqueCharacters('Dusabiamana'));
