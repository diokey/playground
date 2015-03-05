var assert = require('assert');

function hasUniqueCharacters(word) {
  if(word.length >= 256)
    return false;
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

describe('checks if a word has unique characters.', function() {
  it('It should return true if a word is made of unique characters and false otherwise', function() {
    assert.equal(hasUniqueCharacters('diokey'), true);
    assert.equal(hasUniqueCharacters('Olivier'), false);
    assert.equal(hasUniqueCharacters('Dusabimana'), false); 
  });
});
